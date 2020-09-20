package state;

public class Mammoth {
	private State state;

	public Mammoth(State state) {
		this.state = state;
	}

	public void observe() {
		state.observe();
	}

	public void timePasses() {
		if (state.equals(AngryState.GetInstance())) {
			changeStateTo(PeacefulState.GetInstance());
		} else {
			changeStateTo(AngryState.GetInstance());
		}
	}

	private void changeStateTo(State newState) {
		this.state = newState;
		this.state.onEnterState();
	}

}
