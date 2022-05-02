./rsrc.exe -ico se-bash.ico -o se-bash.syso
GOOS=windows GOARCH=amd64 go build -ldflags -H=windowsgui