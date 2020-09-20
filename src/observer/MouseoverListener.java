package observer;

public class MouseoverListener extends Observer {

	public MouseoverListener() {
		super(EventType.mouseover);
	}

	@Override
	public void update(Event event) {
		System.out.println("Mouseover Event has occured");

	}
}
