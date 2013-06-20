package Core.UserRegistrationFunction.Scenario;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import ConfigServices.AppProperties;

public class UserRegistrationValidationFuncitons {

	public void validateFirstName(WebDriver driver)
	{
	    driver.findElement(By.name("user[last_name]")).clear();
	    driver.findElement(By.name("user[last_name]")).sendKeys(AppProperties._LAST_NAME);
	    driver.findElement(By.name("user[address]")).clear();
	    driver.findElement(By.name("user[address]")).sendKeys(AppProperties._ADDRESS);
	    driver.findElement(By.name("user[city]")).clear();
	    driver.findElement(By.name("user[city]")).sendKeys(AppProperties._CITY);
	    new Select(driver.findElement(By.name("user[state]"))).selectByVisibleText("NY - New York");
	    driver.findElement(By.cssSelector("option[value=\"NY\"]")).click();
	    driver.findElement(By.name("user[zip]")).clear();
	    driver.findElement(By.name("user[zip]")).sendKeys(AppProperties._ZIP);
	    driver.findElement(By.name("user[email]")).clear();
	    driver.findElement(By.name("user[email]")).sendKeys(AppProperties._EMAIL);
	    driver.findElement(By.name("user[mobile_number]")).clear();
	    driver.findElement(By.name("user[mobile_number]")).sendKeys(AppProperties._MOBILE_NUMBER);
	    driver.findElement(By.name("user[password]")).clear();
	    driver.findElement(By.name("user[password]")).sendKeys(AppProperties._REG_PASSWORD);
	}
	
	public void validateLastName(WebDriver driver)
	{
		driver.findElement(By.name("user[first_name]")).clear();
	    driver.findElement(By.name("user[first_name]")).sendKeys(AppProperties._FIRST_NAME);
	    driver.findElement(By.name("user[address]")).clear();
	    driver.findElement(By.name("user[address]")).sendKeys(AppProperties._ADDRESS);
	    driver.findElement(By.name("user[city]")).clear();
	    driver.findElement(By.name("user[city]")).sendKeys(AppProperties._CITY);
	    new Select(driver.findElement(By.name("user[state]"))).selectByVisibleText("NY - New York");
	    driver.findElement(By.cssSelector("option[value=\"NY\"]")).click();
	    driver.findElement(By.name("user[zip]")).clear();
	    driver.findElement(By.name("user[zip]")).sendKeys(AppProperties._ZIP);
	    driver.findElement(By.name("user[email]")).clear();
	    driver.findElement(By.name("user[email]")).sendKeys(AppProperties._EMAIL);
	    driver.findElement(By.name("user[mobile_number]")).clear();
	    driver.findElement(By.name("user[mobile_number]")).sendKeys(AppProperties._MOBILE_NUMBER);
	    driver.findElement(By.name("user[password]")).clear();
	    driver.findElement(By.name("user[password]")).sendKeys(AppProperties._REG_PASSWORD);
	}
	
	public void validateAddress(WebDriver driver)
	{
		driver.findElement(By.name("user[first_name]")).clear();
	    driver.findElement(By.name("user[first_name]")).sendKeys(AppProperties._FIRST_NAME);
	    driver.findElement(By.name("user[last_name]")).clear();
	    driver.findElement(By.name("user[last_name]")).sendKeys(AppProperties._LAST_NAME);
	    driver.findElement(By.name("user[city]")).clear();
	    driver.findElement(By.name("user[city]")).sendKeys(AppProperties._CITY);
	    new Select(driver.findElement(By.name("user[state]"))).selectByVisibleText("NY - New York");
	    driver.findElement(By.cssSelector("option[value=\"NY\"]")).click();
	    driver.findElement(By.name("user[zip]")).clear();
	    driver.findElement(By.name("user[zip]")).sendKeys(AppProperties._ZIP);
	    driver.findElement(By.name("user[email]")).clear();
	    driver.findElement(By.name("user[email]")).sendKeys(AppProperties._EMAIL);
	    driver.findElement(By.name("user[mobile_number]")).clear();
	    driver.findElement(By.name("user[mobile_number]")).sendKeys(AppProperties._MOBILE_NUMBER);
	    driver.findElement(By.name("user[password]")).clear();
	    driver.findElement(By.name("user[password]")).sendKeys(AppProperties._REG_PASSWORD);
	}
	
