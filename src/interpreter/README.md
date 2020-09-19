## Interpreterパターン
文法規則をクラスで表現

ミニ言語を解釈するときに使用
実装は逆ポーランド記法の例

数字も足し算とかの演算子も全てExpressionという基底クラスを継承した語句クラスで表現する
各語句クラスは抽象メソッドinterpret()を実装して具体的な演算方法を定義している


![dia](https://github.com/keikohi/design-patterns/blob/master/src/interpreter/dia.png)