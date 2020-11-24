package objectrepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import testutilspackage.testutils;

public  class loginPage extends testutils {
	/*
	 * By username = By.xpath("//input[@name='username']");
	 * 
	 * 
	 * 
	 * public static void usernametext(String s) { // userinputext(username, s);
	 * driver.findElement(By.xpath(username)).sendKeys(s); }
	 */	
	
	
	static By username=By.xpath("//input[@name='username']");
//	By getStarted=By.xpath("//*[@id='signupModalButton']");

	/*
	 * public loginPage(WebDriver driver) { this.driver=driver; }
	 */
	public static void usernametext(String input) {
	driver.findElement(username).sendKeys(input);
	
	}
	
}
