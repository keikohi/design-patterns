package composit;

import java.util.List;

public class Messsenger {
	public Composit messageFromRin() {
		List<Word> words = List.of(
				new Word('I'),
				new Word('l','o','v','e'),
				new Word('y','o','u'),
				new Word('K','e','i','s','u','k','e'));		 	
		return new Sentence(words);
	}
	
	public Composit messageFromKeisuke() {
		List<Word> words = List.of(
				new Word('I'),
				new Word('l','o','v','e'),
				new Word('y','o','u'),
				new Word('R','i','n'));		 	
		return new Sentence(words);
	}
}
