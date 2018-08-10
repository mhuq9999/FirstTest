package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser {
	WebDriver driver;
	@Test
	@Parameters("browser")
	public void verifyPageTitle(String browserName) {
		if(browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:/Users/mohammed_huq/Downloads/geckodriver-v0.20.0-win64/geckodriver.exe");
			 driver = new FirefoxDriver();

		}
		else if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:/Users/mohammed_huq/Downloads/chromedriver_win32/chromedriver.exe");
			 driver=new ChromeDriver();

		}
		
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		

		System.out.println(driver.getTitle());
		driver.quit();
		
	}

}
