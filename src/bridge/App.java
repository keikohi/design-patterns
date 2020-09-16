package bridge;

public class App {

	public static void main(String[] args) {
		Pc macbook = new MacBook(new MacOs(), "4 GB");
		Pc hp = new Hp(new Windows(), "16 GB");

		macbook.printSpec();
		hp.printSpec();
	}
}
