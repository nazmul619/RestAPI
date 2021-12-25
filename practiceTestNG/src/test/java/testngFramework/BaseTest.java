package testngFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	
	public WebDriver driver = null;
	public WebDriverWait wait = null;

	@BeforeMethod
	public void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver","D:/seleniumJar/driver1/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver(); 
		wait = new WebDriverWait(driver,20);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://mail.google.com/mail/u/0/?tab=rm&ogbl#inbox/");
		
	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}

}
