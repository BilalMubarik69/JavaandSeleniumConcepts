package DataDrivenConcept;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.test.utility.Xls_Reader;

public class WritingDataFromWebTables_ToExcel {
static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C://Users//Bilal.Mubarik//workspace//Velocity_SanityTestConversion//Velocity_SanityTestConversion//Velocity_SanityTestConversion//Installation//chromedriver.exe");
		 
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/sql/sql_select.asp");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(300, TimeUnit.SECONDS);
		
		//Get the table row count
		//List<WebElement>table=driver.findElements(By.xpath("//*[@id='main']/div[5]/table/tbody"));
		
		//int rowcount=table.size();
		
		//System.out.println(rowcount);
		//*[@id="main"]/div[5]/table/tbody/tr[2]/td[2]
		//*[@id="main"]/div[5]/table/tbody/tr[3]/td[2]
		
		String beforexpath="//*[@id='main']/div[5]/table/tbody/tr[";
		String afterxpath="]/td[2]";
		
		List<WebElement>table=driver.findElements(By.xpath("//*[@id='main']/div[5]/table/tbody/tr"));
		int size=table.size();
		System.out.println(size);
		
		Xls_Reader reader= new Xls_Reader("D://HalfEbayTestData.xlsx");
		
		if(!reader.isSheetExist("WebTables"))
		{
		reader.addSheet("WebTables");
		reader.addColumn("WebTables","CustomerName");
		}
		
		
		for(int i=2;i<=size;i++)
		{
			String data=driver.findElement(By.xpath(beforexpath+i+afterxpath)).getText();
			System.out.println(data);
			reader.setCellData("WebTables", "CustomerName", i, data);
		}

	}

}
