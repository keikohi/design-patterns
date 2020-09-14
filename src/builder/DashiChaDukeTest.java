package builder;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class DashiChaDukeTest {
	@Test
	public void BuilderTest() {
		{
			DashiChaDuke dcd = DashiChaDuke.builder("rice", "dashi").nori(true).senbei(true).tsukemono(false).build();
			assertEquals(true, dcd.isNori());
			assertEquals(true, dcd.isSenbei());
			assertEquals(false, dcd.isTsukemono());
		}

		{
			DashiChaDuke dcd = DashiChaDuke.builder("rice", "dashi").build();
			assertEquals(false, dcd.isNori());
			assertEquals(false, dcd.isSenbei());
			assertEquals(false, dcd.isTsukemono());
		}

	}
}
