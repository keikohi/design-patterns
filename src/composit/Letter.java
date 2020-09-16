package composit;

public class Letter extends Composit {
	private final char charactor;

	public Letter(char charactor) {
		this.charactor = charactor;
	}

	@Override
	protected void printBefore() {
		System.out.print(charactor);
	}

}
