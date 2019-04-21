package SeleniumConcepts;

import static org.testng.Assert.assertEquals;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ObjectRepoConcept_Propertiesfile {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException {
		
		Properties prop=new Properties();
		FileInputStream ip=new FileInputStream("C://Users//Bilal.Mubarik//workspace//Java Assignments//src//SeleniumConcepts//Config.properties");
		prop.load(ip);
		
		System.out.println(prop.getProperty("firstname"));
		System.out.println(prop.getProperty("lastname"));
		
		
		
		
		System.setProperty("webdriver.chrome.driver","C://Users//Bilal.Mubarik//workspace//Velocity_SanityTestConversion//Velocity_SanityTestConversion//Velocity_SanityTestConversion//Installation//chromedriver.exe");
		  driver=new ChromeDriver();
		  
		  driver.get("https://www.freecrm.com/");
		  
		  Thread.sleep(5000);
		  
		driver.findElement(By.xpath(prop.getProperty("AboutLink_xpath"))).click(); 
		
		Thread.sleep(3000);

		String title=driver.getTitle();
		System.out.println(title);
		
		assertEquals(title,"Free CRM About Cogmento and our cloud CRM software and services","Title displayed Unsuccessfull");
	}

}
