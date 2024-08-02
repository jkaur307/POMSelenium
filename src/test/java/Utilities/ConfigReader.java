package Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	public Properties prop;
	public FileInputStream ip;
	
	
	public Properties initProp() throws IOException {
		
		// to get the working directory or current project folder structure
		System.out.println(System.getProperty("user.dir"));
		
		 prop=new Properties();
		ip=new FileInputStream("./src/test/resources/Properties/Config.properties");
		
		prop.load(ip);
		String BrowserName=prop.getProperty("url");
		System.out.println("browser value is "+BrowserName);
		
		return prop;

	}


}
