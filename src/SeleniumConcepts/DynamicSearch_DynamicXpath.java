package SeleniumConcepts;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import sun.security.action.GetBooleanSecurityPropertyAction;

public class DynamicSearch_DynamicXpath {

	static WebDriver driver;
	
	public  static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C://Users//Bilal.Mubarik//workspace//Velocity_SanityTestConversion//Velocity_SanityTestConversion//Velocity_SanityTestConversion//Installation//chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  
		  driver.get("https://www.google.com");
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  driver.manage().timeouts().pageLoadTimeout(300, TimeUnit.SECONDS);
		  
		  driver.findElement(By.name("q")).sendKeys("java");
          Thread.sleep(5000);
          
       List<WebElement> list =driver.findElements(By.xpath("//ul[contains(@role,'listbox')]//li/descendant::div[contains(@class,'sbtc')]"));
		  
       int size=list.size();
       
       System.out.println("size of list is:"+size);
       
       for(int i=0;i<size;i++){
    	   System.out.println(list.get(i).getText());
    	   if(list.get(i).getText().contains("java programming"))
    	   {
    		   list.get(i).click();
    		   ScreenShot("JavaProgrammingSelect");
    		   break;
    	   }
       }
      List<WebElement>links=driver.findElements(By.tagName("a"));
      int nooflinks=links.size();
      System.out.println(nooflinks);
      
      for(int i=0;i<nooflinks;i++)
      {
    	 String links_text= links.get(i).getText();
    	 System.out.println(links_text);
    	 if(links.get(i).getText().contains("Images"))
    	 {
    		 links.get(i).click();
    		 break;
    	 }
      }
	
	
	}

public static void ScreenShot(String Filename) throws IOException{
	
	 File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 
	 FileUtils.copyFile(file, new File("C://Users//Bilal.Mubarik//workspace//Java Assignments//src//SeleniumConcepts//"+Filename+".jpg"));
}



}
