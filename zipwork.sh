#/bin/sh

zip -r se23_`date "+%y%m%d%H%M%S"`.zip se23/env -x "*.class" -x "*.exe"