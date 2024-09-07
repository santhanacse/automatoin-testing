package day27;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(2));
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	 WebElement name=   mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
		name.sendKeys("Admin");
		WebElement pass=   mywait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
		pass.sendKeys("admin123");

		WebElement button=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='submit']")));
		button.click();
	}

}
