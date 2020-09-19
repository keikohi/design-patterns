package chain;

public abstract class AbstractLogger {
	public static int INFO = 1;
	public static int DEBUG = 2;
	public static int ERROR = 3;

	protected int level;

	private AbstractLogger next;

	public AbstractLogger setNext(AbstractLogger next) {
		this.next = next;
		return next;
	}

	public void logMessage(int level, String message) {
		if (level >= this.level) {
			write(message);
		}
		if (next != null) {
			next.logMessage(level, message);
		}
	}

	abstract void write(String message);
}
