package day28_navigation;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getwindowhands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();


Set<String> windowIds=driver.getWindowHandles();
//System.out.println(windId);
// more than one window list can used
List<String> winlist=new ArrayList(windowIds);
String parent=winlist.get(0);

String child=winlist.get(1);
driver.switchTo().window(child);
System.out.println(driver.getTitle());
driver.switchTo().window(parent);
System.out.println(driver.getTitle());

	}

}
