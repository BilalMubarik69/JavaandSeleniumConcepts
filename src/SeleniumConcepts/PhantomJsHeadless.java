package SeleniumConcepts;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

public class PhantomJsHeadless {
    static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("phantomjs.binary.path","C://Users//Bilal.Mubarik//Downloads//phantomjs-2.1.1-windows//phantomjs-2.1.1-windows//bin//phantomjs.exe");
		  driver=new PhantomJSDriver();
		  
		  driver.get("https://www.freecrm.com/");
		  
		  Thread.sleep(5000);
		  
		

		String title=driver.getTitle();
		System.out.println(title);
		
		assertEquals(title,"Free CRM software in the cloud for sales and service","Title displayed Unsuccessfull");
		

	}

}
