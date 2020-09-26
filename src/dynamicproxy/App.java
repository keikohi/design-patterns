package dynamicproxy;

public class App {
	public static void main(String[] args) {
		Athlete athlete = new Runner();
		Athlete proxy = (Athlete) Intercepter.intercept(athlete, () -> System.out.println("よーい....どん！！"),
				() -> System.out.println("ピッピーーーー!"));
		proxy.act();

		new Runner().act();
	}
}
