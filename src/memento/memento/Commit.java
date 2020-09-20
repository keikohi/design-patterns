package memento.memento;

public class Commit {
	private final String code;

	Commit(String code) {
		this.code = code;
	}

	String getCode() {
		return code;
	}
}
