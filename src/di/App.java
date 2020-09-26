package di;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class App {
	@Test
	public void testName() throws Exception {
		Object ob = DiContainer.resolve("di.StringWrapper", "java.lang.String", "Hello World");
		assertTrue(ob instanceof StringWrapper);
		assertEquals("Hello World", ((StringWrapper) ob).getValue());
	}
}
