## Decorator パターン
中身と外枠が同じAPI

### 目的
外枠を重ねることで機能を追加することに主眼
中身のインターフェイス(API)を換えずに外枠を作る(透過的)

飾り窓が中身と同じAPIを持っているので何回包んでも同じAPIを持つ

### 機能追加の方法
Decoratorクラスを増やしてさらにDisplayクラスを包むことで機能追加する
APIの中身で独自処理を入れつつ、委譲先のメソッドを呼ぶことで再帰的に委譲先のメソッドがコールされる。
ラップしているという意味では再帰構造になっていて、かつメソッドを呼ぶときには再帰関数になっているような気がする。


![dia](https://github.com/keikohi/design-patterns/blob/master/src/decorator/abst/dia.png)
