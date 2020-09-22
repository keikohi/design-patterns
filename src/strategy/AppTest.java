package strategy;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.jupiter.api.Test;

class AppTest {

	@Test
	void test() {
		{
			ValidationStrategy strategy = ValidateType.valueOf("isNum").strategy();
			Validator validator = new Validator(strategy);
			assertThat(validator.validate("0"), is(true));
		}

		{
			ValidationStrategy strategy = StrategyFactory.of("isNum");
			Validator validator = new Validator(strategy);
			assertThat(validator.validate("0"), is(true));
		}

		{
			ValidationStrategy strategy = StrategyFactory.of("isAllLower");
			Validator validator = new Validator(strategy);
			assertThat(validator.validate("Aa"), is(false));
		}

		{
			ValidationStrategy strategy = Validation.of("isNum").get();
			Validator validator = new Validator(strategy);
			assertThat(validator.validate("01232"), is(true));
		}
	}

}
