package staticfactory;

import org.junit.Test;

public class App {
	@Test
	public void testName() throws Exception {
		Animal animal = Animal.newInstance();
		// Animalを知っているがその下のDog、Catに依存していないため修正はAnimalだけでクライアントは変える必要がない。
	}
}
