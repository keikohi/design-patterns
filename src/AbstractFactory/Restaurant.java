package abstractfactory;

public interface Restaurant {
	Drink createDrink();

	Maindish creageMainDish();

	String getCountry();
}
