package Demo_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser_Automation_2 {

	public static void main(String[] args) {
		String page_title;

		System.setProperty("webdriver.gecko.driver","C:/TEST_newPace/TEST_Selenium/lib/geckodriver.exe" );

		WebDriver driver = new FirefoxDriver();//used to open browser instance

		//Webdriver :-- Interface
		//driver :- instance of webdriver interface
		//Firefoxdriver : Class to implement webdriver interface 
		//new :- keword to allocate memory location for driver 
		
		//Navigate to a URL and perform a click operation
		driver.get("https://in.yahoo.com");
		driver.findElement(By.xpath("//a[@id='uh-signin']")).click();
		
		driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("kiran@gmail.com");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// New browser interaction commands of selenium .
		
		driver.navigate().refresh();
		
		driver.navigate().back();
		page_title = driver.getTitle().toString();
		System.out.println("title of page is : --->> " + page_title);
		driver.close();
	}

}
