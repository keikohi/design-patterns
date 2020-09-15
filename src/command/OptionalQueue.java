package command;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Optional;
import java.util.Queue;

public class OptionalQueue<E> {
	private final Queue<E> queue = new ArrayDeque<>();

	public void add(E c) {
		this.queue.offer(c);
	}

	public void addAll(List<E> cs) {
		cs.forEach(this::add);
	}

	public Optional<E> poll() {
		return Optional.ofNullable(queue.poll());
	}

}
