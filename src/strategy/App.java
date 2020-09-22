package strategy;

public class App {
	public static void main(String[] args) {
		{
			ValidationStrategy strategy = (s) -> s.matches("\\d+");
			Validator validatror = new Validator(strategy);
		}

		{
			Validator validatror = new Validator(new ValidationStrategy() {
				@Override
				public boolean execute(String s) {
					return s.matches("\\d+");
				}
			});
		}

	}

}
