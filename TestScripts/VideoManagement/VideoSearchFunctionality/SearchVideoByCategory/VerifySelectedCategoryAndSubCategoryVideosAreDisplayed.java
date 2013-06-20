package VideoManagement.VideoSearchFunctionality.SearchVideoByCategory;

import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;

import ConfigServices.AppProperties;
import Core.AnnotationFunctions.BaseTest;

public class VerifySelectedCategoryAndSubCategoryVideosAreDisplayed extends BaseTest{
  
  @Test
  public void testVerifySelectedCategoryAndSubCategoryVideosAreDisplayed() throws Exception {
	driver.get("http://xidiotrial:Fhaze1@www.xidio.com");
    
    driver.findElement(By.name("user[user_name]")).clear();
    driver.findElement(By.name("user[user_name]")).sendKeys(AppProperties._USER_NAME);
    driver.findElement(By.name("user[password]")).clear();
    driver.findElement(By.name("user[password]")).sendKeys(AppProperties._PASSWORD);
    driver.findElement(By.id("user_login")).click();
    
    driver.findElement(By.linkText("XIDIO")).click();
    driver.findElement(By.linkText("Film")).click();
    driver.findElement(By.linkText("Indie")).click();

    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Indie[\\s\\S]*$"));
    driver.findElement(By.linkText("Sign out")).click();
  }
}
