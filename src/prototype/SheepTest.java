package prototype;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Optional;

import org.junit.Test;

public class SheepTest {
	@Test
	public void SheepTest() {
		Sheep alulu = new Sheep("alulu");
		Optional<Sheep> op = alulu.clone();
		Sheep ming = op.get();

		// -> true
		assertEquals(alulu.getName(), ming.getName());
		ming.setName("ming");
		assertEquals(false, ming.getName().equals(alulu.getName()));
	}
}
