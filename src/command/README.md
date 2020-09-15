## Commandパターン

### 使い所
プログラミングの命令や指令(リクエスト)は関数やメソッドを呼び出すことで遂行される。
リクエストがあったときに、直接メソッドをコールするのではなくてCommandというオブジェクトに変換するアイデアがCommandパターン。
例えば以下のことができるようになる。
- リクエストのキューイング
- リクエストの遅延実行
- リクエストのやり直し

### 例え
- postgreSQLでいうWAL
- ファイルシステムでいうジャーナリング


### 参考
https://www.oracle.com/webfolder/technetwork/jp/javamagazine/Java_MJ18_CommandDesignPattern.pdf
