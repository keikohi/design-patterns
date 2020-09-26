package di;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class DiContainer {
	public static Object resolve(String targetType, String argType, String argObject) {

		try {
			Class<?> targetClass = Class.forName(targetType);
			Class<?> argClass = Class.forName(argType);
			Object arg = argClass.getDeclaredConstructor(Class.forName(argType)).newInstance(argObject);
			Constructor<?> constructor = targetClass.getDeclaredConstructor(Class.forName(argType));
			return constructor.newInstance(arg);

		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | IllegalArgumentException
				| InvocationTargetException | NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
			throw new IllegalArgumentException(
					String.format("cannot resolve class: %s, %s, %s", targetType, argType, argObject));
		}

	}
}
