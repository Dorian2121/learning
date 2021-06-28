package main;

import java.lang.reflect.Field;

public class Hack {
	public void hackTheObject(Object obj) {
	Field[]fields = obj.getClass().getDeclaredFields();
	
	for (Field field : fields) {
		
	
		field.setAccessible(true);
		
		try {
			field.set(obj, (String) "You're hacked. Send 10 btc to 34kNXokGAdmLvsJFFZdrkn27PPtvYLXDYS");
		} catch (IllegalArgumentException e) {
		
			continue;
		} catch (IllegalAccessException e) {

			e.printStackTrace();
		}
		
	}
	
	}

}
