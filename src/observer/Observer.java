package observer;

public abstract class Observer {
	private final EventType type;

	public Observer(EventType type) {
		this.type = type;
	}

	abstract void update(Event event);

	boolean isSameEventType(Event event) {
		return event.getType().equals(type);
	}
}
