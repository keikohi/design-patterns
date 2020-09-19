package chain;

public class App {
	public static void main(String[] args) {
		Log.Logger().logMessage(AbstractLogger.INFO, "Info message.");
		Log.Logger().logMessage(AbstractLogger.ERROR, "Erroe Message.");
	}
}
