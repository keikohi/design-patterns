package abstractfactory.india;

import abstractfactory.Drink;

public class Chai implements Drink {
	static final String kind = "chai";

	@Override
	public String getKind() {
		return kind;
	}

}
