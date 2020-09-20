package observer;

public class ClickListener extends Observer {

	public ClickListener() {
		super(EventType.click);
	}

	@Override
	public void update(Event event) {
		System.out.println("Click event has occured!");
	}

}
