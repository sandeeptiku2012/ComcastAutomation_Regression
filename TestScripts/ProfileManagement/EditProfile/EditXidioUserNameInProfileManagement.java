package ProfileManagement.EditProfile;

import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;

import ConfigServices.AppProperties;
import Core.AnnotationFunctions.BaseTest;
import Core.UserLoginFunctions.UserLoginFunctions;

/**  EditXidioUserNameInProfileManagement
 * This test case validates changing user profile feature
 * by logging registered user into Comcast application.
 * **/

public class EditXidioUserNameInProfileManagement extends BaseTest{
  
  @Test
  public void testEditXidioUserNameInProfileManagement() throws Exception {
	UserLoginFunctions userLogin=new UserLoginFunctions();
	driver.get(AppProperties.APPURL);
	
	userLogin.UserLoginCredentials(driver);
    
    driver.findElement(By.linkText(AppProperties._USER_NAME)).click();
    driver.findElement(By.name("user[first_name]")).clear();
    driver.findElement(By.name("user[first_name]")).sendKeys(AppProperties._UPD_FIRST_NAME);
    driver.findElement(By.linkText("Save profile")).click();
    
    assertEquals("", driver.findElement(By.cssSelector("img[alt=\"Comcast Labs, XIDIO\"]")).getText());
    driver.findElement(By.linkText(AppProperties._USER_NAME)).click();
    
    driver.findElement(By.linkText("Sign out")).click();
  }
}

