package testcasespackage;

import org.testng.annotations.Test;

import testutilspackage.testutils;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import objectrepo.loginPage;


public class testcases extends testutils{
  @Test
  public void f() throws InterruptedException {
//	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("a");
	  //  loginPage.usernametext("a");
	  loginPage.usernametext("a");
	  Thread.sleep(5000);
	  loginPage.usernametext("b");
  }
  @BeforeMethod
  public void beforeMethod() {
	  intialisebrowser();
	  NavigateTo();
  }
  
@AfterMethod
  public void afterMethod() {
//	closebrowser();
  }


  
}
