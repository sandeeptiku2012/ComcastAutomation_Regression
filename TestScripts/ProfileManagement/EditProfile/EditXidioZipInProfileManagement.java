package ProfileManagement.EditProfile;

import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import ConfigServices.AppProperties;
import Core.AnnotationFunctions.BaseTest;
import Core.UserLoginFunctions.UserLoginFunctions;

public class EditXidioZipInProfileManagement extends BaseTest{
 
  @Test
  public void testEditXidioZipInProfileManagement() throws Exception {
	UserLoginFunctions userLogin=new UserLoginFunctions();
    driver.get(AppProperties.APPURL);

    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Sign In[\\s\\S]*$"));
    
    userLogin.UserLoginCredentials(driver);
    
    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*XIDIO[\\s\\S]*$"));
    
    driver.findElement(By.linkText(AppProperties._USER_NAME)).click();
    
    assertEquals(AppProperties._ZIP, driver.findElement(By.name("user[zip]")).getAttribute("value"));
    
    driver.findElement(By.name("user[zip]")).clear();
    driver.findElement(By.name("user[zip]")).sendKeys(AppProperties._UPD_ZIP);
    driver.findElement(By.linkText("Save profile")).click();

    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*XIDIO[\\s\\S]*$"));
    driver.findElement(By.linkText(AppProperties._USER_NAME)).click();
    assertEquals(AppProperties._UPD_ZIP, driver.findElement(By.name("user[zip]")).getAttribute("value"));
    driver.findElement(By.linkText("Sign out")).click();
  }
}
