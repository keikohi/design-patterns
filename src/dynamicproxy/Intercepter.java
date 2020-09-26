package dynamicproxy;

import java.lang.reflect.Proxy;

import com.sun.tools.javac.Main;

public class Intercepter {
	static public Object intercept(Object target, Runnable before, Runnable after) {
		Class<?>[] interfaces = target.getClass().getInterfaces();
		return Proxy.newProxyInstance(Main.class.getClassLoader(), interfaces, new DynamicProxy(target, before, after));

	}
}
