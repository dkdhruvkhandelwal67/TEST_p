package Demo_2;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class List_01 {
	
	 

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:/TEST_newPace/TEST_Selenium/lib/geckodriver.exe" );

		WebDriver driver = new FirefoxDriver();//used to open browser instance
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("Automation");
		//used in selenium
		List<WebElement> ls = driver.findElements(By.xpath("//input[@aria-label='Google Search']"));
		ls.get(1).click();
		
		driver.close();

		//
		List<Object> lst = new ArrayList<Object>();
		lst.add("dhruv");
		lst.add(25);
		lst.add(50);
		lst.add("dhruv1");
		lst.add("dhruv2");
		lst.add("dhruv3");
		
		//for loop
		try {
			for(int i=0;i<lst.size();i++)
			{
				System.out.println(lst.size());
				System.out.println(lst.get(i));
			}
		} catch (IndexOutOfBoundsException e) {
			
			System.out.println("you are trying to fetch a value which do not exist in the stored list");
		}
	}

}
