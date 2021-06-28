package main;

import java.lang.reflect.Modifier;


public class Restoring {
	private StringBuilder sb = new StringBuilder();

	public String restoreClassMetainf(Class<?> clazz) {

		sb.append("class modifier " + Modifier.toString(clazz.getModifiers()) + "\n");
		sb.append("class name " + clazz.getName() + "\n");
		sb.append("class pakage " + clazz.getPackageName() + "\n");
		sb.append("class fields :" + "\n");
		decodeArrays(clazz.getDeclaredFields());
		sb.append("class constructor :" + "\n");
		decodeArrays(clazz.getDeclaredConstructors());
		sb.append("class methods :"+"\n");
		decodeArrays(clazz.getDeclaredMethods());

		return sb.toString();

	}

	private void decodeArrays(Object[] array) {
		for (int i = 0; i < array.length; i++) {
			sb.append("-" + (i + 1) + " " + array[i].toString() +"\n");

	}
	}
}
