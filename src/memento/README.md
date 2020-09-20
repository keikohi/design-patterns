## memento パターン
状態を以前に戻すためのパターン


### 例えるなら
- Undoができるエディタ
- OSの復元ポイント


### 登場人物
- Memento
  - 思い出の品
  - これが管理したいものの状態
  - 基本的に後から改変ができないようにprivate final かつ Setterは持たないイミュータブルなオブジェクト
  - OriginatorがMementoを作成する役割を持っているので、基本的にMementoのコンストラクタはprivate
- Originator
  - 創始者
  - 役割
    - 状態のスナップショット(Memento)の作成自体を担う(こいつだけがMementoを作成できる)
    - 与えられたMementoの状態に戻す
- CareTaker
  - 管理人
    - どのタイミングでMementoを作成するのか指示をだす
    - どのタイミング・なんのMementoでOriginatorの状態に戻すのか指示をだす

Mementoとは**Originatorのフィールドの情報**のこと
状態を保存する対象としてフィールドを選別する必要があり、MementoはOriginatorの軽量版といったところ。
もしかしたらフィールドの情報は少ないかもしれない。
復元に必要な情報のみ。全部おなじなのはPrototypeパターンでインスタンスの情報を全てコピーする


### パッケージの隔離
MementoとOriginatorは同じパッケージにするのらしい
そしてMementoのフィールドを取得するGetterもパッケージプライベートにすることでCareTakerから隠すことができる

### 実例への例え
gitのコード管理と本質的に同じ
- Memento
  - Commit
- Originator
  - WorkSpace
- CareTaker
  - Repository



![dia](https://github.com/keikohi/design-patterns/blob/master/src/memento/dia.png)