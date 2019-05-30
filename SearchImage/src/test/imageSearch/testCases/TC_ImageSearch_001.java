package imageSearch.testCases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import imageSearch.pageObjects.GoogleHomePageElements;
import imageSearch.utilities.Screenshot;
import junit.framework.Assert;

public class TC_ImageSearch_001 extends BaseClass {
	
	@Test
	public void image()
	{
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		logger.info("Browser opened");
		GoogleHomePageElements googlePage = new GoogleHomePageElements(driver);
		googlePage.imageClick();
		logger.info("Image link is clicked successfully");
		googlePage.searchByImageClick();
		logger.info("Image is clicked successfully");
		googlePage.pasteImageUrl();
		logger.info("Url is pasted successfully");
		googlePage.searchByImageButtonClick();
		logger.info("Search image button is clicked successfully");
		googlePage.selectConfigElement();
		logger.info("Selected the result successfully as mentioned in the configuration file");
		driver.navigate().back();
		logger.info("Navigated successfully to the search result page");
		Assert.assertEquals("Search result is not matching", true, googlePage.searchElement());
		logger.info("Validated the Search result is matching with the image entered");
		Screenshot.captureScreenshot(driver, "lastPageScreenshot");
		logger.info("Screenshot taken successfully");
		
	}

}
