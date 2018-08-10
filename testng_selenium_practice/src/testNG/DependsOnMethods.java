package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DependsOnMethods {
	WebDriver driver;
  @Test
  public void openBrowser() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohammed_huq\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");

	   }
  
  @Test(dependsOnMethods= {"openBrowser"})
  public void loginToFacebook() throws InterruptedException {
	  Thread.sleep(5000);
	  driver.findElement(By.id("email")).sendKeys("itpro1970@gmail.com");
	  driver.findElement(By.id("pass")).sendKeys("Park");
	  driver.findElement(By.id("loginbutton")).submit();
	  
  }
  
}
