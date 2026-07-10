#!/usr/bin/env bash
# 启动本地 HTTP 服务并打开 XML 语法树图形查看器
# 用法: ./tools/view-xml-tree.sh [xml文件路径]
# 示例: ./tools/view-xml-tree.sh xml-view/tx.xml

set -e

ROOT="$(cd "$(dirname "$0")/.." && pwd)"
FILE="${1:-xml-view/tx.xml}"

if [[ "$FILE" = /* ]]; then
  REL="${FILE#$ROOT/}"
  if [[ "$REL" == "$FILE" ]]; then
    echo "错误: 文件须在项目目录内 ($ROOT)" >&2
    exit 1
  fi
else
  REL="$FILE"
  FILE="$ROOT/$FILE"
fi

if [[ ! -f "$FILE" ]]; then
  echo "错误: 文件不存在: $FILE" >&2
  exit 1
fi

PORT="${PORT:-8765}"
while lsof -Pi ":$PORT" -sTCP:LISTEN -t >/dev/null 2>&1; do
  PORT=$((PORT + 1))
done

cd "$ROOT"
python3 -m http.server "$PORT" --bind 127.0.0.1 >/dev/null 2>&1 &
SERVER_PID=$!

cleanup() {
  kill "$SERVER_PID" 2>/dev/null || true
}
trap cleanup EXIT INT TERM

sleep 0.3
ENCODED=$(python3 -c "import urllib.parse,sys; print(urllib.parse.quote(sys.argv[1]))" "$REL")
URL="http://127.0.0.1:${PORT}/tools/xml-tree-viewer.html?file=${ENCODED}"

echo "打开: $URL"
open "$URL"
echo "按 Ctrl+C 关闭本地服务器"
wait "$SERVER_PID"
