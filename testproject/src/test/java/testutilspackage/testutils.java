package testutilspackage;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public  class testutils {
 public static WebDriver driver;
 
 public static void intialisebrowser() {
	 
	 System.setProperty("webdriver.edge.driver",
				System.getProperty("user.dir") +
	            File.separator + "src" +
	            File.separator + "test" +
	            File.separator + "java" +
	            File.separator + "browserdrivers" +
	            File.separator + "msedgedriver.exe");
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		
 }
 
 //******Navigation******///
 public void NavigateTo() {
	 driver.navigate().to("https://demo.iamsath.com/idh/app");
 }
 
//******close Driver and Browser*****// 
public void closebrowser() {

	driver.close();
	driver.quit();	
}
 
 //******Input text*****///
	/*
	 * public static void userinputext(String username,String userinput){
	 * driver.findElement(By.xpath(username)).sendKeys(userinput); }
	 */
	
}
