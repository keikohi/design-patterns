package decorator.abst;

public abstract class Display {
	public abstract String getRowText();

	public void print() {
		System.out.println(getRowText());
	}
}
