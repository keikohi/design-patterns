package strategy.validation;

import strategy.ValidationStrategy;

public class LowerValidation implements ValidationStrategy {

	@Override
	public boolean execute(String s) {
		return s.equals(s.toLowerCase());
	}

}
