package mediator;

public class App {
	public static void main(String[] args) {
		ChatRoom talk = new Talk();
		User kei = new ChatUser(talk, "keisuke", "0");
		User rin = new ChatUser(talk, "rin", "1");
		talk.addUser(kei, rin);

		kei.send(rin, "I love you rin.");

	}
}
