package visitor;

public class File extends Entry {

	public File(String name) {
		super(name);
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

}
