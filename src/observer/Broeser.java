package observer;

import java.util.HashSet;
import java.util.Set;

public class Broeser implements Subject {

	private final Set<Observer> set = new HashSet<>();

	@Override
	public void addObserver(Observer observer) {
		set.add(observer);
	}

	@Override
	public void deleteObserver(Observer observer) {
		set.remove(observer);

	}

	@Override
	public void notifyObservers(Event event) {
		set.stream().filter(observer -> observer.isSameEventType(event)).forEach(observer -> observer.update(event));

	}

}
