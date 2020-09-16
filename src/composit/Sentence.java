package composit;

import java.util.List;

public class Sentence extends Composit {

	public Sentence(List<Word> words) {
		words.forEach(this::add);
	}

	@Override
	protected void printAfter() {
		System.out.println(".");
	}

}
