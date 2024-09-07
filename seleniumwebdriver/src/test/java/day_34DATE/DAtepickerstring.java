package day_34DATE;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DAtepickerstring {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://jqueryui.com/datepicker/");

		// Methods 1:sendkeys
		driver.switchTo().frame(0);
		
		//driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("5/6/2024");
		// using datepicker
		String y="2024",m="august",d="06";
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		while(true)
		{
			String mon=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String yr=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			System.out.println(mon);
			System.out.println(yr);
			
			/*if(mon.equals(m) && yr.equals(y))
			{
				break;
				
			}*/
			
			//driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		}
	}

}
