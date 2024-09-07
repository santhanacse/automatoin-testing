package day27;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicitwait {

	public static void main(String[] args) throws InterruptedException {
		
	ChromeDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
	
	
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	//Thread.sleep(2000); time wate and each time cant add 
	
	driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();

	}

}
