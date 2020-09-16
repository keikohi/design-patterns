package factorymethod;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class ElfBlackSmith implements BlackSmith {
	private final static Map<WeaponType, ElfWeapon> arsenal = new HashMap<>();

	static {
		Stream.of(WeaponType.values()).forEach(type -> arsenal.put(type, new ElfWeapon(type)));
	}

	@Override
	public Weapon manifacture(WeaponType weaponType) {
		return arsenal.get(weaponType);
	}

}
