#/bin/sh

zip -r se21_`date "+%y%m%d%H%M%S"`.zip se21/env -x "*.class" -x "*.exe"