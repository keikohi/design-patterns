package abstractfactory.india;

import abstractfactory.Drink;
import abstractfactory.Maindish;
import abstractfactory.Restaurant;

public class IndeaRestaurant implements Restaurant {

	@Override
	public Drink createDrink() {
		return new Chai();
	}

	@Override
	public Maindish creageMainDish() {
		return new Curry();
	}

	@Override
	public String getCountry() {
		return "Indea";
	}

}
