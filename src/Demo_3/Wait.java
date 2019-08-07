package Demo_3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {

	public static void main(String[] args) {
		
		
//		Implicit wait -When we use this wait each code statement will wait for the specified time before execution
//		Explicit wait -When we use this wait , only the statement for which it is used will wait for specified time before execution
		
		
		
		System.setProperty("webdriver.gecko.driver","C:/TEST_newPace/TEST_Selenium/lib/geckodriver.exe" );
		WebDriver driver = new FirefoxDriver();
		
		 //Explicit wait....................
		WebDriverWait wait=new WebDriverWait(driver, 10);
		
		driver.get("https://in.yahoo.com");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);// implicit wait..........

		driver.findElement(By.xpath("//a[@id='uh-signin']")).click();
		
		//Explicit wait....................
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='login-username']")));
		driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("kiran@gmail.com");
		

	}

}
