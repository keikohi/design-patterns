package observer;

import java.util.List;

public class App {
	public static void main(String[] args) {
		List<Observer> observers = List.of(new ClickListener(), new LoadListener(), new MouseoverListener());
		Subject browser = new Broeser();
		observers.forEach(browser::addObserver);

		List<Event> events = List.of(new Event(EventType.click), new Event(EventType.load),
				new Event(EventType.mouseover));
		events.forEach(browser::notifyObservers);

	}
}
