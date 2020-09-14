## Builderパターン

### 使い所
- フィールドが多く、それらが同じ型のオブジェクトを生成する必要があるクラス
- さらにフィールドが必ずしも必須項目ではない場合

### 問題
- フィールドが多く必須項目でないと、コンストラクタのパターンが多くなることがある。
- 同じ型が続く場合、書く順番を間違えると同じ型の引数の間で間違ったデータを入れてしまうミスが起きがち

``` java
class Something{
  //必須項目
  private final String a1;
  private final String a2;
  //オプション(Nulll or 空文字でも良い)項目
  private final String b1;
  private final String b2;
  private final String b3;

  //全部のフィールドを引数に持つコンストラクタ
  //全部String型だからフィールドの入れ間違いが起きるかもよ！ 
  public Something(String a1, String a2, Stirng b1, String b2, String b3)
    this.a1 = a1;
    //略
  }
  
  //必須項目とオプション項目b1だけを引数に持つコンストラクタ
  pubilc Something(String a1, String a2, String b1){
    this.a1 = a1;
    this.a2 = a2;
    this.b1 = b1;
    this.b2 = "";
    this.b3 = "";
  }
  
  //↓以下、様々な組み合わせのコンストラクタが続く
```


### Builderパターン
直接オブジェクトを作成するのではなく、はじめに必須項目を受け取るBuilderを作成する。その後にオプション項目を任意の数設定してからbuild()メソッドで目的のオブジェクトを作成する。

``` java 
public class DashiChaDuke {
	private final String rice;
	private final String dashi;
	private final boolean nori;
	private final boolean senbei;
	private final boolean tsukemono;

	private DashiChaDuke(Builder builder) {
		this.rice = builder.rice;
		this.dashi = builder.dashi;
		this.nori = builder.nori;
		this.senbei = builder.senbei;
		this.tsukemono = builder.tsukemono;
	}

	static public Builder builder(String rice, String dashi) {
		return new Builder(rice, dashi);
	}

	static public class Builder {
		/* 必須項目のriceとdashiはNullチェックをする */
		private final String rice;
		private final String dashi;
		/* 必須項目以外は初期値を入れたりNullを入れたりする */
    /* オプションの項目はデフォルト値で初期化するのもあり */
		private boolean nori = false;
		private boolean senbei = false;
		private boolean tsukemono = false;

		public Builder nori(boolean nori) {
			this.nori = nori;
			return this;
		}
    // 略...

		public DashiChaDuke build() {
			return new DashiChaDuke(this);
		}

```

Builderを使うクライアントコードは次のように流れるようなAPIになる。
```java
  DashiChaDuke dcd = DashiChaDuke.builder("rice", "dashi").nori(true).senbei(true).tsukemono(false).build();
```

