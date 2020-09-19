package flyweight;

import java.util.HashMap;
import java.util.Map;

public class BigCharFactory {
	private static final BigCharFactory factory = new BigCharFactory();

	private Map<String, BigChar> map = new HashMap<>();

	static BigCharFactory getInstance() {
		return factory;
	}

	public BigChar get(char charactor) {
		BigChar bc = map.get("" + charactor);
		if (bc == null) {
			BigChar bigChar = new BigChar(charactor);
			map.put("" + charactor, bigChar);
			return bigChar;
		}
		return bc;

	}

}
