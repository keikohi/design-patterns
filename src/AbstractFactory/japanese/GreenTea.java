package abstractfactory.japanese;

import abstractfactory.Drink;

public class GreenTea implements Drink {
	static final String kind = "Green Tea";

	@Override
	public String getKind() {
		return kind;
	}

}
