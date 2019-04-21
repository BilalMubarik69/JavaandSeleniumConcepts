package DataDrivenConcept;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.test.utility.Xls_Reader;

public class HalfEbayTest_DataDriven_WithExcelOnly {
  
	WebDriver driver;
	Xls_Reader reader;
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
	
	
	
	
	
	
	@Test()
  public void HalfEbay() {
  
		reader=new Xls_Reader("D://HalfEbayTestData.xlsx");
		
		int columncount=reader.getColumnCount("Data");
		System.out.println(columncount);
		
		int rowcount1=reader.getRowCount("Data");
		System.out.println(rowcount1);
		
		int rowcount=reader.getRowCount("Data");
		
		if(!reader.isSheetExist("Bilal")){
		reader.addSheet("Bilal");
		}
		reader.addColumn("Data", "Status");
		
		for(int rowNum=2; rowNum<=rowcount;rowNum++)
		{
		
		String firstName=reader.getCellData("Data", "firstname", rowNum);
		
		System.out.println(firstName);
		String lastName=reader.getCellData("Data", "lastname", rowNum);
		
		System.out.println(lastName);
		
        String EmailAddress=reader.getCellData("Data", "Email", rowNum);
		
		System.out.println(EmailAddress);
		
        String Password=reader.getCellData("Data", "Password", rowNum);
		
		System.out.println(Password);
		
		//enter data:
		driver.findElement(By.xpath("//*[@id='firstname']")).clear();
		driver.findElement(By.xpath("//*[@id='firstname']")).sendKeys(firstName);
		
		driver.findElement(By.xpath("//*[@id='lastname']")).clear();
		driver.findElement(By.xpath("//*[@id='lastname']")).sendKeys(lastName);
		
		driver.findElement(By.xpath("//*[@id='email']")).clear();
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys(EmailAddress);
		
		driver.findElement(By.xpath("//*[@id='PASSWORD']")).clear();
		driver.findElement(By.xpath("//*[@id='PASSWORD']")).sendKeys(Password);
		
		driver.findElement(By.xpath("//*[@id='ppaFormSbtBtn']")).click();
		
		reader.setCellData("Data", "Status", rowNum, "Pass");
		
		}
	
	  
	}
}
