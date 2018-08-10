package testNG;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;


public class WorkWithDataprovider {
 public WebDriver driver;
  @BeforeMethod
  public void launchBrowser() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohammed_huq\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

  }
  
  @DataProvider(name="TestData")
  public Object[][] getData(){
	  Object[][] data=new Object[3][2];
	  data[0][0]= "user1";
	  data[0][1]="password1";
	  
	  data[1][0]= "user2";
	  data[1][1]="pasword2";
	  
	  data[2][0]= "user3";
	  data[2][1]="pasword3";
	  return data;
  }
  
  
  
  
  @Test(dataProvider="TestData")
  public void login(String username,String password) throws InterruptedException {
	  Thread.sleep(5000);
	  driver.findElement(By.id("email")).clear();
	  driver.findElement(By.id("email")).sendKeys(username);
	  driver.findElement(By.id("pass")).clear();
	  driver.findElement(By.id("pass")).sendKeys(password);
	  driver.findElement(By.id("loginbutton")).submit();

  }

  

}
