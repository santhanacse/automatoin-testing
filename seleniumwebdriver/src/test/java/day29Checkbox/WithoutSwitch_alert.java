package day29Checkbox;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WithoutSwitch_alert {

	public static void main(String[] args) {
		/*use explicit wait*/
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.findElement(By.xpath("//button[@onclick='myFunctionAlert()']")).click();
		 Alert myalert= mywait.until(ExpectedConditions.alertIsPresent());
		System.out.println(myalert.getText());
		 myalert.accept();
	}

}