	public void validateCity(WebDriver driver)
	{
		driver.findElement(By.name("user[first_name]")).clear();
	    driver.findElement(By.name("user[first_name]")).sendKeys(AppProperties._FIRST_NAME);
	    driver.findElement(By.name("user[last_name]")).clear();
	    driver.findElement(By.name("user[last_name]")).sendKeys(AppProperties._LAST_NAME);
	    driver.findElement(By.name("user[address]")).clear();
	    driver.findElement(By.name("user[address]")).sendKeys(AppProperties._ADDRESS);
	    new Select(driver.findElement(By.name("user[state]"))).selectByVisibleText("NY - New York");
	    driver.findElement(By.cssSelector("option[value=\"NY\"]")).click();
	    driver.findElement(By.name("user[zip]")).clear();
	    driver.findElement(By.name("user[zip]")).sendKeys(AppProperties._ZIP);
	    driver.findElement(By.name("user[email]")).clear();
	    driver.findElement(By.name("user[email]")).sendKeys(AppProperties._EMAIL);
	    driver.findElement(By.name("user[mobile_number]")).clear();
	    driver.findElement(By.name("user[mobile_number]")).sendKeys(AppProperties._MOBILE_NUMBER);
	    driver.findElement(By.name("user[password]")).clear();
	    driver.findElement(By.name("user[password]")).sendKeys(AppProperties._REG_PASSWORD);
	}
	
	public void validateZip(WebDriver driver)
	{
		driver.findElement(By.name("user[first_name]")).clear();
	    driver.findElement(By.name("user[first_name]")).sendKeys(AppProperties._FIRST_NAME);
	    driver.findElement(By.name("user[last_name]")).clear();
	    driver.findElement(By.name("user[last_name]")).sendKeys(AppProperties._LAST_NAME);
	    driver.findElement(By.name("user[address]")).clear();
	    driver.findElement(By.name("user[address]")).sendKeys(AppProperties._ADDRESS);
	    driver.findElement(By.name("user[city]")).clear();
	    driver.findElement(By.name("user[city]")).sendKeys(AppProperties._CITY);
	    new Select(driver.findElement(By.name("user[state]"))).selectByVisibleText("NY - New York");
	    driver.findElement(By.cssSelector("option[value=\"NY\"]")).click();
	    driver.findElement(By.name("user[email]")).clear();
	    driver.findElement(By.name("user[email]")).sendKeys(AppProperties._EMAIL);
	    driver.findElement(By.name("user[mobile_number]")).clear();
	    driver.findElement(By.name("user[mobile_number]")).sendKeys(AppProperties._MOBILE_NUMBER);
	    driver.findElement(By.name("user[password]")).clear();
	    driver.findElement(By.name("user[password]")).sendKeys(AppProperties._REG_PASSWORD);
	}
	
	public void validateEmail(WebDriver driver)
	{
		driver.findElement(By.name("user[first_name]")).clear();
	    driver.findElement(By.name("user[first_name]")).sendKeys(AppProperties._FIRST_NAME);
	    driver.findElement(By.name("user[last_name]")).clear();
	    driver.findElement(By.name("user[last_name]")).sendKeys(AppProperties._LAST_NAME);
	    driver.findElement(By.name("user[address]")).clear();
	    driver.findElement(By.name("user[address]")).sendKeys(AppProperties._ADDRESS);
	    driver.findElement(By.name("user[city]")).clear();
	    driver.findElement(By.name("user[city]")).sendKeys(AppProperties._CITY);
	    new Select(driver.findElement(By.name("user[state]"))).selectByVisibleText("NY - New York");
	    driver.findElement(By.cssSelector("option[value=\"NY\"]")).click();
	    driver.findElement(By.name("user[zip]")).clear();
	    driver.findElement(By.name("user[zip]")).sendKeys(AppProperties._ZIP);
	    driver.findElement(By.name("user[mobile_number]")).clear();
	    driver.findElement(By.name("user[mobile_number]")).sendKeys(AppProperties._MOBILE_NUMBER);
	    driver.findElement(By.name("user[password]")).clear();
	    driver.findElement(By.name("user[password]")).sendKeys(AppProperties._REG_PASSWORD);
	}
	
