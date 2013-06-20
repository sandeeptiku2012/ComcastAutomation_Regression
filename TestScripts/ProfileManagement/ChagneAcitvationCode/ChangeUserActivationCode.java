package ProfileManagement.ChagneAcitvationCode;

import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.openqa.selenium.By;
import ConfigServices.AppProperties;
import Core.AnnotationFunctions.BaseTest;
import Core.UserLoginFunctions.UserLoginFunctions;

/**  ChangeUserActivationCode
 * This test case validates changing user activation code feature
 * by logging registered user into Comcast application.
 * **/

public class ChangeUserActivationCode extends BaseTest{
	UserLoginFunctions userLogin=new UserLoginFunctions();
	
	@Test
	public void testChangeActivationCode() throws Exception {
	driver.get(AppProperties.APPURL);
	userLogin.UserLoginCredentials(driver);
    
    driver.findElement(By.linkText(AppProperties._USER_NAME)).click();
    driver.findElement(By.linkText("Change activation code")).click();
    driver.findElement(By.name("user[activation_code]")).clear();
    driver.findElement(By.name("user[activation_code]")).sendKeys(AppProperties._ACTION_CODE);
    driver.findElement(By.linkText("Activate")).click();
    
    Thread.sleep(2000);
    driver.findElement(By.name("user[activation_code]")).clear();
    driver.findElement(By.linkText("Activate")).click();
    
    Thread.sleep(4000);
    driver.findElement(By.linkText("Skip activation, go to XIDIO")).click();

    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*XIDIO[\\s\\S]*$"));
    driver.findElement(By.linkText("Sign out")).click();
}
}
