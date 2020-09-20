package observer;

public interface Subject {
	void notifyObservers(Event event);

	void addObserver(Observer observer);

	void deleteObserver(Observer observer);
}
