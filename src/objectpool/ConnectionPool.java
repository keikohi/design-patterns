package objectpool;

public class ConnectionPool extends ObjectPool<Connection> {

	public ConnectionPool(int poolNum) {
		super(poolNum);
	}

	@Override
	protected Connection create() {
		return new Connection();
	}
}
