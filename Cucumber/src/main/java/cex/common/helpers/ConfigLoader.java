package cex.common.helpers;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigLoader {

	private static Properties properties = new Properties();

	public static String getValue(String key) {

		if ((key == null) || key.isEmpty()) {
			return "Key not matched";
		} else {
			return properties.getProperty(key);
		}
	}

	public static void loadConfig(String fileName) {

		try {
			FileInputStream is = new FileInputStream(fileName);
			properties.load(is);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
