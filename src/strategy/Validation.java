package strategy;

import java.util.Optional;

/**
 * 定数固有メソッドにvalidationの詳細を書く例. Enumもinterfaceを実装することが可能.
 * 一覧性も悪くないし複雑性があまり検討がつかない、初めに実装としては悪くないのではないか.
 * 
 * でもいまはenumの数が2,3だから良いがこれが多くなったらと考えると素直にClassに切り分けた方が良いと思った
 * 
 * - switch文による分岐も兼ねる - Enumによる一覧性あり -
 * ValidationStrategyを個別に実装したValidationクラスを作るのが面倒なときに良い - 2,3このEnumのときが望ましい
 */
public enum Validation implements ValidationStrategy {
	isNum {
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

	},
	isAllLower {
		@Override
		public boolean execute(String s) {
			return s.equals(s.toLowerCase());
		}
	};

	public static Optional<ValidationStrategy> of(String s) {
		return Optional.ofNullable(Validation.valueOf(s));
	}
}
