package day28_navigation;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loopforhandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();


Set<String> windowIds=driver.getWindowHandles();
//System.out.println(windId);
// more than one window list can used
//List<String> winlist=new ArrayList(windowIds);
//String parent=winlist.get(0);

for(String winId:windowIds)
{
	
	String present=driver.switchTo().window(winId).getTitle();
	if(present.equals("OrangeHRM"))
			{
		System.out.println("hello");
			}
	
	if(present.equals("Human Resources Management Software | OrangeHRM"))
	{
		System.out.println("hiii");
	}
	
	
}



	}

}
