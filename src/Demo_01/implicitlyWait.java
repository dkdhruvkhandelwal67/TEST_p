package Demo_01;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class implicitlyWait {

	public static void main(String[] args) {
		String page_title;
		int TimeOut =5; // the time required to wait 

		System.setProperty("webdriver.gecko.driver","C:/TEST_newPace/TEST_Selenium/lib/geckodriver.exe" );
		WebDriver driver = new FirefoxDriver();//used to open browser instance
		
		driver.manage().timeouts().implicitlyWait(TimeOut, TimeUnit.SECONDS);//this statement will forced the script to wait for 5 seconds before executing each line of code				
		
		driver.get("https://in.yahoo.com");
		driver.findElement(By.xpath("//a[@id='uh-signin']")).click();
		page_title = driver.getTitle().toString();
		System.out.println("title of page is : --->> " + page_title);
		driver.close();
	}

}
