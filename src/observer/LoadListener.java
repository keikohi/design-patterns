package observer;

public class LoadListener extends Observer {

	public LoadListener() {
		super(EventType.load);
	}

	@Override
	public void update(Event event) {
		System.out.println("Load Event has occured!");

	}

}
