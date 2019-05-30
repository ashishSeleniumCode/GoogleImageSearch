package imageSearch.pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import imageSearch.utilities.ReadConfig;

public class GoogleHomePageElements {
	
	public String orgVal;
	public static WebDriver ldriver = null;
	ReadConfig rc = new ReadConfig();
	
	public GoogleHomePageElements(WebDriver rdriver)
	{
		ldriver=rdriver;
	}
	
	public void imageClick()
	{
		ldriver.findElement(By.xpath("//a[contains(text(),'Images')]")).click();
	}
	
	public void searchByImageClick()
	{
		ldriver.findElement(By.xpath("//span[@class='S3Wjs']")).click();
	}
	
	public void pasteImageUrl()
	{
		ldriver.findElement(By.xpath("//input[@id='qbui']")).sendKeys("https://article.images.consumerreports.org/prod/content/dam/CRO%20Images%202019/Magazine/04April/CR-Cars-InlineHero-ComingSoon-Toyota-Supra-2-19");
	}
	
	public void searchByImageButtonClick()
	{
		ldriver.findElement(By.xpath("//input[@type='submit']")).click();
	}
	
	public void selectConfigElement()
	{
		List<WebElement> searchResults=ldriver.findElements(By.xpath("//div[@class='TbwUpd']"));
		int val = rc.selectSearchResult();
		searchResults.get(val-1).click();
	}
	
	public void searchElement()
	{
		//String expVal = "Toyota supra 2020 price";
		List<WebElement> searchResults=ldriver.findElements(By.xpath("//h3[@class='LC20lb']"));
		
		
		int size = searchResults.size();
		for (int i =0; i<size; i++)
	
		{
			orgVal = searchResults.get(i).getText();
			Assert.assertTrue(orgVal.contains("Toyota"));
		}
	
	}
	
	
	
	
	
	
}
