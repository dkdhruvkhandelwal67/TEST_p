package Demo_3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Fetch_data {

	public static void main(String[] args) throws IOException {

		//Pull data from a property file and use it for testing
		
		Properties prob = new Properties();
		FileInputStream fs = new FileInputStream("C:\\TEST_newPace\\TEST_Selenium\\src\\TEST_Data.properties");
	    
		prob.load(fs);
		System.out.println(prob.get("Name"));
		System.out.println(prob.get("Class"));
		System.out.println(prob.get("Rollno"));
		System.out.println(prob.get("browser"));
		
	}

}
