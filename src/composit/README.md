## Composit パターン
自身と同じ型のフィールドで作る再帰的な構造
composit: n. 合成

合成された複数のインスタンスのグループを単一のインスタンスとして扱うことができる

合成されたオブジェクトをまとめて操作するイメージ
中で再帰的な構造をとっているかどうかはクライアントが意識する必要がない

### 実装例のイメージ

Sentence(
	Word(
	  Letter(),
	  Letter(),
	  Letter(),
	  Letter()...)
	Word(
	  Letter(),
	  Letter(),
	  Letter(),
	  Letter()...)
	Word(
	  Letter(),
	  Letter(),
	  Letter(),
	  Letter()...)  
	...
)