package decorator.abst;

public class PlusDecorator extends Decorator {

	public PlusDecorator(Display display) {
		super(display);
	}

	private final String plus = "++";

	@Override
	public String getRowText() {
		return plus + display.getRowText() + plus;
	}

}
