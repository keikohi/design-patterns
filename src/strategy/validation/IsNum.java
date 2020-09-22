package strategy.validation;

import strategy.ValidationStrategy;

public class IsNum implements ValidationStrategy {

	@Override
	public boolean execute(String s) {
		if (s == null) {
			return false;
		}
		try {
			Double.parseDouble(s);
		} catch (NumberFormatException e) {
			return false;
		}
		return true;

	}

}
