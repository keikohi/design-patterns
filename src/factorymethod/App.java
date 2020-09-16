package factorymethod;

public class App {
	private final BlackSmith bs;

	public App(BlackSmith bs) {
		this.bs = bs;
	}

	public static void main(String[] arg) {
		{
			final var app = new App(new ElfBlackSmith());
			app.manifactureWepon();
		}
		{
			final var app = new App(new HumanBlackSmith());
			app.manifactureWepon();
		}
	}

	public void manifactureWepon() {
		final var weapon1 = bs.manifacture(WeaponType.ARROW);
		System.out.println(weapon1);
		final var weapon2 = bs.manifacture(WeaponType.GUN);
		System.out.println(weapon2);
	}
}
