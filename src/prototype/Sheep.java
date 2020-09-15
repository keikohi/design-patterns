package prototype;

import prototype.framework.Animal;

public class Sheep implements Cloneable, Animal {

	private String name;

	public Sheep(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public Animal clone() {
		try {
			return (Sheep) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

	@Override
	public String toString() {
		return this.name;
	}
}
