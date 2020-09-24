package objectpool;

import java.util.concurrent.atomic.AtomicInteger;

public class Connection {
	private static final AtomicInteger counter = new AtomicInteger(0);

	private final int id;

	public Connection() {
		this.id = counter.getAndIncrement();
	}

	@Override
	public String toString() {
		return String.format("Connection id = %d", id);
	}

}
