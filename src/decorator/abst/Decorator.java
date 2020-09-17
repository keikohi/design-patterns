package decorator.abst;

public abstract class Decorator extends Display {
	protected Display display;

	Decorator(Display display) {
		this.display = display;
	}

}
