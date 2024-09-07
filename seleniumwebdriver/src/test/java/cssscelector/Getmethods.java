package cssscelector;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getmethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		String value=driver.getWindowHandle();//single browser window
		System.out.println(value);
		Thread.sleep(200);
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		Set<String> value1=driver.getWindowHandles();//single browser window
		System.out.println(value1);
	}

}
