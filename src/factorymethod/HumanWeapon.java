package factorymethod;

public class HumanWeapon implements Weapon {
	private final WeaponType type;

	public HumanWeapon(WeaponType type) {
		this.type = type;
	}

	@Override
	public WeaponType getWeaponType() {
		return type;
	}
}
