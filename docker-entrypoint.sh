#!/bin/sh
set -e

MAIN_CLASS="my.smartdec.detect.app.cli.DetectionOne"

if [ "${MAIN:-}" = "DetectionAll" ] || [ "$1" = "all" ]; then
    MAIN_CLASS="my.smartdec.detect.app.cli.DetectionAll"
    if [ "$1" = "all" ]; then
        shift
    fi
fi

exec java -cp /app/app.jar "$MAIN_CLASS" "$@"
