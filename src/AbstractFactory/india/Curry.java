package abstractfactory.india;

import abstractfactory.Maindish;

public class Curry implements Maindish {
	static final String kind = "curry";

	@Override
	public String getKind() {
		return kind;
	}

}
