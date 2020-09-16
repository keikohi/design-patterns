package composit;

public class App {
	public static void main(String[] args) {
		Messsenger messenger = new Messsenger();
		{
			Composit composit = messenger.messageFromKeisuke();
			composit.print();
		}

		{
			Composit composit = messenger.messageFromRin();
			composit.print();
		}
	}
}
