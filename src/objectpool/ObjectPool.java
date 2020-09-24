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

	public synchronized Optional<T> checkOut() {
		if (!avairable.isEmpty()) {
			T t = getAvairable();
			System.out.println(String.format("checkout = %s", t));
			return Optional.of(t);
		}
		try {
			System.out.println("Waiting to checkout objects ....");
			Thread.sleep(5000L);
			if (!avairable.isEmpty()) {
				T t = getAvairable();
				System.out.println(String.format("checkouted while waiting : %s", t));
				return Optional.of(t);
			}
			return Optional.empty();

		} catch (InterruptedException e) {
			e.printStackTrace();
			return Optional.empty();
		}
	}

	@Override
	public synchronized String toString() {
		return String.format("Pool avairable = %d, inUse = %d", avairable.size(), inUse.size());
	}

	private T getAvairable() {
		T instance = avairable.iterator().next();
		avairable.remove(instance);
		inUse.add(instance);
		return instance;
	}

	public synchronized void checkIn(T instance) {
		inUse.remove(instance);
		avairable.add(instance);
	}

}
