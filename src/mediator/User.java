package mediator;

public abstract class User {
	private final ChatRoom room;
	private final String name;
	private final String id;

	public User(ChatRoom room, String name, String id) {
		this.room = room;
		this.name = name;
		this.id = id;
	}

	abstract void send(User to, String message);

	abstract void recieve(User from, String message);

	String getName() {
		return name;
	}

	String getId() {
		return id;
	}

	ChatRoom getChatRoom() {
		return room;
	}

}
