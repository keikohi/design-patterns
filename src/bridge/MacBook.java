package bridge;

public class MacBook implements Pc {

	private final Os os;
	private final String memory;

	public MacBook(Os os, String memory) {
		this.os = os;
		this.memory = memory;
	}

	@Override
	public Os getOs() {
		return os;
	}

	@Override
	public void printSpec() {

		os.printOs();
		System.out.println(memory);
	}

}
