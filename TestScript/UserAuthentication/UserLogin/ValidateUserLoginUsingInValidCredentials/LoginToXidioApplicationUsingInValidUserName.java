package UserAuthentication.UserLogin.ValidateUserLoginUsingInValidCredentials;

import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import ConfigServices.AppProperties;
import Core.AnnotationFunctions.BaseTest;

public class LoginToXidioApplicationUsingInValidUserName extends BaseTest{
  
  @Test
  public void testLoginToXidioApplicationUsingInValidUName() throws Exception {
    driver.get(AppProperties.APPURL);

    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Sign In[\\s\\S]*$"));
    driver.findElement(By.name("user[user_name]")).clear();
    driver.findElement(By.name("user[user_name]")).sendKeys(AppProperties._INVALID_USER_NAME);
    
    driver.findElement(By.name("user[password]")).clear();
    driver.findElement(By.name("user[password]")).sendKeys(AppProperties._PASSWORD);
    driver.findElement(By.id("user_login")).click();

    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Incorrect username or password[\\s\\S]*$"));
  }
}

