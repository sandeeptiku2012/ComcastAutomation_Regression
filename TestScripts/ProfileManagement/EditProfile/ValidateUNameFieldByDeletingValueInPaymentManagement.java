package ProfileManagement.EditProfile;

import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import ConfigServices.AppProperties;
import Core.AnnotationFunctions.BaseTest;
import Core.UserLoginFunctions.UserLoginFunctions;

public class ValidateUNameFieldByDeletingValueInPaymentManagement extends BaseTest{
 
  @Test
  public void testValidateUserNameFieldByDeletingValueInPM() throws Exception {
	UserLoginFunctions userLogin=new UserLoginFunctions();
	driver.get(AppProperties.APPURL);
	
	userLogin.UserLoginCredentials(driver);
    
    driver.findElement(By.linkText(AppProperties._USER_NAME)).click();
    driver.findElement(By.name("user[first_name]")).clear();
    driver.findElement(By.name("user[first_name]")).sendKeys("");
    driver.findElement(By.linkText("Save profile")).click();
    
    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*First name is required[\\s\\S]*$"));
    driver.findElement(By.linkText("Sign out")).click();
  }
}
