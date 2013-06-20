package UserAuthentication.ResettingPassword;

import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import ConfigServices.AppProperties;
import Core.AnnotationFunctions.BaseTest;

public class ResetXidioPasswordWithoutProvidingEmailID extends BaseTest{
 
  @Test
  public void testResetXidioPasswordWithoutProvidingEmailID() throws Exception {
    driver.get(AppProperties.APPURL);

    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Sign In[\\s\\S]*$"));
    driver.findElement(By.linkText("Reset password")).click();

    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*User Account[\\s\\S]*$"));
    driver.findElement(By.id("user_login")).click();
    driver.findElement(By.cssSelector("#uniform-user_login > span")).click();

    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Email is wrong[\\s\\S]*$"));
    
  //Need to check email to confirm email has not received.
	//==================================================================
  }
}

