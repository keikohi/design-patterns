package callback;

import java.util.List;

public class StringConvert {
	private final List<Converter> callbacks;

	public StringConvert(List<Converter> callbacks) {
		this.callbacks = callbacks;
	}

	public String execute(String str) {
		for (Converter converter : callbacks) {
			str = converter.execute(str);
		}
		return str;
	}
}
