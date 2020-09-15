## Abstract Factoryパターン

### 説明
抽象的な工場が抽象的な製品を作成するパターン
抽象的な工場:誰が作ってくれるのかさえ関心がない
抽象的な製品:何を作ってくれるのかさえ関心がない

依存性逆転の法則DIP(Dependency Inversion Principle)のファクトリ版がAbstract Factoryになる
こうすると単体テストではMockを化すればいいから楽ちんだよよ！
