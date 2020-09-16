package composit;

import java.util.ArrayList;
import java.util.List;

public class Composit {
	private final List<Composit> children = new ArrayList<>();

	public void add(Composit c) {
		children.add(c);
	}

	void printBefore() {
	}

	void printAfter() {
	}

	public void print() {
		printBefore();
		children.forEach(Composit::print);
		printAfter();
	}

}
