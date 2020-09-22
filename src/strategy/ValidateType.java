package strategy;

import strategy.validation.IsNum;
import strategy.validation.LowerValidation;

public enum ValidateType {
	isNum(new IsNum()),
	isAllLower(new LowerValidation());

	private final ValidationStrategy strategy;

	private ValidateType(ValidationStrategy strategy) {
		this.strategy = strategy;
	}

	public ValidationStrategy strategy() {
		return this.strategy;
	}

}
