package state;

public class AngryState implements State {

	private AngryState() {
	}

	private static final AngryState singleton = new AngryState();

	public static AngryState GetInstance() {
		return singleton;
	}

	@Override
	public void observe() {
		System.out.println("The mammoth is furious.");

	}

	@Override
	public void onEnterState() {
		System.out.println("The mammoth gets angry!");
	}
}
