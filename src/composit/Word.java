package composit;

import java.util.List;

public class Word extends Composit {

	public Word(List<Letter> letters) {
		letters.forEach(this::add);
	}

	public Word(char... charactors) {
		for (char c : charactors) {
			this.add(new Letter(c));
		}
	}

	@Override
	protected void printBefore() {
		System.out.print(" ");
	}

}
