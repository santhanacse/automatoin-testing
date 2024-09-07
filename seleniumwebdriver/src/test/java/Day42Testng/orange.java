package Day42Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
/*open
 * test logo
 * login
 * close
 */
public class orange {
	WebDriver driver;
  @Test(priority=0)
  public void open() {
	   driver=new ChromeDriver();
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	   
  }
  @Test(priority=1)
  public void test() throws InterruptedException {
	  Thread.sleep(3000);
	  
Boolean s=driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
System.out.println("logo displayed"+s);
	  
  }
  @Test(priority=2)
  public void login() {
	  driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
	  driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
	  
	  
  }
  @Test(priority=3)
  public void close() {
	  
	  driver.quit();
  }
}
