## FlyWeight パターン
軽量級という意味
何が軽量級なのかというとメモリの使用量が軽量級という意味

同じオブジェクトを共有すること(使い回すこと)よってメモリの使用量を削減するパターン
インスタンス制御(ある地点でどんなインスタンスなのか制御できる)

DI コンテナと似ている
同値性・等価性両方とも　== で判定可能、equalsを使わなくても良い

Object-pool型と関連

### 複数箇所に影響が及ぶ
オブジェクトを共有しているので変更が入るとそれを使っている複数箇所に影響が及ぶことがある

### メモリリークに気をつけろ
管理されているオブジェクトは参照がずっとつくためガベージコレクションの対象にならない

### FlyWeightFactoryはシングルトンになりうる
Factoryが複数あるよりも一つのインスタンスに限定してそこでオブジェクトの管理を行う
管理されるオブジェクトもシングルトンでも良いのかもしれないと思った

Factory自体もがコンテナ、プールなのでこれがシングルトンなのはまあそうだろう

![dia](https://github.com/keikohi/design-patterns/blob/master/src/flyweight/dia.png)