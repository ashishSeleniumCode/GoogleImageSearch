package imageSearch.testCases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import imageSearch.pageObjects.GoogleHomePageElements;
import imageSearch.utilities.Screenshot;

public class TC_ImageSearch_001 extends BaseClass {
	
	@Test
	public void image()
	{
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		GoogleHomePageElements googlePage = new GoogleHomePageElements(driver);
		googlePage.imageClick();
		googlePage.searchByImageClick();
		googlePage.pasteImageUrl();
		googlePage.searchByImageButtonClick();
		googlePage.selectConfigElement();
		driver.navigate().back();
		googlePage.searchElement();
		Screenshot.captureScreenshot(driver, "lastPageScreenshot");
		
	}

}
