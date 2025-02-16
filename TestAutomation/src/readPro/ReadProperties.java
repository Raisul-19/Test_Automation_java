package readPro;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadProperties {
	public static void main(String[] args) {
		
		ClassLoader loader = Thread.currentThread().getContextClassLoader();
//		InputStream stream = loader.getResourceAsStream("config.properties");
		InputStream stream = loader.getResourceAsStream("config.properties");
		Properties prop = new Properties();
		
		try {
			prop.load(stream);
			
			System.out.println(prop.getProperty("qaurl"));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
