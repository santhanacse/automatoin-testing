package day27;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

import java.time.Duration;
import java.util.NoSuchElementException;

public class FLuentwait {

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		Wait<WebDriver> mywait=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(NoSuchElementException.class);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//driver.findElement(By.xpath("//input[@placeholder='Username']"));
		
		WebElement txt = mywait.until(new Function<WebDriver, WebElement>() {
		     public WebElement apply(WebDriver driver) {
		       return driver.findElement(By.xpath("//input[@placeholder='Username']"));
		       
		       
		     }
		   });
		 
		
		txt.sendKeys("santhana");
		

	}

}
