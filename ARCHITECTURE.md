# ARCHITECTURE — SolidityDetection 架构与检测原理

> 版本：v1.1  
> 基于 [SmartCheck](https://github.com/smartdec/smartcheck) 理论框架实现

---

## 目录

1. [概述](#概述)
2. [整体架构](#整体架构)
3. [检测流水线](#检测流水线)
4. [核心组件](#核心组件)
5. [规则库设计](#规则库设计)
6. [漏洞检测原理](#漏洞检测原理)
7. [命令行与输出](#命令行与输出)
8. [技术栈与限制](#技术栈与限制)
9. [扩展指南](#扩展指南)

---

## 概述

SolidityDetection 是一个针对以太坊智能合约 Solidity 源码的**静态安全漏洞检测工具**。其核心思路是：

> **源码 → ANTLR 语法树 → XML DOM 中间表示 → XPath 规则匹配 → 定位漏洞代码位置**

工具不依赖符号执行、污点分析或形式化验证，而是通过声明式的 XPath 模式在语法树上匹配已知的危险代码结构，实现轻量、快速的漏洞筛查。

### 三大核心模块

| 模块 | 职责 |
|------|------|
| **XML 中间表示** | 将 ANTLR 语法树转换为可 XPath 查询的 DOM 树 |
| **XPath 规则库** | 以 XML 形式定义 26 条规则、56 个检测模式 |
| **漏洞匹配检测** | 对每条规则的每个 Pattern 执行 XPath 查询并输出命中结果 |

### 版本支持

⚠️ 本工具主要面向 **Solidity 0.4 ~ 0.6** 版本，**不支持 0.8 及以上版本**。对新版本语法的检测结果可能不准确。

---

## 整体架构

```
┌─────────────────────────────────────────────────────────────────┐
│                        CLI 入口层                                │
│              DetectionOne（单文件详情）                            │
│              DetectionAll（批量汇总）                              │
└──────────────────────────┬──────────────────────────────────────┘
                           │
┌──────────────────────────▼──────────────────────────────────────┐
│                        扫描层                                    │
│   DirectoryAnalysisDefault  →  递归扫描目录中的 .sol / .vy 文件   │
│   DirectoryAnalysisCombined →  合并 Solidity 与 Vyper 扫描结果    │
└──────────────────────────┬──────────────────────────────────────┘
                           │
          ┌────────────────┴────────────────┐
          │                                 │
┌─────────▼──────────┐           ┌──────────▼─────────┐
│      建树层         │           │       规则层        │
│  TreeFactoryDefault│           │   RulesXml          │
│  ParseTreeCached   │           │   RulesCached       │
│  DocumentTreeCached│           │   solidity-rules.xml│
│  SearchableTree    │           └──────────┬─────────┘
└─────────┬──────────┘                      │
          │                                 │
          └────────────────┬────────────────┘
                           │
┌──────────────────────────▼──────────────────────────────────────┐
│                        分析层                                    │
│   TreeAnalysisDefault  →  逐规则、逐 Pattern 执行 XPath 匹配      │
│   ReportDefault        →  格式化输出检测结果                       │
└─────────────────────────────────────────────────────────────────┘
```

### 数据流

```
Solidity 源码 (.sol)
    │
    ▼  ANTLR 词法/语法分析 (SolidityLexer + SolidityParser)
ParseTree (语法树)
    │
    ▼  DocumentTreeBasic 遍历转换
XML DOM 中间表示
    │
    ▼  SearchableTreeDefault + XPath 查询
命中节点 → 映射回 ANTLR ParserRuleContext
    │
    ▼
输出：规则 ID、模式 ID、风险等级、行号、列号、代码片段
```

---

## 检测流水线

### 第一步：词法与语法分析

源码文件通过 `SourceFile` 读取，`ParseTreeBasicSolidity` 使用 ANTLR 4 完成解析：

```
SourceFile (.sol)
  → SolidityLexer（词法分析，生成 Token 流）
  → SolidityParser（语法分析，生成 ParseTree）
  → sourceUnit() 根节点
```

语法定义位于项目根目录的 `Solidity.g4`，由 ANTLR 生成 `SolidityLexer.java` 和 `SolidityParser.java`。

**关键类：**

- `ParseTreeBasicSolidity` — Solidity 解析入口
- `ParseTreeBasicVyper` — Vyper 解析入口（`.vy` 文件）
- `ParseTreeCached` — 解析结果缓存

### 第二步：语法树 → XML 中间表示

`DocumentTreeBasic` 使用 `ParseTreeWalker` 遍历 ANTLR 语法树，构建 W3C DOM 文档：

| ANTLR 节点类型 | XML 表示 |
|---------------|----------|
| 规则节点（ParserRuleContext） | XML 元素，元素名 = 语法规则名（如 `functionCall`、`expression`） |
| 终结符（TerminalNode） | 文本节点，内容为 Token 文本 |

`TerminalTransformer` 会对字符串字面量去掉首尾引号，便于 XPath 精确匹配。

同时维护 **Tree ↔ Node 双向映射**（`DocumentTree.Info.elements()` / `ruleNodes()`），使 XPath 命中后能回溯到原始 ANTLR 节点，从而获取源码行号和列号。

**关键类：**

- `DocumentTreeBasic` — 语法树到 DOM 的转换
- `DocumentTreeCached` — DOM 构建结果缓存
- `TerminalTransformer` — 终结符文本预处理

### 第三步：规则库加载

规则定义在 `src/main/resources/solidity-rules.xml`（项目内参考副本：`xpath-rules/solidity-rules.xml`）。

`RulesXml` 使用 JAXB 反序列化 XML，并将每条 Pattern 中的 XPath 字符串编译为 `XPathExpression`（运行时依赖 Saxon-HE XPath 引擎）。

**关键类：**

- `RulesXml` — 从 classpath 或外部文件加载规则
- `RulesCached` — 规则加载结果缓存
- `Rule` / `Pattern` — 规则与模式的接口抽象

### 第四步：XPath 模式匹配

`TreeAnalysisDefault` 对规则库中的每条 Rule 的每个 Pattern 执行查询：

1. `Pattern.nodes(xmlRoot)` — 在 XML DOM 根节点上执行 XPath，返回命中的 DOM 节点集合
2. `SearchableTreeDefault` — 将 DOM 节点映射回 ANTLR `ParserRuleContext`
3. 从 `ParserRuleContext` 提取行号、列号、原始代码文本

**关键类：**

- `TreeAnalysisDefault` — 分析编排
- `SearchableTreeDefault` — XPath 查询与节点映射
- `Query` — 查询接口（由 `Pattern` 继承）

### 第五步：结果输出

`ReportDefault` 遍历目录中所有文件的分析结果，通过 `Media` 接口输出。`DetectionOne` 输出每条命中的详细信息；`DetectionAll` 输出汇总格式。

---

## 核心组件

### 组件关系表

| 包/类 | 职责 |
|-------|------|
| `app.cli.DetectionOne` | 单文件/目录详细检测 CLI 入口 |
| `app.cli.DetectionAll` | 批量检测并写入汇总文件 |
| `app.cli.ArgumentsDefault` | 命令行参数解析（`-p`、`-r`、`-o`） |
| `app.DirectoryAnalysisDefault` | 递归扫描目录，按扩展名过滤文件 |
| `app.DirectoryAnalysisCombined` | 合并 Solidity 与 Vyper 扫描 |
| `app.TreeFactoryDefault` | 为每个源文件构建 SearchableTree |
| `app.ReportDefault` | 驱动分析并输出报告 |
| `app.SourceLanguages` | 多语言支持（Solidity / Vyper） |
| `DocumentTreeBasic` | ANTLR 树 → XML DOM |
| `SearchableTreeDefault` | 可 XPath 查询的搜索树 |
| `TreeAnalysisDefault` | 规则 × 模式 × 文件 的匹配编排 |
| `RulesXml` | XML 规则库加载与 XPath 编译 |

### 缓存策略

为避免对同一文件重复解析和建树，系统在三个层次使用缓存：

- `ParseTreeCached` — 语法树解析缓存
- `DocumentTreeCached` — XML DOM 构建缓存
- `RulesCached` — 规则库加载缓存

---

## 规则库设计

### 规则 XML 结构

```xml
<?xml version="1.0" encoding="UTF-8"?>
<Rules xmlns="http://www.smartdec.ru/SmartCheck/Conditions">
    <Rule>
        <RuleId>SOLIDITY_Reentrancy</RuleId>
        <Patterns>
            <Pattern patternId="ree001">
                <Categories>
                    <Category>Solidity</Category>
                </Categories>
                <Severity>3</Severity>
                <TruePositiveRate>...</TruePositiveRate>
                <XPath>
                    //functionCall
                    [functionName/identifier[text()[1]="call"]]
                    [value]
                    ...
                </XPath>
            </Pattern>
        </Patterns>
    </Rule>
</Rules>
```

### 字段说明

| 字段 | 说明 |
|------|------|
| `RuleId` | 规则唯一标识，如 `SOLIDITY_Reentrancy` |
| `patternId` | 模式唯一标识，同一规则可有多个模式 |
| `Severity` | 风险等级，1（低）~ 3（高） |
| `Categories` | 分类标签 |
| `TruePositiveRate` | 真阳性率参考值 |
| `XPath` | 在 XML DOM 上执行的 XPath 2.0 表达式 |

### 规则加载方式

| 场景 | 来源 |
|------|------|
| 未指定 `-r` | classpath 自动加载：`/solidity-rules.xml`（Solidity）、`/vyper-rules.xml`（Vyper） |
| 指定 `-r /path/to/rules.xml` | 外部文件，Solidity 与 Vyper 共用 |

### 已定义规则概览

共 **26 条规则、56 个 XPath 模式**，涵盖：

| 类别 | 规则示例 | 模式数 |
|------|----------|--------|
| 可重入 | `SOLIDITY_Reentrancy` | 2 |
| 整数溢出 | `SOLIDITY_IntegerOverflow` | 4 |
| DoS 攻击 | `SOLIDITY_DOS_Gas` | 2 |
| 时间戳依赖 | `SOLIDITY_TimestampDependence` | 5 |
| tx.origin 依赖 | `SOLIDITY_Tx.Origin` | 2 |
| 未检查调用返回值 | `SOLIDITY_UncheckedCall` | 2 |
| 随机数误用 | `SOLIDITY_MisuseOfRandom` | 2 |
| 代码语法规范 | `SOLIDITY_VersionNotFixed` 等 9 条 | — |
| 0.5–0.6 版本问题 | `SOLIDITY_DeprecatedVersion0.5` 等 5 条 | — |

完整列表见 [README.md](./README.md) 中的漏洞检测规则表。

---

## 漏洞检测原理

### 设计思想：静态模式匹配

本工具采用 **声明式 XPath 模式匹配**，而非深度语义分析。每条漏洞对应一组 XPath 表达式，描述「危险代码在语法树上的结构特征」。

检测流程对每条 Pattern：

1. 在文件的 XML DOM 根节点执行 XPath
2. 返回所有匹配的 DOM 节点
3. 映射回 ANTLR 语法树节点
4. 提取源码位置与代码片段

### 示例：可重入漏洞（SOLIDITY_Reentrancy）

模式 `ree001` 的检测逻辑：

1. 存在 `functionCall`，且函数名为 `call`
2. 调用带有 `value`（发送以太币）
3. 未限制 gas，或 gas 值 ≥ 10000
4. 在该 `call` 的**后续语句**中，修改了合约的非 bool 类型状态变量

XPath 核心结构：

```xpath
//functionCall
  [functionName/identifier[text()[1]="call"]]
  [value]
  [
    not(gas)
    or gas/expression//identifier
    or gas/expression//numberLiteral[decimalNumber >= 10000]
  ]
  [
    ancestor::statement
    [
      following-sibling::statement//expression[lvalueOperator]/...
      or following-sibling::statement//expression[text()[1]="="]/...
    ]
  ]
```

这对应经典重入模式：**先外部 call 转币，后更新状态**（Checks-Effects-Interactions 违反）。

### 示例：除零检查（SOLIDITY_DivMul_Zero）

模式 `sdz001` 检测未做零值保护的除法运算：

```xpath
//expression[muldivOperator/divOperator]
  [expression[2]/primaryExpression/identifier = ... or ...]
  [not(
    ... ancestor::ifStatement/condition 中已检查为 0 ...
    or ... require/assert/revert 中已检查 ...
  )]
```

通过 XPath 的 `ancestor::`、`preceding-sibling::`、`following-sibling::` 轴，在语法树上下文中判断是否存在前置的零值检查。

### 检测能力边界

| 能力 | 支持 | 不支持 |
|------|------|--------|
| 语法结构匹配 | ✅ | — |
| 上下文感知（祖先/兄弟节点） | ✅ | — |
| 跨函数数据流分析 | — | ❌ |
| 符号执行 | — | ❌ |
| 污点追踪 | — | ❌ |
| Solidity 0.8+ 语法 | — | ❌ |

---

## 命令行与输出

### CLI 工具一览

| 主类 | 用途 | 本地 Maven | Docker 默认入口 |
|------|------|-----------|----------------|
| `DetectionOne` | 单文件/目录漏洞检测（详细输出） | ✅ | ✅ |
| `DetectionAll` | 批量检测并写入汇总文件 | ✅ | ✅（`all` 子命令） |
| `TreeView` | 图形化 ANTLR 语法树 | ✅ 需 GUI | ❌ |
| `XmlView` | 导出 XML 中间表示 | ✅ | ✅ 需 `--entrypoint java` |

Docker 镜像通过 `docker-entrypoint.sh` 启动，默认仅集成 `DetectionOne` 与 `DetectionAll`；`XmlView` 需手动指定 Java 主类（见下文）。

### 命令行参数

**漏洞检测**（`DetectionOne` / `DetectionAll`）：

| 参数 | 说明 | 备注 |
|------|------|------|
| `-p` / `--path` | 待扫描的目录 | 必填 |
| `-r` / `--rules` | 指定规则库文件（XML） | 可选，默认加载内置 `solidity-rules.xml` |
| `-o` / `--output` | 结果输出文件 | 可选，仅 `DetectionAll` 使用 |

**辅助工具**：

| 工具 | 参数 | 说明 |
|------|------|------|
| `TreeView` | `-p` / `--path` | 单个 `.sol` / `.vy` 源文件 |
| `XmlView` | `-s` / `--source`、`-t` / `--target` | 源文件路径、输出 XML 路径 |

### DetectionOne 输出格式

每个命中项包含：

```
规则: SOLIDITY_Reentrancy  模式: ree001  风险等级: 3
语言: Solidity  行: 15  列: 8
代码内容: msg.sender.call.value(amount)()
```

文件末尾统计各规则命中次数：

```
SOLIDITY_Reentrancy : 2
SOLIDITY_IntegerOverflow : 1
```

### DetectionAll 输出格式

每行一条汇总记录：

```
合约名 : 规则ID : 命中次数
```

### 辅助工具：查看语法树

| 工具 | 输出 | 本地 Maven | Docker |
|------|------|-----------|--------|
| `TreeView` | GUI 窗口 | ✅ 需图形界面 | ❌ |
| `XmlView` | XML 文件 | ✅ | ✅ 需覆盖 entrypoint |

#### TreeView（图形界面）

弹出 ANTLR 语法树窗口，适合交互式浏览 AST 结构：

```bash
mvn exec:java \
  -Dexec.mainClass="my.smartdec.detect.app.cli.TreeView" \
  -Dexec.args="-p test/tx.sol" \
  -Dcheckstyle.skip=true -Dpmd.skip=true -Dcpd.skip=true
```

| 参数 | 说明 |
|------|------|
| `-p` / `--path` | 单个 `.sol` 或 `.vy` 源文件（非目录） |

需要本地图形界面；窗口关闭前进程持续运行，属正常现象。**Docker 不可用**（容器无 GUI，且 `docker-entrypoint.sh` 未集成该入口）。

#### XmlView（导出 XML）

将语法树导出为检测工具使用的 XML 中间表示。XML 元素名与 `Solidity.g4` 语法规则一一对应，编写 XPath 规则时应参考此结构。导出文件放在 `xml-view/`，示例：`test/tx.sol` → `xml-view/tx.xml`；输出目录不存在时会自动创建。

本地 Maven：

```bash
mvn exec:java \
  -Dexec.mainClass="my.smartdec.detect.app.cli.XmlView" \
  -Dexec.args="-s test/tx.sol -t xml-view/tx.xml" \
  -Dcheckstyle.skip=true -Dpmd.skip=true -Dcpd.skip=true
```

Docker：

```bash
docker run --rm \
  -v "$(pwd)/test:/contracts" \
  -v "$(pwd)/xml-view:/xml-view" \
  --entrypoint java \
  solidity-detection \
  -cp /app/app.jar my.smartdec.detect.app.cli.XmlView \
  -s /contracts/tx.sol -t /xml-view/tx.xml
```

| 参数 | 说明 |
|------|------|
| `-s` / `--source` | 源合约文件 |
| `-t` / `--target` | 输出 XML 路径 |

Docker 默认入口仅支持 `DetectionOne` / `DetectionAll`；`XmlView` 需通过 `--entrypoint java` 直接调用 jar 中的主类。

#### 可视化 XML 语法树（无需 Java）

**推荐：XML Tree Viewer（Cursor / VS Code 扩展）**

1. 打开 `xml-view/tx.xml`
2. `XML Tree Viewer: Open Tree View` → **Graphical Tree**

Cursor 需从 [VS Code Marketplace](https://marketplace.visualstudio.com/items?itemName=AnishMiyaAnsari.xml-tree-viewer) 下载 `.vsix` 手动安装。

**备选：**

```bash
./tools/view-xml-tree.sh xml-view/tx.xml
```

等价于访问 `tools/xml-tree-viewer.html?file=xml-view/tx.xml`（本地 HTTP 服务）。

---

## 技术栈与限制

### 技术栈

| 组件 | 版本/说明 |
|------|-----------|
| Java | 1.8 |
| ANTLR | 4.9.1（词法/语法分析） |
| Saxon-HE | 9.5.1-8（XPath 2.0 引擎） |
| JAXB | 2.3.0（规则 XML 反序列化） |
| Maven | 构建与依赖管理 |
| Docker | 可选容器化部署；默认入口仅含 `DetectionOne` / `DetectionAll`，`XmlView` 需覆盖 entrypoint |

### 已知限制

1. **Solidity 版本**：仅支持 0.4 ~ 0.6 语法，0.8+ 的 built-in overflow check、custom error 等新特性无法正确解析
2. **检测精度**：基于模式匹配，存在误报（False Positive）和漏报（False Negative）
3. **分析深度**：无跨函数、跨合约的数据流分析能力
4. **Vyper 支持**：代码框架支持 Vyper，但仓库内暂未包含 `vyper-rules.xml`

---

## 扩展指南

### 添加新检测规则

1. 编辑 `src/main/resources/solidity-rules.xml`（或外部规则文件）
2. 新增 `<Rule>` 块，定义 `RuleId` 和至少一个 `<Pattern>`
3. 编写 XPath 表达式，参考现有规则的 XML 元素命名（与 `Solidity.g4` 语法规则名一致）
4. 使用 `TreeView` 或 `XmlView` CLI 工具查看文件的语法树/XML 结构，辅助编写 XPath
5. 在 `test/` 目录添加测试合约验证规则

### 调试 XPath 规则

项目提供两个辅助 CLI 工具（命令详见上文 [辅助工具：查看语法树](#辅助工具查看语法树)）：

| 工具 | 输出 | Docker |
|------|------|--------|
| `TreeView` | GUI 窗口 | ❌ 仅本地 |
| `XmlView` | XML 文件 | ✅ |

建议在编写新 XPath 前，用 **XML Tree Viewer** 的 Graphical Tree 查看 `xml-view/` 中的 XML；无 IDE 时用 `view-xml-tree.sh` 备选。

### 使用外部规则文件

```bash
# Docker
docker run --rm \
  -v "$(pwd)/test:/contracts" \
  -v "$(pwd)/xpath-rules/solidity-rules.xml:/rules.xml" \
  solidity-detection -p /contracts -r /rules.xml

# Maven
mvn exec:java \
  -Dexec.mainClass="my.smartdec.detect.app.cli.DetectionOne" \
  -Dexec.args="-p test -r xpath-rules/solidity-rules.xml"
```

---

## 参考

- [SmartCheck 原始项目](https://github.com/smartdec/smartcheck)
- [README.md](./README.md) — 快速开始与规则列表
- [xpath-rules/solidity-rules.xml](./xpath-rules/solidity-rules.xml) — 规则库参考副本
- [Solidity.g4](./Solidity.g4) — ANTLR 语法定义
