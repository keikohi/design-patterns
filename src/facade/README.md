## Facade パターン
複雑なサブシステムのシンプルな窓口を構造に持つ

複雑なサブシステムへのシンプルなAPI


``` java
public class Main{
	public static void main(String[] args){
		// ディナーを作るには具材を調達したり調理したり複雑な手間があるが、呼び出しは簡単にディナーを作るでよい。
		// 私は食べる専門家だ。
		Father.makeDinner();
		
	}
}
```