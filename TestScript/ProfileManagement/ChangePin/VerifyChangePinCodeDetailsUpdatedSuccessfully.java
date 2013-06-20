package ProfileManagement.ChangePin;

import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;

import ConfigServices.AppProperties;
import Core.AnnotationFunctions.BaseTest;
import Core.UserLoginFunctions.UserLoginFunctions;
import DataServices.UserRegistrationUsingComcast.UserRegistrationUsingComcast;

public class VerifyChangePinCodeDetailsUpdatedSuccessfully extends BaseTest{
  UserLoginFunctions userLogin=new UserLoginFunctions();
  UserRegistrationUsingComcast userReg=new UserRegistrationUsingComcast();
  
  @Test
  public void testVerifyChangePinCodeDetailsUpdatedSuccessfully() throws Exception {
	userReg.testUserRegistrationUsingComcast(driver);
	  
	driver.get(AppProperties.APPURL);
    
    userLogin.UserLoginCredentials(driver);
    
    userLogin.ChangePassword(driver);
    
    driver.findElement(By.linkText(AppProperties._USER_NAME)).click();
    
    driver.findElement(By.linkText("Change pin code")).click();
    driver.findElement(By.name("cc_pin_code")).clear();
    driver.findElement(By.name("cc_pin_code")).sendKeys(AppProperties._CC_PIN_CODE);
    
    driver.findElement(By.name("commit")).click();
    
    driver.findElement(By.cssSelector("div.right > #uniform-undefined > span")).click();
    
    driver.findElement(By.name("password")).clear();
    driver.findElement(By.name("password")).sendKeys(AppProperties._PASSWORD);
    
    assertEquals("", driver.findElement(By.cssSelector("img[alt=\"Comcast Labs, XIDIO\"]")).getText());
    
    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*XIDIO[\\s\\S]*$"));
    driver.findElement(By.linkText("Sign out")).click();
  }
}

