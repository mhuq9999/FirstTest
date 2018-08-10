package listenerDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(listenerDemo.TestNGListener.class)
public class MyFirstTestCase {
	WebDriver driver;
	@Test
	public void googleTitleVerify() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohammed_huq\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		driver.quit();
	}
		
		@Test
		public void titleMatch(){
			System.out.println("Test 2 Dummy");
			
					
					
			Assert.assertTrue(false);
			
		}

		
	

}
