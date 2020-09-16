package factorymethod;

public enum WeaponType {
	SWORD("sword"),
	GUN("gun"),
	ARROW("arrow");

	private final String title;

	WeaponType(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return title;
	}
}
