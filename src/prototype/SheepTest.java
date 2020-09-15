package prototype;

import org.junit.Test;

import prototype.framework.Factory;

public class SheepTest {
	@Test
	public void SheepTest() {
		Sheep alulu = new Sheep("alulu");
		Factory factory = new Factory(alulu);
		factory.copy(5);

		factory.showStoreAnimals();
	}
}
