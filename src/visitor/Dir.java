package visitor;

import java.util.ArrayList;
import java.util.List;

public class Dir extends Entry {

	public Dir(String name) {
		super(name);
	}

	private final List<Entry> childs = new ArrayList<>();

	public List<Entry> getChilds() {
		return this.childs;
	}

	public void add(Entry entry) {
		childs.add(entry);
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

}
