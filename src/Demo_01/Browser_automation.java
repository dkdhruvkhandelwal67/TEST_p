package Demo_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser_automation {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver","C:/TEST_newPace/TEST_Selenium/lib/geckodriver.exe" );

		WebDriver driver = new FirefoxDriver();//used to open browser instance
		
		
		///////////////////////.................................................. 
		driver.findElement(By.name("password"));

		//Webdriver :-- Interface
		//driver :- instance of webdriver interface
		//Firefoxdriver : Class to implement webdriver interface 
		//new :- keword to allocate memory location for driver 
		
		//Navigate to a URL and perform a click operation
		driver.get("https://in.yahoo.com");
		driver.findElement(By.xpath("//a[@id='uh-signin']")).click();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("issue in thread.sleep");
		}
		
		driver.navigate().back();
		driver.close();
		
////
	}

}
