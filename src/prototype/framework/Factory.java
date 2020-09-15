package prototype.framework;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Factory {

	private final List<Animal> store = new ArrayList<>();
	private final Animal animal;

	public Factory(Animal animal) {
		this.animal = animal;
	}

	public void copy(int n) {
		IntStream.range(0, n).forEach(i -> {
			/*
			 * 通常、newをしたらAnimalの実装クラスへの密接なクラス関係が発生するが プロトタイプパターンだと具体的なクラスを知る必要がない
			 */
			store.add(animal.clone());
		});
	}

	public void showStoreAnimals() {
		store.forEach(animal -> System.out.println(animal));
	}

}