	public void validateMobileNumber(WebDriver driver)
	{
		driver.findElement(By.name("user[first_name]")).clear();
	    driver.findElement(By.name("user[first_name]")).sendKeys(AppProperties._FIRST_NAME);
	    driver.findElement(By.name("user[last_name]")).clear();
	    driver.findElement(By.name("user[last_name]")).sendKeys(AppProperties._LAST_NAME);
	    driver.findElement(By.name("user[address]")).clear();
	    driver.findElement(By.name("user[address]")).sendKeys(AppProperties._ADDRESS);
	    driver.findElement(By.name("user[city]")).clear();
	    driver.findElement(By.name("user[city]")).sendKeys(AppProperties._CITY);
	    new Select(driver.findElement(By.name("user[state]"))).selectByVisibleText("NY - New York");
	    driver.findElement(By.cssSelector("option[value=\"NY\"]")).click();
	    driver.findElement(By.name("user[zip]")).clear();
	    driver.findElement(By.name("user[zip]")).sendKeys(AppProperties._ZIP);
	    driver.findElement(By.name("user[email]")).clear();
	    driver.findElement(By.name("user[email]")).sendKeys(AppProperties._EMAIL);
	    driver.findElement(By.name("user[password]")).clear();
	    driver.findElement(By.name("user[password]")).sendKeys(AppProperties._REG_PASSWORD);
	}
	
	public void validatePassword(WebDriver driver)
	{
		driver.findElement(By.name("user[first_name]")).clear();
	    driver.findElement(By.name("user[first_name]")).sendKeys(AppProperties._FIRST_NAME);
	    driver.findElement(By.name("user[last_name]")).clear();
	    driver.findElement(By.name("user[last_name]")).sendKeys(AppProperties._LAST_NAME);
	    driver.findElement(By.name("user[address]")).clear();
	    driver.findElement(By.name("user[address]")).sendKeys(AppProperties._ADDRESS);
	    driver.findElement(By.name("user[city]")).clear();
	    driver.findElement(By.name("user[city]")).sendKeys(AppProperties._CITY);
	    new Select(driver.findElement(By.name("user[state]"))).selectByVisibleText("NY - New York");
	    driver.findElement(By.cssSelector("option[value=\"NY\"]")).click();
	    driver.findElement(By.name("user[zip]")).clear();
	    driver.findElement(By.name("user[zip]")).sendKeys(AppProperties._ZIP);
	    driver.findElement(By.name("user[email]")).clear();
	    driver.findElement(By.name("user[email]")).sendKeys(AppProperties._EMAIL);
	    driver.findElement(By.name("user[mobile_number]")).clear();
	    driver.findElement(By.name("user[mobile_number]")).sendKeys(AppProperties._MOBILE_NUMBER);
	}
	
	public void validateLengthOfPassword(WebDriver driver)
	{
		driver.findElement(By.name("user[first_name]")).clear();
	    driver.findElement(By.name("user[first_name]")).sendKeys(AppProperties._FIRST_NAME);
	    driver.findElement(By.name("user[last_name]")).clear();
	    driver.findElement(By.name("user[last_name]")).sendKeys(AppProperties._LAST_NAME);
	    driver.findElement(By.name("user[address]")).clear();
	    driver.findElement(By.name("user[address]")).sendKeys(AppProperties._ADDRESS);
	    driver.findElement(By.name("user[city]")).clear();
	    driver.findElement(By.name("user[city]")).sendKeys(AppProperties._CITY);
	    new Select(driver.findElement(By.name("user[state]"))).selectByVisibleText("NY - New York");
	    driver.findElement(By.cssSelector("option[value=\"NY\"]")).click();
	    driver.findElement(By.name("user[zip]")).clear();
	    driver.findElement(By.name("user[zip]")).sendKeys(AppProperties._ZIP);
	    driver.findElement(By.name("user[email]")).clear();
	    driver.findElement(By.name("user[email]")).sendKeys(AppProperties._EMAIL);
	    driver.findElement(By.name("user[mobile_number]")).clear();
	    driver.findElement(By.name("user[mobile_number]")).sendKeys(AppProperties._MOBILE_NUMBER);
	    driver.findElement(By.name("user[password]")).clear();
	    driver.findElement(By.name("user[password]")).sendKeys(AppProperties._INVALID_PASSWORD);
	}
	
