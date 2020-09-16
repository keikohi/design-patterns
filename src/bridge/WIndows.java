package bridge;

public class Windows implements Os {

	private final String name = "Windows10";

	@Override
	public void printOs() {
		System.out.println(name);
	}

}
