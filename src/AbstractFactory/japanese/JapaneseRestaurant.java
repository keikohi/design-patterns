package abstractfactory.japanese;

import abstractfactory.Drink;
import abstractfactory.Maindish;
import abstractfactory.Restaurant;

public class JapaneseRestaurant implements Restaurant {

	@Override
	public Drink createDrink() {
		return new GreenTea();
	}

	@Override
	public Maindish creageMainDish() {
		return new Udon();
	}

	@Override
	public String getCountry() {
		return "japanese";
	}

}
