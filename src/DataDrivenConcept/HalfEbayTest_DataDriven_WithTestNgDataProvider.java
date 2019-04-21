package DataDrivenConcept;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.utility.TestUtil;

public class HalfEbayTest_DataDriven_WithTestNgDataProvider {
  
	WebDriver driver;
	@BeforeMethod
	public void Setup() throws InterruptedException{
		
		
			  
			  System.setProperty("webdriver.chrome.driver","C://Users//Bilal.Mubarik//workspace//Velocity_SanityTestConversion//Velocity_SanityTestConversion//Velocity_SanityTestConversion//Installation//chromedriver.exe");
			  driver=new ChromeDriver();
			  driver.manage().window().maximize();
			  
			  driver.get("https://reg.ebay.com/reg/PartialReg");
			  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			  driver.manage().timeouts().pageLoadTimeout(300, TimeUnit.SECONDS);
	}
	
	
	@AfterMethod
	public void teardown(){
		driver.close();
	}
	
	
	@DataProvider()
	public Iterator<Object[]> getTestData(){
		ArrayList<Object[]> Testdata=TestUtil.getDatafromExcel();
		return Testdata.iterator();
	}
	
	
	
	
	@Test(dataProvider="getTestData")
  public void HalfEbay(String firstname,String lastname,String Email,String Password) {
  
		//enter data:
		driver.findElement(By.xpath("//*[@id='firstname']")).clear();
		driver.findElement(By.xpath("//*[@id='firstname']")).sendKeys(firstname);
		
		driver.findElement(By.xpath("//*[@id='lastname']")).clear();
		driver.findElement(By.xpath("//*[@id='lastname']")).sendKeys(lastname);
		
		driver.findElement(By.xpath("//*[@id='email']")).clear();
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys(Email);
		
		driver.findElement(By.xpath("//*[@id='PASSWORD']")).clear();
		driver.findElement(By.xpath("//*[@id='PASSWORD']")).sendKeys(Password);
		
		driver.findElement(By.xpath("//*[@id='ppaFormSbtBtn']")).click();
		
		
	
	}
}
