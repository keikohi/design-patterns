package memento.memento;

public class WorkSpace {

	private String code;

	public WorkSpace(String code) {
		this.code = code;
	}

	public Commit createCommit() {
		return new Commit(code);
	}

	public void restore(Commit commit) {
		this.code = commit.getCode();
	}

	public void updateCode(String code) {
		this.code = code;
	}

	public void addCode(String code) {
		this.code = this.code + code;
	}

	@Override
	public String toString() {
		return this.code;
	}

	public void showCode() {
		System.out.println(this);
	}

}
