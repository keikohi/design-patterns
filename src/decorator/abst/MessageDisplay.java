package decorator.abst;

public class MessageDisplay extends Display {

	private final String message;

	public MessageDisplay(String message) {
		this.message = message;
	}

	@Override
	public String getRowText() {
		return message;
	}

}
