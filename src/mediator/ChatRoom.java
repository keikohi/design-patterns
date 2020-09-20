package mediator;

public interface ChatRoom {

	void addUser(User... user);

	void sendMessage(User to, User from, String message);

	User getUser(String userId);
}
