## Visitor パターン
データ構造と処理の分離

データ構造を構成する小さい要素(Element)を次々に訪問する訪問者(Visitor)

サンタさんの訪問に例えられる
サンタさん（訪問者）は子どもたちのお家に煙突から入り(Element.accept(visitor))、プレゼントを渡していく(Visitor.visit(element))。
ここでサンタさんに何が欲しいかは子どもたちは言ってはいけない。お父さんというサンタさんは既にプレゼントを買ってしまっているからね。
大切なのはお家を訪問して何をするかは子どもたちのお家は何も言えないということ。あくまで何をするのか、具体的な処理内容はサンタさんである訪問者に委ねるんだ。

### 役割
- Element
  - データ構造のインターフェイス、抽象クラス
  - 具体的な処理内容を書かずにデータ構造を決める役割
  - accpet(Visitor visitor)メソッドでVisitorクラスを受け入れる穴を用意する
``` java
  accept(Visitor visitor){
  	visitor.visit(element);
  }
```
- Visitor
  - 処理のインターフェイス
  - データ構造ではなく各Elementに対する処理の実装を決める役割、インターフェイスは振る舞いの表明でサブクラスが実装する
  - Elementを受け取り、何らかの処理を行う visit(Element element)を実装する
``` java
  visit(Element element){
    // doSomething...
  }
```

### 使い所
例えばファイルとディレクトリでできたツリー構造があったとする。
このツリー構造をルートから探索してそのパスを表示する処理が必要になった場合などはVisitorパターンが有効である。


### 処理
Visitorは次々にElementを辿り、Elementの内容に即した処理を実行する。


![dia](https://github.com/keikohi/design-patterns/blob/master/src/visitor/dia.png)