# SolidityDetection v1.1

在 [SmartCheck](https://github.com/smartdec/smartcheck) 理论研究基础上开发，该工具实现了对以太坊智能合约 Solidity 源码的安全漏洞检测。

主要包括 XML 中间表示、XPath 规则库和漏洞匹配检测三大模块，定义了 26 个合约漏洞检测规则，共包含 56 个 XPath 检测模式。

## ARCHITECTURE

**[ARCHITECTURE.md](./ARCHITECTURE.md)** — 系统架构、漏洞检测原理、规则扩展指南

> ⚠️ 本工具主要面向 Solidity 0.4 ~ 0.6 版本，**不支持 0.8 及以上版本**，对新版本语法的检测结果可能不准确。

### 漏洞检测规则

<table>
  <thead>
    <tr>
      <th>Solidity 智能合约漏洞类型</th>
      <th>风险等级</th>
      <th>规则名称</th>
      <th>XPath 模式数量</th>
    </tr>
  </thead>
  <tbody>
    <tr><td>可重入</td><td>3</td><td><code>SOLIDITY_Reentrancy</code></td><td>2</td></tr>
    <tr><td>整数溢出</td><td>3</td><td><code>SOLIDITY_IntegerOverflow</code></td><td>4</td></tr>
    <tr><td>DoS 攻击</td><td>3</td><td><code>SOLIDITY_DOS_Gas</code></td><td>2</td></tr>
    <tr><td>时间戳依赖</td><td>2</td><td><code>SOLIDITY_TimestampDependence</code></td><td>5</td></tr>
    <tr><td>tx.origin 依赖</td><td>3</td><td><code>SOLIDITY_Tx.Origin</code></td><td>2</td></tr>
    <tr><td>Gas 高消耗模式</td><td>1</td><td><code>SOLIDITY_OutOfGas</code></td><td>2</td></tr>
    <tr><td>未检查调用返回值</td><td>3</td><td><code>SOLIDITY_UncheckedCall</code></td><td>2</td></tr>
    <tr><td>随机数误用</td><td>2</td><td><code>SOLIDITY_MisuseOfRandom</code></td><td>2</td></tr>
    <tr><td>不正确的 blockhash</td><td>2</td><td><code>SOLIDITY_IncorrectBlockhash</code></td><td>1</td></tr>
    <tr><td>账户冻结</td><td>2</td><td><code>SOLIDITY_FrozenEther</code></td><td>1</td></tr>
    <tr><td>未检查 selfdestruct 权限</td><td>2</td><td><code>SOLIDITY_UncheckedSelfDestruct</code></td><td>1</td></tr>
    <tr><td>Div 检查</td><td>1</td><td><code>SOLIDITY_DivMul_Zero</code></td><td>2</td></tr>
    <tr>
      <td rowspan="9">代码语法规范</td>
      <td>1</td><td><code>SOLIDITY_VersionNotFixed</code></td><td>1</td>
    </tr>
    <tr><td>2</td><td><code>SOLIDITY_Pragma0.4</code></td><td>1</td></tr>
    <tr><td>2</td><td><code>SOLIDITY_VarInLoop</code></td><td>1</td></tr>
    <tr><td>1</td><td><code>SOLIDITY_Incorrect_View</code></td><td>1</td></tr>
    <tr><td>1</td><td><code>SOLIDITY_Incorrect_Pure</code></td><td>1</td></tr>
    <tr><td>1</td><td><code>SOLIDITY_FunctionReturns_NoReturn</code></td><td>2</td></tr>
    <tr><td>1</td><td><code>SOLIDITY_Address_BitWrong</code></td><td>3</td></tr>
    <tr><td>1</td><td><code>SOLIDITY_InlineAssembly</code></td><td>1</td></tr>
    <tr><td>1</td><td><code>SOLIDITY_SAFEMATH</code></td><td>1</td></tr>
    <tr>
      <td rowspan="5">Solidity 新版本问题 (0.5–0.6.8)</td>
      <td>1</td><td><code>SOLIDITY_DeprecatedVersion0.5</code></td><td>9</td>
    </tr>
    <tr><td>2</td><td><code>SOLIDITY_FunctionExplicitVisibility</code></td><td>4</td></tr>
    <tr><td>1</td><td><code>SOLIDITY_IncorrectStorageLocation</code></td><td>3</td></tr>
    <tr><td>2</td><td><code>SOLIDITY_StructNull</code></td><td>1</td></tr>
    <tr><td>1</td><td><code>SOLIDITY_CALL_NotDate</code></td><td>1</td></tr>
  </tbody>
</table>

### 命令行参数

**漏洞检测**（`DetectionOne` / `DetectionAll`）：

| 参数 | 说明 | 备注 |
|------|------|------|
| `-p` / `--path` | 待扫描的目录 | 必填 |
| `-r` / `--rules` | 指定规则库文件（xml） | 非必填，默认加载 `solidity-rules.xml` |
| `-o` / `--output` | 结果输出文件 | 非必填，仅 `DetectionAll` 使用 |

**辅助工具**：

| 工具 | 参数 | 说明 |
|------|------|------|
| `TreeView` | `-p` / `--path` | 单个 `.sol` / `.vy` 源文件（ANTLR 图形树，需本地 Java） |
| `XmlView` | `-s` / `--source`、`-t` / `--target` | 源文件路径、输出 XML 路径（`xml-view/`） |
| **XML Tree Viewer** | — | **推荐**：Cursor 扩展，IDE 内查看 XML 图形树 |
| `view-xml-tree.sh` | `[xml-view/xxx.xml]` | 备选：浏览器 D3 图形树 |

完整 CLI 一览见 [查看语法树](#查看语法树) 与 [ARCHITECTURE.md](./ARCHITECTURE.md)。

## 环境要求

本项目基于 **Java 1.8** 开发（见 `pom.xml`）。也可使用 Docker，无需本地安装 Java。

## 快速开始

### Docker（推荐）

构建镜像：

```bash
docker build -t solidity-detection .
```

单次检测（`DetectionOne`）：

```bash
docker run --rm -v "$(pwd)/test:/contracts" solidity-detection -p /contracts
```

批量检测（`DetectionAll`）并输出到 `/output/result.txt`：

```bash
docker run --rm \
  -v "$(pwd)/test:/contracts" \
  -v "$(pwd)/output:/output" \
  solidity-detection all -p /contracts -o /output/result.txt
```

结果文件在本机为 `output/result.txt`。

#### 更换规则库

不指定 `-r` 时，使用镜像内置的 `solidity-rules.xml`。

要使用自己的规则文件，分两步：

1. **挂载**：用 `-v` 把本机规则 XML 挂进容器（左边是本机路径，右边是容器内路径）
2. **指定**：用 `-r` 告诉程序读容器内的那个路径

```bash
# 本机文件                          容器内路径（可自定，两边保持一致即可）
-v /path/to/your-rules.xml:/rules.xml
-r /rules.xml
```

示例——使用项目里的 `xpath-rules/solidity-rules.xml`：

```bash
docker run --rm \
  -v "$(pwd)/test:/contracts" \
  -v "$(pwd)/xpath-rules/solidity-rules.xml:/rules.xml" \
  solidity-detection -p /contracts -r /rules.xml
```

示例——使用任意路径的规则文件：

```bash
docker run --rm \
  -v "$(pwd)/test:/contracts" \
  -v "/Users/you/custom-rules.xml:/rules.xml" \
  solidity-detection -p /contracts -r /rules.xml
```

批量检测时同样加上 `-v` 和 `-r` 即可：

```bash
docker run --rm \
  -v "$(pwd)/test:/contracts" \
  -v "$(pwd)/output:/output" \
  -v "$(pwd)/xpath-rules/solidity-rules.xml:/rules.xml" \
  solidity-detection all -p /contracts -o /output/result.txt -r /rules.xml
```

> 容器内的路径不必叫 `/rules.xml`，只要 `-v` 挂载的右边和 `-r` 后面的路径一致即可。

#### 导出语法树 XML（XmlView）

Docker 默认入口仅支持漏洞检测；导出 XML 需覆盖 entrypoint。合约源码与输出目录分别挂载：

```bash
docker run --rm \
  -v "$(pwd)/test:/contracts" \
  -v "$(pwd)/xml-view:/xml-view" \
  --entrypoint java \
  solidity-detection \
  -cp /app/app.jar my.smartdec.detect.app.cli.XmlView \
  -s /contracts/tx.sol -t /xml-view/tx.xml
```

生成文件在本机 `xml-view/tx.xml`。`TreeView` 图形界面无法在 Docker 中使用，请改用 `XmlView` 或在本地 Maven 运行 `TreeView`。

### 本地 Maven

```bash
mvn exec:java \
  -Dexec.mainClass="my.smartdec.detect.app.cli.DetectionOne" \
  -Dexec.args="-p test" \
  -Dcheckstyle.skip=true -Dpmd.skip=true -Dcpd.skip=true
```

批量检测（`DetectionAll`）并将汇总结果写入文件：

```bash
mvn exec:java \
  -Dexec.mainClass="my.smartdec.detect.app.cli.DetectionAll" \
  -Dexec.args="-p test -o result.txt" \
  -Dcheckstyle.skip=true -Dpmd.skip=true -Dcpd.skip=true
```

结果文件每行格式：`合约名 : 规则ID : 命中次数`

### 查看语法树

| 工具 | 本地 Maven | Docker | 说明 |
|------|-----------|--------|------|
| `TreeView` | ✅ 需图形界面 | ❌ | ANTLR 原生语法树（需 Java） |
| `XmlView` | ✅ | ✅ 需覆盖 entrypoint | 导出 XML 到 `xml-view/` |
| **XML Tree Viewer**（Cursor 扩展） | — | — | **推荐**：IDE 内图形化查看 XML |
| `view-xml-tree.sh` | — | — | 备选：浏览器 D3 图形树 |

`XmlView` 输出的 XML 与漏洞检测使用的中间表示一致，XML 元素名对应 `Solidity.g4` 语法规则（如 `functionDefinition`、`functionCall`）。导出文件统一放在 `xml-view/` 目录，示例：`test/tx.sol` → `xml-view/tx.xml`；输出目录不存在时会自动创建。

#### 可视化 XML 语法树（推荐：XML Tree Viewer）

Cursor / VS Code 中安装 **[XML Tree Viewer](https://marketplace.visualstudio.com/items?itemName=AnishMiyaAnsari.xml-tree-viewer)** 后（Cursor 需从 Marketplace 下载 `.vsix` 手动安装）：

1. 打开 `xml-view/tx.xml`
2. `Cmd+Shift+P` → **`XML Tree Viewer: Open Tree View`**
3. 切换到 **Graphical Tree** 标签（Mermaid 流程图，可缩放、导出 PNG）

#### 可视化 XML 语法树（备选：浏览器）

```bash
./tools/view-xml-tree.sh xml-view/tx.xml
```

临时启动本地 HTTP 服务，在浏览器中打开 D3 图形树。按 **Ctrl+C** 关闭服务器。

#### TreeView（图形界面）

弹出 ANTLR 语法树窗口，适合交互式浏览 AST 结构。`-p` 指向**单个** `.sol` 或 `.vy` 文件：

```bash
mvn exec:java \
  -Dexec.mainClass="my.smartdec.detect.app.cli.TreeView" \
  -Dexec.args="-p test/tx.sol" \
  -Dcheckstyle.skip=true -Dpmd.skip=true -Dcpd.skip=true
```

需要本地图形界面（macOS 桌面终端可用）。**Docker 不可用**（无 GUI，且默认入口未集成）。

#### XmlView（导出 XML）

将语法树导出为 XML 中间表示，便于编写和调试 XPath 规则。

本地 Maven：

```bash
mvn exec:java \
  -Dexec.mainClass="my.smartdec.detect.app.cli.XmlView" \
  -Dexec.args="-s test/tx.sol -t xml-view/tx.xml" \
  -Dcheckstyle.skip=true -Dpmd.skip=true -Dcpd.skip=true
```

Docker（命令同上文 [导出语法树 XML](#导出语法树-xmlxmlview)）：

```bash
docker run --rm \
  -v "$(pwd)/test:/contracts" \
  -v "$(pwd)/xml-view:/xml-view" \
  --entrypoint java \
  solidity-detection \
  -cp /app/app.jar my.smartdec.detect.app.cli.XmlView \
  -s /contracts/tx.sol -t /xml-view/tx.xml
```

- `-s` / `--source`：源合约文件
- `-t` / `--target`：输出 XML 路径

#### 可视化 XML 语法树（无需 Java）

**推荐：Cursor / VS Code 扩展 XML Tree Viewer**

1. 打开 `xml-view/tx.xml`
2. 命令面板 → `XML Tree Viewer: Open Tree View` → **Graphical Tree**

Cursor 扩展市场无此插件时，从 [VS Code Marketplace](https://marketplace.visualstudio.com/items?itemName=AnishMiyaAnsari.xml-tree-viewer) 下载 `.vsix`，`Extensions: Install from VSIX` 安装。

**备选：项目脚本**

```bash
./tools/view-xml-tree.sh xml-view/tx.xml
```

临时启动本地 HTTP 服务，浏览器中打开 D3 图形树。

完整流程（Docker 导出 + 树形查看）：

```bash
docker run --rm \
  -v "$(pwd)/test:/contracts" \
  -v "$(pwd)/xml-view:/xml-view" \
  --entrypoint java \
  solidity-detection \
  -cp /app/app.jar my.smartdec.detect.app.cli.XmlView \
  -s /contracts/tx.sol -t /xml-view/tx.xml
```

然后在 Cursor 中打开 `xml-view/tx.xml` → **XML Tree Viewer: Open Tree View** → **Graphical Tree**。

## 规则库修改

检测规则以 XML 形式定义，运行时通过 classpath 加载。

### 默认规则来源（未配置 `-r` 时）

不指定 `-r` / `--rules` 时，程序按文件类型自动从 classpath 加载内置规则：

| 语言               | 规则文件              | 源码位置                                                           |
| ------------------ | --------------------- | ------------------------------------------------------------------ |
| Solidity（`.sol`） | `/solidity-rules.xml` | `src/main/resources/solidity-rules.xml`                            |
| Vyper（`.vy`）     | `/vyper-rules.xml`    | `src/main/resources/vyper-rules.xml`（代码中定义，仓库内暂未包含） |

指定 `-r` 时，Solidity 和 Vyper **共用**该外部规则文件，不再使用上述默认文件。

### 推荐：修改源码中的规则文件

`src/main/resources/solidity-rules.xml`

修改后重新运行「快速开始」中的 `mvn exec:java` 命令即可。

### 参考副本

项目还保留了规则库的参考副本：`xpath-rules/solidity-rules.xml`

### 命令行指定外部规则

运行时通过 `-r` / `--rules` 传入任意路径的规则 XML，无需改动项目内文件。

## 输出说明

检测完成后，控制台会输出每个命中项，包括：

- 规则 ID、模式 ID
- 风险等级
- 行号、列号
- 匹配的代码片段

每个文件末尾还会统计各规则的命中次数。
