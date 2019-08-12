package Screenshot;

import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Test_screenshot {

	public static void main(String[] args) throws Exception {
		String date;

		System.setProperty("webdriver.gecko.driver","C:/TEST_newPace/TEST_Selenium/lib/geckodriver.exe" );
		date =Test_screenshot.Fetch_data();
        String fileWithPath = "C:\\TEST_newPace\\TEST_Selenium\\Screenshots\\test_" +date +".png";
		WebDriver driver = new FirefoxDriver();//used to open browser instance
		try {
		driver.get("https://in.yahoo.com");
		driver.findElement(By.xpath("//a[@id='uh-signin']")).click();
		//driver.findElement(By.xpath("//*[@id='login-username']")).sendKeys("Data@mail.com");
		driver.findElement(By.xpath("//*[@id='login-usern']")).sendKeys("Data@mail.com");
		}
		
		catch(Throwable e)
		{
			//take screen shot
			System.out.println("Taking the screenhot");
			e.printStackTrace();
			
			Test_screenshot.takeSnapShot(driver, fileWithPath);
			
		}
		
		driver.close();
}

	public static void takeSnapShot(WebDriver driver,String fileWithPath) throws Exception{

        //Convert web driver object to TakeScreenshot
        TakesScreenshot scrShot =((TakesScreenshot)driver);

        //Call getScreenshotAs method to create image file
                File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

            //Move image file to new destination
                File DestFile=new File(fileWithPath);

                //Copy file at destination
                FileUtils.copyFile(SrcFile, DestFile);
    }
	
	public static String Fetch_data() {
		String st ;
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		LocalDateTime now = LocalDateTime.now();  
		st= dtf.format(now).toString().replace(" ","_"); // string operation to replace a character or a list of character
		st = st.toString().replace(":","_");
		st = st.toString().replace("/","_");
		return st;
	}
	}
