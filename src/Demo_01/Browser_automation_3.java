package Demo_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser_automation_3 {

	
	public static void main(String[] args) {
		
		//This class will 
		String page_title;
		WebDriver driver;

		System.setProperty("webdriver.gecko.driver","C:/TEST_newPace/TEST_Selenium/lib/geckodriver.exe" );

		//driver is linked a a browser opened 
		 driver = new FirefoxDriver();//used to open browser instance


		WebDriver driver1 = new FirefoxDriver();//used to open browser instance
		WebDriver driver2 = new FirefoxDriver();//used to open browser instance
		WebDriver driver3 = new FirefoxDriver();//used to open browser instance
		 
		//Navigate to a URL and perform a click operation
		driver.get("https://in.yahoo.com");
		driver.findElement(By.xpath("//a[@id='uh-signin']")).click();
		
		driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("kiran@gmail.com");
		page_title = driver.getTitle().toString();
		System.out.println("title of page is : --->> " + page_title);
		
		driver1.close();//To close the current browser instance of a driver 
		driver2.close();//To close the current browser instance of a driver 
		driver3.close();//To close the current browser instance of a driver 

		driver.quit(); //To close all browser insance opened for a specific driver 
		
	}

}
