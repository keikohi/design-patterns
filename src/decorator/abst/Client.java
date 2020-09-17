package decorator.abst;

public class Client {
	public static void main(String[] args) {
		{
			MessageDisplay message = new MessageDisplay("I love you Rin chan.");
			StarDecorator star = new StarDecorator(message);
			PlusDecorator plus = new PlusDecorator(star);

			plus.print();
			System.out.println(plus.display);
		}
	}
}
