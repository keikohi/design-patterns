package visitor;

public class App {
	public static void main(String[] args) {
		Dir root = new Dir("root");
		Dir second = new Dir("second");
		Dir third = new Dir("third");
		root.add(second);
		second.add(third);

		second.add(new File("file@second"));
		third.add(new File("file@third"));

		root.accept(new PrintPathVisitor());
	}
}
