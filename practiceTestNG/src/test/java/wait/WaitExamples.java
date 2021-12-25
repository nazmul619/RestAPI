package wait;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitExamples extends Base{
	
	
	public void getTitle() {
		System.out.println(driver.getTitle());
	}
	
	public void scriptErrorExample() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeAsyncScript("window.setTimeout(arguments[arguments.length-1],5000);");
	}
	
	public void explicitWaitExample() {
		WebDriverWait wait = new WebDriverWait(driver,10);
		WebElement email = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("email"))));
		email.sendKeys("pxp2007@gmail.com");
	}
/*	
	public void fluentWaitExample() {
	
		// Waiting 10 seconds for an element to be present on the page, checking
		// for its presence once every 5 seconds.
		
		Wait wait = new FluentWait(driver)
		    .withTimeout(10, TimeUnit.SECONDS)
		    .pollingEvery(5, TimeUnit.SECONDS)
		    .ignoring(NoSuchElementException.class);
		
	WebElement email = (WebElement) wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("email"))));
	email.sendKeys("pxp2007@gmail.com");
	
	}  */
	
	public static void main(String[] args) {
		WaitExamples obj = new WaitExamples();
		
		obj.setupBrowser("chrome", "https://www.facebook.com");
		//obj.quitBrowser();
		obj.getTitle();
		//obj.scriptErrorExample();
		//obj.explicitWaitExample();
		//obj.fluentWaitExample();
		
	}

}
