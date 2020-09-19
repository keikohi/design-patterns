package chain;

public class Log {

	private static final AbstractLogger logger;

	static {
		logger = new ConsoleLogger(AbstractLogger.INFO);
		logger.setNext(new ErrorLogger(AbstractLogger.ERROR));
	}

	static public AbstractLogger Logger() {
		return logger;
	}

}
