package prototype;

import java.util.Optional;

public class Sheep implements Cloneable {

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
	public Optional<Sheep> clone() {

		try {
			return Optional.of((Sheep) super.clone());
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			return Optional.ofNullable(null);
		}
	}
}
