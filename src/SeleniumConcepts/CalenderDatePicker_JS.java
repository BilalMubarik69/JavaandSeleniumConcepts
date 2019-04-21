package SeleniumConcepts;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class CalenderDatePicker_JS {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
           
		System.setProperty("webdriver.chrome.driver","C://Users//Bilal.Mubarik//workspace//Velocity_SanityTestConversion//Velocity_SanityTestConversion//Velocity_SanityTestConversion//Installation//chromedriver.exe");
		  driver=new ChromeDriver();
		  
		  
		  
		  driver.get("https://espweb.stage-asicentral.com");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  driver.manage().timeouts().pageLoadTimeout(300, TimeUnit.SECONDS);
		  
		  driver.findElement(By.xpath("//input[contains(@id,'asilogin_AsiNumber')]")).sendKeys("109480");
		  driver.findElement(By.id("asilogin_UserName")).sendKeys("bilal_corps");
		  driver.findElement(By.id("asilogin_Password")).sendKeys("bilal.1234");
		  driver.findElement(By.id("btnLogin")).click();
		  
		  Thread.sleep(10000);
		  
		  driver.findElement(By.xpath("//a[contains(text(),'Email Marketing')]")).click();
		  
		  Thread.sleep(8000);
		  
		  driver.findElement(By.xpath("//span[contains(text(),'Settings')]")).click();
		  
		  Thread.sleep(4000);
		  
		  driver.findElement(By.xpath("//*[@id='pad-wrapper']/div/div[1]/ul/li[4]/a")).click();
		  
		  Thread.sleep(4000);
		  
		  driver.findElement(By.xpath("//*[@id='pad-wrapper']/div/div[2]/div/div[1]/h1/div/button")).click();
		  
		  Thread.sleep(4000);
	
		  DateFormat formatdate=new SimpleDateFormat("MM/dd/yyyy");
		  
		  Date systemDate=new Date();
		  
		 String dateval=formatdate.format(systemDate);
	
		 System.out.println(dateval);
		 
		 WebElement date=driver.findElement(By.xpath("//*[@id='pad-wrapper']/div/div[2]/div/div[2]/div/form/div[1]/div/div/div[10]/div/div[2]/input"));
	
		 DatePickByJS(driver, date, dateval);
		 
		 WebElement date1=driver.findElement(By.xpath("//*[@id='pad-wrapper']/div/div[2]/div/div[2]/div/form/div[1]/div/div/div[11]/div/div[2]/input"));
	
		 String dates="03/13/2019";
		 
		 DatePickByJS(driver, date1, dates);
	}


public static void DatePickByJS(WebDriver driver,WebElement element,String dateval){
	
	JavascriptExecutor js=((JavascriptExecutor)driver);
	js.executeScript("arguments[0].setAttribute('value','"+dateval+"');", element);
}



}
