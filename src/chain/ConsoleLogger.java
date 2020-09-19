package chain;

public class ConsoleLogger extends AbstractLogger {

	public ConsoleLogger(int level) {
		this.level = level;
	}

	@Override
	void write(String message) {
		System.out.println("Console logger: " + message);
	}

}
