package day28_navigation;

import java.util.Set;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class To_back_forwar {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
ChromeDriver driver=new ChromeDriver();
//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//driver.get("https://www.orangehrm.com/");
//Set<String> windows=driver.getWindowHandles();
//System.out.println(windows);
		
	driver.navigate().to("https://demo.nopcommerce.com/");
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	Thread.sleep(1000);
	
		driver.navigate().back();
	
	System.out.println(driver.getCurrentUrl());
	Thread.sleep(1000);
	driver.navigate().forward();
	
	
	System.out.println(driver.getCurrentUrl());	
		
		
	}

}
