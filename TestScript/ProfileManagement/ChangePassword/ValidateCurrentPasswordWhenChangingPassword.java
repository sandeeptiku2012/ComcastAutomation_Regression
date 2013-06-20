package ProfileManagement.ChangePassword;

import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;

import ConfigServices.AppProperties;
import Core.AnnotationFunctions.BaseTest;
import Core.UserLoginFunctions.UserLoginFunctions;
import DataServices.UserRegistrationUsingComcast.UserRegistrationUsingComcast;

public class ValidateCurrentPasswordWhenChangingPassword extends BaseTest{
 UserLoginFunctions userLogFun=new UserLoginFunctions();
 
  @Test
  public void testValidateCurrentPasswordWhenChangingPassword() throws Exception {
	UserRegistrationUsingComcast userReg=new UserRegistrationUsingComcast();
	userReg.testUserRegistrationUsingComcast(driver);
	
	driver.get(AppProperties.APPURL);
    
	userLogFun.UserLoginCredentials(driver);
    
    driver.findElement(By.linkText(AppProperties._USER_NAME)).click();
    
    driver.findElement(By.linkText("Change password")).click();
    driver.findElement(By.name("old_password")).clear();
    driver.findElement(By.name("old_password")).sendKeys(AppProperties._NONDIGIT_PASSWORD);
    
    driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys(AppProperties._RESET_PASSWORD);
    
    driver.findElement(By.name("confirm_password")).clear();
    driver.findElement(By.name("confirm_password")).sendKeys(AppProperties._INVALID_PASSWORD);
    
    driver.findElement(By.name("commit")).click();
    //driver.findElement(By.cssSelector("#uniform-undefined > span")).click();
   
    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Password has not been updated[\\s\\S]*$"));

    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*User Account[\\s\\S]*$"));
    driver.findElement(By.linkText("Sign out")).click();
  }
}

