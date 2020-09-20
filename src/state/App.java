package state;

public class App {
	public static void main(String[] args) {
		Mammoth mammoth = new Mammoth(PeacefulState.GetInstance());
		mammoth.observe();
		mammoth.timePasses();
		mammoth.observe();
		mammoth.timePasses();
	}
}
