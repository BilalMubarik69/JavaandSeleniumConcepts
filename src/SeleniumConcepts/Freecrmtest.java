package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Freecrmtest {
  
	WebDriver driver;
	
  @Test
  public void Test() throws InterruptedException {
  
	  
	  System.setProperty("webdriver.chrome.driver","C://Users//Bilal.Mubarik//workspace//Velocity_SanityTestConversion//Velocity_SanityTestConversion//Velocity_SanityTestConversion//Installation//chromedriver.exe");
	  driver=new ChromeDriver();
	  
	  driver.get("https://www.freecrm.com/");
	  
	  Thread.sleep(5000);
	  
	  
	  
	  String adminCredentails=HashMapConcept_Data.GetUserInfo().get("admin");
	  String[] cred=adminCredentails.split("_");
	  
	  for(int i=0;i<cred.length;i++){
		  System.out.println(cred[i]);
	  }
	 
	  driver.findElement(By.name("username")).sendKeys(cred[0]);
	  driver.findElement(By.name("password")).sendKeys(cred[1]);
	  
	  driver.findElement(By.name("username")).clear();
	  driver.findElement(By.name("password")).clear();
	  
	  Thread.sleep(5000);
	  
	  String customer=HashMapConcept_Data.GetUserInfo().get("customer");
	  String[] cust=customer.split("_");
	  
	  driver.findElement(By.name("username")).sendKeys(cust[0]);
	  driver.findElement(By.name("password")).sendKeys(cust[1]);
	  
	  
	 
	  
  
  }
}
