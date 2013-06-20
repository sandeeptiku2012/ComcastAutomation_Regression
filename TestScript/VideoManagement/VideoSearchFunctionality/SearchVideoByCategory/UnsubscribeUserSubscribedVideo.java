package VideoManagement.VideoSearchFunctionality.SearchVideoByCategory;

import org.junit.Test;
import org.openqa.selenium.By;
import ConfigServices.AppProperties;
import Core.AnnotationFunctions.BaseTest;
import Core.UserLoginFunctions.UserLoginFunctions;

/**  UnsubscribeUserSubscribedVideo
 * This test case validates un-subscription of video feature for the 
 * subscribed video by logging registered user into Comcast application.
 * **/

public class UnsubscribeUserSubscribedVideo extends BaseTest{
	UserLoginFunctions userLogin=new UserLoginFunctions();
	
	@Test
	public void testSearchSubscribedVideoAndUnsubscribe() throws Exception {
	driver.get(AppProperties.APPURL);
	Thread.sleep(2000);
	
	userLogin.UserLoginCredentials(driver);
	
	driver.findElement(By.linkText("My Channels")).click();
    
    driver.findElement(By.id("search-query")).clear();
    driver.findElement(By.id("search-query")).sendKeys(AppProperties._SEARCH_VIDEO_BY);
    driver.findElement(By.id("go-search")).click();
    
    driver.findElement(By.cssSelector("img[alt=\"African Cats\"]")).click();
    driver.findElement(By.linkText("Unsubscribe")).click();
    
    driver.findElement(By.cssSelector("fieldset.unsubscribed > input[type=\"submit\"]")).click();

    driver.findElement(By.linkText("Sign out")).click();
}
}