	public void validateInvalidMobileNumber(WebDriver driver)
	{
		driver.findElement(By.name("user[first_name]")).clear();
	    driver.findElement(By.name("user[first_name]")).sendKeys(AppProperties._FIRST_NAME);
	    driver.findElement(By.name("user[last_name]")).clear();
	    driver.findElement(By.name("user[last_name]")).sendKeys(AppProperties._LAST_NAME);
	    driver.findElement(By.name("user[address]")).clear();
	    driver.findElement(By.name("user[address]")).sendKeys(AppProperties._ADDRESS);
	    driver.findElement(By.name("user[city]")).clear();
	    driver.findElement(By.name("user[city]")).sendKeys(AppProperties._CITY);
	    new Select(driver.findElement(By.name("user[state]"))).selectByVisibleText("NY - New York");
	    driver.findElement(By.cssSelector("option[value=\"NY\"]")).click();
	    driver.findElement(By.name("user[zip]")).clear();
	    driver.findElement(By.name("user[zip]")).sendKeys(AppProperties._ZIP);
	    driver.findElement(By.name("user[email]")).clear();
	    driver.findElement(By.name("user[email]")).sendKeys(AppProperties._EMAIL);
	    driver.findElement(By.name("user[mobile_number]")).clear();
	    driver.findElement(By.name("user[mobile_number]")).sendKeys(AppProperties._INVALID_MOBILE_NUMBER);
	    driver.findElement(By.name("user[password]")).clear();
	    driver.findElement(By.name("user[password]")).sendKeys(AppProperties._REG_PASSWORD);
	}
	
	public void validateNonCapitalLetterPassword(WebDriver driver)
	{
		driver.findElement(By.name("user[first_name]")).clear();
	    driver.findElement(By.name("user[first_name]")).sendKeys(AppProperties._FIRST_NAME);
	    driver.findElement(By.name("user[last_name]")).clear();
	    driver.findElement(By.name("user[last_name]")).sendKeys(AppProperties._LAST_NAME);
	    driver.findElement(By.name("user[address]")).clear();
	    driver.findElement(By.name("user[address]")).sendKeys(AppProperties._ADDRESS);
	    driver.findElement(By.name("user[city]")).clear();
	    driver.findElement(By.name("user[city]")).sendKeys(AppProperties._CITY);
	    new Select(driver.findElement(By.name("user[state]"))).selectByVisibleText("NY - New York");
	    driver.findElement(By.cssSelector("option[value=\"NY\"]")).click();
	    driver.findElement(By.name("user[zip]")).clear();
	    driver.findElement(By.name("user[zip]")).sendKeys(AppProperties._ZIP);
	    driver.findElement(By.name("user[email]")).clear();
	    driver.findElement(By.name("user[email]")).sendKeys(AppProperties._EMAIL);
	    driver.findElement(By.name("user[mobile_number]")).clear();
	    driver.findElement(By.name("user[mobile_number]")).sendKeys(AppProperties._MOBILE_NUMBER);
	    driver.findElement(By.name("user[password]")).clear();
	    driver.findElement(By.name("user[password]")).sendKeys(AppProperties._NONCAPITAL_LETTER_PASSWORD);
	}
	
