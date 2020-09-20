package mediator;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Talk implements ChatRoom {

	private final Map<String, User> map = new HashMap<>();

	@Override
	public void addUser(User... users) {
		for (User user : users) {
			map.put(user.getId(), user);
		}
	}

	@Override
	public User getUser(String userId) {
		Optional<User> op = Optional.ofNullable(this.map.get(userId));
		return op.orElseThrow(IllegalArgumentException::new);
	}

	@Override
	public void sendMessage(User to, User from, String message) {
		to.recieve(from, message);
	}

}
