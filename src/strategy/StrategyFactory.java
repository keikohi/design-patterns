package strategy;

import strategy.validation.IsNum;
import strategy.validation.LowerValidation;

/**
 * static methodのFactoryを使って、与えられたtypeから目的のStrategyを switch文で引き当てる方法。
 * 
 * 
 * Strategyのinterfaceの実装とインスタンス化2つの方法がある                                     
 * 1. ラムダ式を使う: interfaceの実装とインスタンス化を同時に実行
 * 2. interfaceを実装したクラスを作成してnewでインスタンスを作成する方法
 */
public class StrategyFactory {
	public static ValidationStrategy of(String type) {
		switch (type) {
		case "isNum":
			// return StrategyFactory::isNumeric;
			return new IsNum();

		case "isAllLower":
			// return StrategyFactory::isAllLower;
			return new LowerValidation();

		default:
			// Optional<T>.empty() を使っても良い
			throw new IllegalArgumentException();
		}
	}

	private static boolean isNumeric(String s) {
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

	private static boolean isAllLower(String s) {
		return s.equals(s.toLowerCase());
	}
}
