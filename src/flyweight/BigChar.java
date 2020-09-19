package flyweight;

public class BigChar {
	private final String value;

	public BigChar(char c) {

		switch (c) {
		case '1': {
			String value = "";
			value += "--*--\n";
			value += "-**--\n";
			value += "--*--\n";
			value += "-***-\n";
			this.value = value;
		}

			break;
		case '2': {
			String value = "";
			value += "****-\n";
			value += "*-*-\n";
			value += "-*--\n";
			value += "****-\n";
			this.value = value;
		}
			break;

		default:
			throw new UnsupportedOperationException();
		}
	}

	@Override
	public String toString() {
		return this.value;
	}

}
