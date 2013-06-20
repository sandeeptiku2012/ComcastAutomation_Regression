package UserAuthentication.UserLogin.ValidateUserLoginUsingValidCredentials;

import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;

import ConfigServices.AppProperties;
import Core.AnnotationFunctions.BaseTest;

public class LoginToXidioApplicationWithValidCredentials extends BaseTest{
 
  @Test
  public void testLoginToCamcast() throws Exception {
	driver.get(AppProperties.APPURL);

    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*User name[\\s\\S]*$"));
    driver.findElement(By.name("user[user_name]")).clear();
    driver.findElement(By.name("user[user_name]")).sendKeys(AppProperties._USER_NAME);

    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Password[\\s\\S]*$"));
    driver.findElement(By.name("user[password]")).clear();
    driver.findElement(By.name("user[password]")).sendKeys(AppProperties._PASSWORD);
    driver.findElement(By.id("user_login")).click();

    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Sign out[\\s\\S]*$"));
    driver.findElement(By.linkText("Sign out")).click();
  }
}
