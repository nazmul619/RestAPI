package wait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginToGmail {
	
	public static WebDriver driver = null;
	public static WebDriverWait wait = null;
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:/seleniumJar/driver1/chromedriver_win32/chromedriver.exe");
		
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver,10);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.bbc.com/");
		
		WebElement signIn = driver.findElement(By.id("idcta-username"));
		signIn.click();
		
		WebElement register = driver.findElement(By.xpath("//span[text()='Register now"));
		register.click();
		
		WebElement click16 = driver.findElement(By.xpath("//span[text()='16 or over']"));
		click16.click();
		
		WebElement day = driver.findElement(By.id("day-input"));
		day.sendKeys("20");
		
		WebElement month = driver.findElement(By.id("dateOfBirthMonth"));
		month.sendKeys("08");
		
		
		WebElement year = driver.findElement(By.id("year-input"));
		year.sendKeys("1978");
		
		WebElement Continue= driver.findElement(By.xpath("//span[text()='Continue']"));
		Continue.click();
	}

}
