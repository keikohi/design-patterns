package state;

public class PeacefulState implements State {

	private PeacefulState() {
	}

	private static final PeacefulState singleton = new PeacefulState();

	public static PeacefulState GetInstance() {
		return singleton;
	}

	@Override
	public void observe() {
		System.out.println("The mammoth is calm and peaceful.");

	}

	@Override
	public void onEnterState() {
		System.out.println("The mammoth calms down");
	}

}
