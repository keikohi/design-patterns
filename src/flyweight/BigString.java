package flyweight;

import java.util.ArrayList;
import java.util.List;

public class BigString {
	private final List<BigChar> bigChars;

	public BigString(String str) {
		BigCharFactory factory = BigCharFactory.getInstance();
		var bigChars = new ArrayList<BigChar>();
		for (char c : str.toCharArray()) {
			bigChars.add(factory.get(c));
		}
		this.bigChars = bigChars;
	}

	public void print() {
		bigChars.forEach(System.out::println);
	}

}
