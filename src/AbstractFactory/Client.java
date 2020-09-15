package abstractfactory;

import abstractfactory.india.IndeaRestaurant;
import abstractfactory.japanese.JapaneseRestaurant;

public class Client {

	public static void main(String[] args) {

		Restaurant japanese = new JapaneseRestaurant();
		Restaurant indea = new IndeaRestaurant();
		serve(japanese);
		serve(indea);

	}

	private static void serve(Restaurant r) {
		Drink d = r.createDrink();
		Maindish main = r.creageMainDish();
		System.out.println(r.getCountry() + " restrants serve " + d.getKind() + " and " + main.getKind() + ". ");
	}
}
