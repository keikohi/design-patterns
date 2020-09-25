package callback;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.Test;

public class App {
	@Test
	public void Test() {
		List<Converter> converter = List.of((str) -> str.toUpperCase(), (str) -> str.replaceAll("[0-9]", "X"),
				(str) -> str.repeat(3));
		StringConvert convert = new StringConvert(converter);

		assertEquals("KEISUKEXXKEISUKEXXKEISUKEXX", convert.execute("keisuke28"));

	}

}