	public void validateNonDigitPassword(WebDriver driver)
	{
		driver.findElement(By.name("user[first_name]")).clear();
	    driver.findElement(By.name("user[first_name]")).sendKeys(AppProperties._FIRST_NAME);
	    driver.findElement(By.name("user[last_name]")).clear();
	    driver.findElement(By.name("user[last_name]")).sendKeys(AppProperties._LAST_NAME);
	    driver.findElement(By.name("user[address]")).clear();
	    driver.findElement(By.name("user[address]")).sendKeys(AppProperties._ADDRESS);
	    driver.findElement(By.name("user[city]")).clear();
	    driver.findElement(By.name("user[city]")).sendKeys(AppProperties._CITY);
	    new Select(driver.findElement(By.name("user[state]"))).selectByVisibleText("NY - New York");
	    driver.findElement(By.cssSelector("option[value=\"NY\"]")).click();
	    driver.findElement(By.name("user[zip]")).clear();
	    driver.findElement(By.name("user[zip]")).sendKeys(AppProperties._ZIP);
	    driver.findElement(By.name("user[email]")).clear();
	    driver.findElement(By.name("user[email]")).sendKeys(AppProperties._EMAIL);
	    driver.findElement(By.name("user[mobile_number]")).clear();
	    driver.findElement(By.name("user[mobile_number]")).sendKeys(AppProperties._MOBILE_NUMBER);
	    driver.findElement(By.name("user[password]")).clear();
	    driver.findElement(By.name("user[password]")).sendKeys(AppProperties._NONDIGIT_PASSWORD);
	}
	
	public void validateInvalidZipLength(WebDriver driver)
	{
		driver.findElement(By.name("user[first_name]")).clear();
	    driver.findElement(By.name("user[first_name]")).sendKeys(AppProperties._FIRST_NAME);
	    driver.findElement(By.name("user[last_name]")).clear();
	    driver.findElement(By.name("user[last_name]")).sendKeys(AppProperties._LAST_NAME);
	    driver.findElement(By.name("user[address]")).clear();
	    driver.findElement(By.name("user[address]")).sendKeys(AppProperties._ADDRESS);
	    driver.findElement(By.name("user[city]")).clear();
	    driver.findElement(By.name("user[city]")).sendKeys(AppProperties._CITY);
	    new Select(driver.findElement(By.name("user[state]"))).selectByVisibleText("NY - New York");
	    driver.findElement(By.cssSelector("option[value=\"NY\"]")).click();
	    driver.findElement(By.name("user[zip]")).clear();
	    driver.findElement(By.name("user[zip]")).sendKeys(AppProperties._INVALID_ZIP_LENGTH);
	    driver.findElement(By.name("user[email]")).clear();
	    driver.findElement(By.name("user[email]")).sendKeys(AppProperties._EMAIL);
	    driver.findElement(By.name("user[mobile_number]")).clear();
	    driver.findElement(By.name("user[mobile_number]")).sendKeys(AppProperties._MOBILE_NUMBER);
	    driver.findElement(By.name("user[password]")).clear();
	    driver.findElement(By.name("user[password]")).sendKeys(AppProperties._REG_PASSWORD);
	}
	
	public void validateInvalidZip(WebDriver driver)
	{
		driver.findElement(By.name("user[first_name]")).clear();
	    driver.findElement(By.name("user[first_name]")).sendKeys(AppProperties._FIRST_NAME);
	    driver.findElement(By.name("user[last_name]")).clear();
	    driver.findElement(By.name("user[last_name]")).sendKeys(AppProperties._LAST_NAME);
	    driver.findElement(By.name("user[address]")).clear();
	    driver.findElement(By.name("user[address]")).sendKeys(AppProperties._ADDRESS);
	    driver.findElement(By.name("user[city]")).clear();
	    driver.findElement(By.name("user[city]")).sendKeys(AppProperties._CITY);
	    new Select(driver.findElement(By.name("user[state]"))).selectByVisibleText("NY - New York");
	    driver.findElement(By.cssSelector("option[value=\"NY\"]")).click();
	    driver.findElement(By.name("user[zip]")).clear();
	    driver.findElement(By.name("user[zip]")).sendKeys(AppProperties._INVALID_ZIP);
	    driver.findElement(By.name("user[email]")).clear();
	    driver.findElement(By.name("user[email]")).sendKeys(AppProperties._EMAIL);
	    driver.findElement(By.name("user[mobile_number]")).clear();
	    driver.findElement(By.name("user[mobile_number]")).sendKeys(AppProperties._MOBILE_NUMBER);
	    driver.findElement(By.name("user[password]")).clear();
	    driver.findElement(By.name("user[password]")).sendKeys(AppProperties._REG_PASSWORD);
	}
	
