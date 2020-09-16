package bridge;

public class MacOs implements Os {

	private final String os = "Mac OS";

	@Override
	public void printOs() {
		System.out.println(os);
	}

}
