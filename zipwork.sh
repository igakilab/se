#/bin/sh

zip -r se22_`date "+%y%m%d%H%M%S"`.zip se22/env -x "*.class" -x "*.exe"