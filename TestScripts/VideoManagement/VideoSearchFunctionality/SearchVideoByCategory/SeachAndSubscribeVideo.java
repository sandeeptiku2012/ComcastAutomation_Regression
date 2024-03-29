package VideoManagement.VideoSearchFunctionality.SearchVideoByCategory;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.openqa.selenium.By;
import ConfigServices.AppProperties;
import Core.AnnotationFunctions.BaseTest;
import Core.UserLoginFunctions.UserLoginFunctions;

/**  SeachAndSubscribeVideo
 * This test case validates video search functionality and video subscribing 
 * selected video by logging registered user into Comcast application.
 * **/

public class SeachAndSubscribeVideo extends BaseTest{
	UserLoginFunctions userLogin=new UserLoginFunctions();
	
	@Test
	  public void testSearchVideoSubscriptionFeedback() throws Exception {
		driver.get(AppProperties.APPURL);
		Thread.sleep(2000);
		
		userLogin.UserLoginCredentials(driver);
	       
	    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*XIDIO[\\s\\S]*$"));
	    assertEquals("", driver.findElement(By.xpath("//img[@alt='Comcast Labs, XIDIO']")).getText());
	    driver.findElement(By.id("search-query")).clear();
	    driver.findElement(By.id("search-query")).sendKeys(AppProperties._SEARCH_VIDEO_BY);
	    driver.findElement(By.id("go-search")).click();

	    driver.findElement(By.cssSelector("img[alt=\"African Cats\"]")).click();
	    
	    driver.findElement(By.linkText("Subscribe")).click();
	    
	    //driver.findElement(By.name("pin_code")).clear();
	    //driver.findElement(By.name("pin_code")).sendKeys(AppProperties._INVALID_CC_PIN_CODE);
	    
	    //driver.findElement(By.cssSelector("fieldset > input[type=\"submit\"]")).click();

	    Thread.sleep(4000);
	    //driver.findElement(By.linkText("Subscribe")).click();
	    
	    driver.findElement(By.name("pin_code")).clear();
	    driver.findElement(By.name("pin_code")).sendKeys(AppProperties._CC_PIN_CODE);
	    driver.findElement(By.cssSelector("fieldset > input[type=\"submit\"]")).click();

	    driver.findElement(By.linkText("Sign out")).click();
	  }
}
