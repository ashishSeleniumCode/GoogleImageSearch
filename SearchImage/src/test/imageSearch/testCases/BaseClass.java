package imageSearch.testCases;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;


public class BaseClass {
	
	public String url = "https://www.google.com/";
	public static WebDriver driver = null;
	public static Logger logger;
	
	@Parameters("browser")
	
	@BeforeClass
	public void setup(String br)
	{
		logger = Logger.getLogger("Google Search");
		PropertyConfigurator.configure("Log4j.properties");
		
		if (br.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
			driver= new ChromeDriver();
			driver.manage().window().maximize();
		}
		
		else if (br.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"//Drivers//geckodriver.exe");
			driver= new FirefoxDriver();
			driver.manage().window().maximize();
		}
		
		else if (br.equals("ie"))
		{
			System.setProperty("webdriver.ie.driver",System.getProperty("user.dir")+"//Drivers//IEDriverServer.exe");
			driver= new InternetExplorerDriver();
			driver.manage().window().maximize();
		}
		
		driver.get(url);
	}
	
//	@AfterClass
	public void closeBrowser()
	{
		driver.quit();
	}
	

}
