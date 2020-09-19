## Interpreterパターン
文法規則をクラスで表現

ミニ言語を解釈するときに使用
実装は逆ポーランド記法の例

数字も足し算とかの演算子も全てExpressionという基底クラスを継承した語句クラスで表現する
各語句クラスは抽象メソッドinterpret()を実装して具体的な演算方法を定義している

### interpreterパターンを使わないバージョン

switchとifでネストが深くなっている
''' java
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		MyStack<Integer> stack = new MyStack();
		String fomula = scan.nextLine();
		String[] operand = fomula.split(" ");
		for (int i = 0; i < operand.length; i++) {
			switch (operand[i]) {
			case "+":
			case "-":
			case "*":
			case "/":
				int a = stack.pop();
				int b = stack.pop();
				int result = 5;
				if (operand[i].equals("+")) {
					result = a + b;
				} else if (operand[i].equals("-")) {
					result = a - b;
				} else if (operand[i].equals("*")) {
					result = a * b;
				} else if (operand[i].equals("/")) {
					result = a / b;
				}
				stack.push(result);
				break;
			default:
				stack.push(Integer.parseInt(operand[i]));
			}
		}
		System.out.println(stack.peek());
	}
'''

![dia](https://github.com/keikohi/design-patterns/blob/master/src/interpreter/dia.png)