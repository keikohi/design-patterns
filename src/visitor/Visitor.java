package visitor;

public interface Visitor {
	void visit(File file);

	void visit(Dir dir);
}
