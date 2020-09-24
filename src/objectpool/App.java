package objectpool;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Optional;

import org.junit.Test;

public class App {
	@Test
	public void Test() {
		ConnectionPool pool = new ConnectionPool(2);

		Connection conn1 = pool.checkOut().get();

		Connection conn2 = pool.checkOut().get();

		{
			Optional<Connection> conn3 = pool.checkOut();
			assertEquals(conn3, Optional.empty());
		}

		pool.checkIn(conn1);
		{
			// conn1 のオブジェクト参照は残る
			Optional<Connection> conn3 = pool.checkOut();
			assertEquals(conn3.get(), conn1);
		}

	}

	@Test
	public void ThreadTest() {
		ConnectionPool pool = new ConnectionPool(1);

		Runnable checkoutAndCheckin = () -> {
			Connection conn1 = pool.checkOut().get();
			try {
				System.out.println("use Object for 3 seconds..");
				Thread.sleep(3000L);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("checkin Object!!");
			pool.checkIn(conn1);
		};

		Runnable waitCheckout = () -> {
			Optional<Connection> op = pool.checkOut();
			assertEquals(op.isPresent(), true);
		};

		new Thread(checkoutAndCheckin).start();
		new Thread(waitCheckout).start();

		try {
			Thread.sleep(8000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
