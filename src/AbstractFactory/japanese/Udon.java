package abstractfactory.japanese;

import abstractfactory.Maindish;

public class Udon implements Maindish {
	private final String kind = "udon";

	@Override
	public String getKind() {
		return kind;
	}

}
