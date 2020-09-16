package factorymethod;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class HumanBlackSmith implements BlackSmith {

	private static final Map<WeaponType, HumanWeapon> arsenal = new HashMap<>();

	static {
		Stream.of(WeaponType.values()).forEach(type -> arsenal.put(type, new HumanWeapon(type)));
	}

	@Override
	public Weapon manifacture(WeaponType weaponType) {
		return arsenal.get(weaponType);
	}

}
