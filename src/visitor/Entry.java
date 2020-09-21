package visitor;

public abstract class Entry implements Element {

	private final String name;

	public String getName() {
		return name;
	}

	public Entry(String name) {
		this.name = name;
	}

	abstract public void accept(Visitor visitor);

}
