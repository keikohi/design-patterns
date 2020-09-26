package staticfactory;

public class Animal {

	public static Animal newInstance() {
		return new Dog();
	}

	static class Dog extends Animal {

	}

	static class Cat extends Animal {

	}

}
