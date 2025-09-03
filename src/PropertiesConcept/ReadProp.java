package PropertiesConcept;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProp {

	public static final String CONFIG_FILE_PATH = "./src/PropertiesConcept/config.properties";

	public static void main(String[] args) {
		Properties prop = null;
		try {
			FileInputStream ip = new FileInputStream(CONFIG_FILE_PATH);
			prop = new Properties();
			prop.load(ip);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		String browserName = prop.getProperty("browser");
		System.out.println("browser name is :" + browserName);

		switch (browserName.trim().toLowerCase()) {
		case "chrome":
			System.out.println("launch chrome");
			break;
		case "firefox":
			System.out.println("launch ff");
			break;
		case "edge":
			System.out.println("launch edge");
			break;
		default:
			throw new RuntimeException("invalid browser...");
		}

		String appUrl = prop.getProperty("url");
		System.out.println("app url : " + appUrl);

		// use cases:
		// 1. to maintain configuration/environment data in my framework
		// 2. to maintain application environment specific data: dev/qa/stage/uat/prod
		// 3. never user prop files for test data/locators

		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("header"));

	}

}
