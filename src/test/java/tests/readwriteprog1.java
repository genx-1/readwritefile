package tests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class readwriteprog1 {

	public static void main(String[] args) throws IOException {
		Properties property = new Properties();
		FileInputStream inputstream = new FileInputStream("C:\\Users\\Komal\\eclipse-workspace\\readwritefile\\src\\test\\resources\\properties\\testdeta1");
		property.load(inputstream);
		System.out.println(property.getProperty("browser"));
		System.out.println(property.getProperty("url"));
		System.out.println(property.getProperty("message"));
		System.out.println(property.getProperty("title"));
		
		FileOutputStream outputstream = new FileOutputStream("C:\\Users\\Komal\\eclipse-workspace\\readwritefile\\src\\test\\resources\\properties\\testdeta1");
		property.setProperty("testmessage", "567890");
		property.store(outputstream, "this is output deta test case");
	}

}
