# se
for se special lecture


## node追加について
- 下記をbash_profile.sh下部に追加
- nodeのwin版zipをDLして解凍して置いておく必要あり
  - https://nodejs.org/ja/download/
```bash
export PATH=/c/oit/$COURSEYEAR/node-v14.17.0-win-x64/:$PATH

```
- 正常に動作するようだが，terminalizerのインストールは失敗した(pythonが必要と言われたので↓を入れてみたがNG）

## python追加について
- https://www.python.org/downloads/windows/
- https://qiita.com/mm_sys/items/1fd3a50a930dac3db299
- embeddableなzipをダウンロード

- - 下記をbash_profile.sh下部に追加
```
export PATH=/c/oit/$COURSEYEAR/python-3.9.5-embed-amd64/:$PATH

```
- python39._pthの `import site`のコメントを外す
- `https://bootstrap.pypa.io/get-pip.py` をダウンロードして実行 `python get-pip.py` 
- `python -m pip install` 形式で実行できるようになる