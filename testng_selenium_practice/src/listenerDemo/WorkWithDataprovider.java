package listenerDemo;

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
		driver.get("http://newtours.demoaut.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

  }
  
  @DataProvider(name="TestData")
  public Object[][] getData(){
	  Object[][] data=new Object[3][2];
	  data[0][0]= "mercury";
	  data[0][1]="mercury";
	  
	  data[1][0]= "tutorial";
	  data[1][1]="tutorial";
	  
	  data[2][0]= "user3";
	  data[2][1]="pasword3";
	  return data;
  }
  
  
  
  
  @Test(dataProvider="TestData")
  public void login(String username,String password) throws InterruptedException {
	  Thread.sleep(5000);
	  driver.findElement(By.name("userName")).clear();
	  driver.findElement(By.name("userName")).sendKeys(username);
	  driver.findElement(By.name("password")).clear();
	  driver.findElement(By.name("password")).sendKeys(password);
	  driver.findElement(By.name("login")).submit();

  }

  

}
