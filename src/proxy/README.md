## Proxy パターン
代理人が処理するパターン

### 概要
HTTPのプロキシとかはまさにそうでProxyがWebPageを帰す場合もあれば、そうではなく実際にWebServerに問い合わせを行いことがある。
これはRepositoryのキャッシュと全く同じでキャッシュに乗っていれば問い合わせをせずに、RepositoryProxyがキャッシュに残ったものを返す。
キャッシュになければRealRepositoryに処理を委譲してDBに取得依頼を行う。

このときRealSubject（RealWebServerやRealRepository）はProxyオブジェクトの存在は全く知らない。

書籍ではAPIでも重い処理が必要な場合が呼ばれたときのみ委譲先のインスタンスを生成する例があった。なので遅延


### インターフェイスを実装する必要はあるのか
インターフェイスを実装するのは代理人じゃなくて本人に入れ替わってもAPIは変わらないから。たぶんしたほうが良い。


### 透過的
ClientがコールするのはWebServer(Subject)クラスであるためそれがProxyなのかRealSubjectなのかは一切問題にならない。
あなたと絵の間に透明なガラスが合ったとしても絵が透けて見えるようにClientとSubjectの間にProxyがあっても問題は起きない。



### 他のパターン
- Adapter
  - Adapterは異なるAPIを埋める働きをするが、Proxyは同じAPIのSubjectを実装するため透過的な働きをする

- Decorator
  - 実装は似ているが目的が異なる。Decoratorは機能の拡張に主眼を置くがProxyパターンは代理人が本人の代行をすることが目的。
  
  
![dia](https://github.com/keikohi/design-patterns/blob/master/src/proxy/dia.png)