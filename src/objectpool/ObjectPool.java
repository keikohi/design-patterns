package objectpool;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public abstract class ObjectPool<T> {
	private final Set<T> avairable = new HashSet<>();
	private final Set<T> inUse = new HashSet<>();

	public ObjectPool(int poolNum) {
		initPool(poolNum);
	}

	abstract protected T create();

	void initPool(int poolNum) {
		for (int i = 0; i < poolNum; i++) {
			avairable.add(create());
		}
	}

	public Optional<T> checkOut() {
		Optional<T> optional = getAvairable();
		return optional.or(() -> {
			try {
				Thread.sleep(8000L);
				return getAvairable();
			} catch (InterruptedException e) {
				e.printStackTrace();
				throw new RuntimeException(e.getMessage());
			}
		});

	}

	@Override
	public synchronized String toString() {
		return String.format("Pool avairable = %d, inUse = %d", avairable.size(), inUse.size());
	}

	private synchronized Optional<T> getAvairable() {
		if (!avairable.isEmpty()) {
			T instance = avairable.iterator().next();
			avairable.remove(instance);
			inUse.add(instance);
			return Optional.of(instance);
		}
		return Optional.empty();
	}

	public synchronized void checkIn(T instance) {
		inUse.remove(instance);
		avairable.add(instance);
		System.out.println(this);
	}

}
