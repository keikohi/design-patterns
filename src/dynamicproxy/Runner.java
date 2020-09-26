package dynamicproxy;

public class Runner implements Athlete {

	@Override
	public void act() {
		System.out.println("Running .....");
		try {
			Thread.sleep(9851L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("....... Goal!!!!");
	}

}
