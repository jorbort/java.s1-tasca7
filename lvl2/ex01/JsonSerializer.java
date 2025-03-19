package lvl2.ex01;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;

public class JsonSerializer {
	
	public static void serialize(Object obj) throws IOException, IllegalAccessException{
		Class<?> objClass = obj.getClass();
		if (!objClass.isAnnotationPresent(Serializable.class)){
			throw new RuntimeException("The received object " + objClass.getSimpleName() + "is not serilizable");
		}

		Serializable annotation = objClass.getAnnotation(Serializable.class);
		String directory = annotation.directory();

		StringBuilder jsonBuilder = new StringBuilder();
		jsonBuilder.append("{\n");

		Field[] fields =objClass.getDeclaredFields();
		for (Field field : fields){
			field.setAccessible(true);
			jsonBuilder.append("  \"").append(field.getName()).append("\": \"").append(field.get(obj)).append("\",\n");
		}

		jsonBuilder.setLength(jsonBuilder.length() - 2);
		jsonBuilder.append("\n}");

		try (FileWriter writer = new FileWriter(directory + "/" + objClass.getSimpleName() + ".json")){
			writer.write(jsonBuilder.toString());
		}
	}
}
