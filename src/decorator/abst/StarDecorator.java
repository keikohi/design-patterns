package decorator.abst;

public class StarDecorator extends Decorator {

	private final String star = "**";

	public StarDecorator(Display display) {
		super(display);
	}

	@Override
	public String getRowText() {
		return star + display.getRowText() + star;
	}

}
