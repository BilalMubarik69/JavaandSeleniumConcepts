package SeleniumConcepts;

import java.io.IOException;
import java.net.HttpURLConnection;

import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Broken {
static WebDriver driver;
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C://Users//Bilal.Mubarik//workspace//Velocity_SanityTestConversion//Velocity_SanityTestConversion//Velocity_SanityTestConversion//Installation//chromedriver.exe");
		  driver=new ChromeDriver();
		  
		  driver.get("http://the-internet.herokuapp.com/broken_images");
		  
		  driver.manage().window().maximize();
		  
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  
		  driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		  
		List<WebElement> links= driver.findElements(By.tagName("a"));
		
		int linkssize=links.size();
		
		System.out.println("The Size of total Number of links on page is:"+linkssize);
		
		for(int i=0;i<linkssize;i++)
		{
			WebElement Element=links.get(i);
			//System.out.println(Element);
			
			String url=Element.getAttribute("href");
			//System.out.println(url);
			VerifyLinks(url);
		
		}
	

	
}
	
	

public static void VerifyLinks(String url) throws IOException{
    try{
	URL linkurl=new URL(url);
	
	HttpURLConnection httpURLConnect=(HttpURLConnection) linkurl.openConnection();
	
	httpURLConnect.connect();
	
	if(httpURLConnect.getResponseCode()==200)
	{
		System.out.println(linkurl+"-"+httpURLConnect.getResponseMessage());
	}
 if(httpURLConnect.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND)
	{
		System.out.println(linkurl+"-"+httpURLConnect.getResponseCode()+"Broken");
	}
		
    }catch(IOException e){
    	
    }

}
}