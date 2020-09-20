package mediator;

public class ChatUser extends User {

	public ChatUser(ChatRoom room, String name, String id) {
		super(room, name, id);
	}

	@Override
	void send(User to, String message) {
		System.out
				.println(String.format("Sending Message from %s to %s", getName(), getChatRoom().getUser(to.getId())));
		getChatRoom().sendMessage(to, this, message);

	}

	@Override
	void recieve(User from, String message) {
		System.out.println(String.format("Recieve Message from %s: %s", from.getName(), message));
	}

}
