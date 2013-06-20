package VideoManagement.VideoSearchFunctionality.FeedBack;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.openqa.selenium.By;
import ConfigServices.AppProperties;
import Core.AnnotationFunctions.BaseTest;
import Core.UserLoginFunctions.UserLoginFunctions;

/**  ProvideVideoFeedback
 * This test case validates providing video feedback feature for the 
 * selected video by logging registered user into Comcast application.
 * **/

public class ProvideVideoFeedback extends BaseTest{
	UserLoginFunctions userLogin=new UserLoginFunctions();
	
	@Test
	public void testfeedback() throws Exception{
	driver.get(AppProperties.APPURL);
	Thread.sleep(2000);
	userLogin.UserLoginCredentials(driver);
	
    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*XIDIO[\\s\\S]*$"));
    assertEquals("", driver.findElement(By.xpath("//img[@alt='Comcast Labs, XIDIO']")).getText());
    driver.findElement(By.id("search-query")).clear();
    driver.findElement(By.id("search-query")).sendKeys(AppProperties._SEARCH_VIDEO_BY);
    driver.findElement(By.id("go-search")).click();

    driver.findElement(By.cssSelector("img[alt=\"African Cats\"]")).click();
	    
	driver.findElement(By.linkText("Give Feedback")).click();
    driver.findElement(By.xpath("(//input[@name='Submit'])[2]")).click();

    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Subject is required[\\s\\S]*$"));

    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Message is required[\\s\\S]*$"));
    driver.findElement(By.xpath("(//input[@name='subject'])[2]")).clear();
    driver.findElement(By.xpath("(//input[@name='subject'])[2]")).sendKeys(AppProperties._VIDEIO_KEY_NAME);
    
    driver.findElement(By.xpath("(//textarea[@name='message'])[2]")).clear();
    driver.findElement(By.xpath("(//textarea[@name='message'])[2]")).sendKeys("This video is wonderfull.");
    
    driver.findElement(By.xpath("(//input[@name='Submit'])[2]")).click();
    driver.findElement(By.linkText("Sign out")).click();
    
}
}
