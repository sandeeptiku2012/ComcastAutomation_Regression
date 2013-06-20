package UserAuthentication.ResettingPassword;

import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import ConfigServices.AppProperties;
import Core.AnnotationFunctions.BaseTest;

public class ResetTheXidioPassword extends BaseTest{
  
  @Test
  public void testResetTheXidioPassword() throws Exception {
    driver.get(AppProperties.APPURL);

    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Sign In[\\s\\S]*$"));
    driver.findElement(By.linkText("Reset password")).click();

    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*User Account[\\s\\S]*$"));
    driver.findElement(By.id("user_login")).click();
    
    driver.findElement(By.cssSelector("#uniform-user_login > span")).click();
    driver.findElement(By.name("email")).clear();
    driver.findElement(By.name("email")).sendKeys(AppProperties._EMAIL);

    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Sign In[\\s\\S]*$"));
	
	//Need to check email to confirm email has been received.
	//==================================================================
	
  }
}

