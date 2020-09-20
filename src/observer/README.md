## Observer パターン
できごとの通知パターン

書籍には「状態の変化を通知する」のがテーマになっていたが状態だけに限らないと思うので「できごと(イベント)の通知パターン」に変更した。


### 役割
- Observer
  - イベントの通知や状態の変更を受け取るクラス
- Subject
  - 状態が変わる主体で、Observerに向けてイベントを通知するクラス

Observer観察者は能動的にSubjectの状態変化を観察しているわけではなく、Subjectから「通知」されるのを受動的に待っていることになる。
なのでPublish-Subscribeターンと呼ばれることがありそっちの方がしっくりくる。

### 通知の購読
Subjectは通知する対象を知っている必要がある。
そのため、Subjectのインスタンスに通知を受け取るObserverインスタンスを登録することで**購読**と呼ばれる契約をする。
購読したObserverは自身がイベントの通知などを監視するのではなく、Subjectから通知を受け取り、Observerは処理する。

またAPIとして通知、購読登録だけではなく購読の解消もあることを忘れずに。

### 役割分担
ここではイベントの監視はSubjectクラスが行い、そのイベントが発生したとき何をするのか定義しているのはObserver。
この点で役割分担がなされている。


### 実例
EventListenerとかイベント駆動なシステムで使われる
- addEventListener
  - Observerの方、イベントの変更が合ったときにコールバック関数を呼ぶ
- DOM
  - 状態を持っていたり何か変更があったときにObserverに向けてその旨を通知する



![dia](https://github.com/keikohi/design-patterns/blob/master/src/observer/dia.png)