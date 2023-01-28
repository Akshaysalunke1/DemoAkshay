package Keydrivenframework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class keyworddrivenframework {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("./data/config.properties");

		Properties prop = new Properties();

		prop.load(fis);// to read the data

		String data = prop.getProperty("Browser");

		String data1 = prop.getProperty("username");
		System.out.println(data);
		System.out.println(data1);
	}

}
