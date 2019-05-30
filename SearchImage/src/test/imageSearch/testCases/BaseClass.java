package imageSearch.testCases;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;


public class BaseClass {
	
	public String url = "https://www.google.com/";
	public static WebDriver driver = null;
	
	@BeforeClass
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
	}
	
//	@AfterClass
	public void closeBrowser()
	{
		driver.quit();
	}
	

}