	public void validateInvalidEmail(WebDriver driver)
	{
		driver.findElement(By.name("user[first_name]")).clear();
	    driver.findElement(By.name("user[first_name]")).sendKeys(AppProperties._FIRST_NAME);
	    driver.findElement(By.name("user[last_name]")).clear();
	    driver.findElement(By.name("user[last_name]")).sendKeys(AppProperties._LAST_NAME);
	    driver.findElement(By.name("user[address]")).clear();
	    driver.findElement(By.name("user[address]")).sendKeys(AppProperties._ADDRESS);
	    driver.findElement(By.name("user[city]")).clear();
	    driver.findElement(By.name("user[city]")).sendKeys(AppProperties._CITY);
	    new Select(driver.findElement(By.name("user[state]"))).selectByVisibleText("NY - New York");
	    driver.findElement(By.cssSelector("option[value=\"NY\"]")).click();
	    driver.findElement(By.name("user[zip]")).clear();
	    driver.findElement(By.name("user[zip]")).sendKeys(AppProperties._ZIP);
	    driver.findElement(By.name("user[email]")).clear();
	    driver.findElement(By.name("user[email]")).sendKeys(AppProperties._INVALID_EMAIL);
	    driver.findElement(By.name("user[mobile_number]")).clear();
	    driver.findElement(By.name("user[mobile_number]")).sendKeys(AppProperties._MOBILE_NUMBER);
	    driver.findElement(By.name("user[password]")).clear();
	    driver.findElement(By.name("user[password]")).sendKeys(AppProperties._REG_PASSWORD);
	}
	
	public void UpdateCCDetials(WebDriver driver) throws FileNotFoundException, IOException
	{
	    driver.findElement(By.name("user[cc_number]")).clear();
	    driver.findElement(By.name("user[cc_number]")).sendKeys(AppProperties._UPD_CC_NUMBER);
	    driver.findElement(By.name("user[cc_expiration_month]")).clear();
	    driver.findElement(By.name("user[cc_expiration_month]")).sendKeys(AppProperties._UPD_CC_EXPIRY_MONTH);
	    driver.findElement(By.name("user[cc_expiration_year]")).clear();
	    driver.findElement(By.name("user[cc_expiration_year]")).sendKeys(AppProperties._UPD_CC_YEAR);
	    driver.findElement(By.name("user[cc_security_code]")).clear();
	    driver.findElement(By.name("user[cc_security_code]")).sendKeys(AppProperties._UPD_CC_PIN_CODE);

	}
	
	public void UpdateCCExpiryMonth(WebDriver driver) throws FileNotFoundException, IOException
	{
	    driver.findElement(By.name("user[cc_number]")).clear();
	    driver.findElement(By.name("user[cc_number]")).sendKeys(AppProperties._CC_NUMBER);
	    driver.findElement(By.name("user[cc_expiration_month]")).clear();
	    driver.findElement(By.name("user[cc_expiration_month]")).sendKeys(AppProperties._UPD_CC_EXPIRY_MONTH);
	    driver.findElement(By.name("user[cc_expiration_year]")).clear();
	    driver.findElement(By.name("user[cc_expiration_year]")).sendKeys(AppProperties._CC_YEAR);
	    driver.findElement(By.name("user[cc_security_code]")).clear();
	    driver.findElement(By.name("user[cc_security_code]")).sendKeys(AppProperties._CC_PIN_CODE);

	}
}
