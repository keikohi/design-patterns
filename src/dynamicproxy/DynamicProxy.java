package dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxy implements InvocationHandler {

	private final Object object;
	private final Runnable before;
	private final Runnable after;

	public DynamicProxy(Object object, Runnable before, Runnable after) {
		this.object = object;
		this.before = before;
		this.after = after;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		before.run();
		Object ret = method.invoke(object, args);
		after.run();
		return ret;
	}

}
