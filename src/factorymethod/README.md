## Factory Methodパターン
インスタンスの生成をサブクラスにまかせる

抽象メソッドを定義しているクラスと実装しているサブクラスの関係との関係を指す

### Abstract Factoryとの違い
- Abstract FactoryはクライアントのインスタンスがConcreteFactoryのインスタンスにオブジェクトの生成をお願いするというオブジェクト同士の関連
- Concrete Factoryは抽象的な工場を実装したクラス


### Factory MethodでかつAbstract Factory
- Abstract FactoryがFactory Methodを持ち、Concrete Factoryが上書きするのが一般的
- クライアントが求めるAbstract FactoryをFactory Method	で提供するなど、排他ではなくて保管的な立ち位置