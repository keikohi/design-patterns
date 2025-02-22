## Commandパターン
命令をクラスにする
命令をクラスにすることで命令の遅延実行、保存、キューイングなど様々なことが可能になる

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

CommandはEventとも呼ばれる

### クラス図
![クラス図](https://github.com/keikohi/design-patterns/blob/master/src/command/command.png)

### 参考
https://www.oracle.com/webfolder/technetwork/jp/javamagazine/Java_MJ18_CommandDesignPattern.pdf
