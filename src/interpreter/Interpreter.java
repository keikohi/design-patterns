package interpreter;

import java.util.Stack;

public class Interpreter {
	public static void main(String[] args) {
		var tokenString = "4 3 2 - 1 + *";
		Stack<Expression> stack = new Stack<>();

		String[] tokenList = tokenString.split(" ");
		for (String s : tokenList) {
			if (isOperator(s)) {
				Expression right = stack.pop();
				Expression left = stack.pop();
				Expression operator = getOperatorInstance(s, left, right);
				stack.push(new NumberExpression(operator.interpret()));

			} else {
				stack.push(new NumberExpression(s));
			}
		}
		System.out.println(stack.pop().interpret());
	}

	public static boolean isOperator(String s) {
		return s.equals("+") || s.equals("-") || s.equals("*");
	}

	public static Expression getOperatorInstance(String s, Expression left, Expression right) {
		switch (s) {
		case "+":
			return new PlusExpression(left, right);
		case "-":
			return new MinusExpression(left, right);
		case "*":
			return new MultiplyExpression(left, right);
		default:
			throw new UnsupportedOperationException();
		}
	}
}
