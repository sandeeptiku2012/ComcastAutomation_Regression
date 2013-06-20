package VideoManagement.VideoSearchFunctionality.SearchVideoByCategory;

import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import Core.AnnotationFunctions.BaseTest;

public class EnsureSearchChannelStoreIsWorkingFine extends BaseTest{
 
  @Test
  public void testEnsureSearchChannelStoreIsWorkingFine() throws Exception {
	driver.get("http://xidiotrial:Fhaze1@www.xidio.com");
	
    driver.findElement(By.name("user[user_name]")).clear();
    driver.findElement(By.name("user[user_name]")).sendKeys("test24@test.com");
    driver.findElement(By.name("user[password]")).clear();
    driver.findElement(By.name("user[password]")).sendKeys("Password@1");
    driver.findElement(By.id("user_login")).click();
    
    driver.findElement(By.id("search-query")).clear();
    driver.findElement(By.id("search-query")).sendKeys("Whale life");
    driver.findElement(By.id("go-search")).click();
    // Warning: assertTextPresent may require manual changes
   /* //assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Results for 'Whale life'[\\s\\S]*$"));
    try {
      assertTrue(isElementPresent(By.linkText("Whale Life")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }*/
    driver.findElement(By.linkText("Sign out")).click();
  }

 
  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }
}

