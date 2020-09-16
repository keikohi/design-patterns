package factorymethod;

public class ElfWeapon implements Weapon {

	private final WeaponType type;

	public ElfWeapon(WeaponType type) {
		this.type = type;
	}

	@Override
	public WeaponType getWeaponType() {
		return this.type;
	}

}
