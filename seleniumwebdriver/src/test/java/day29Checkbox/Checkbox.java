package day29Checkbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
	driver.get("https://testautomationpractice.blogspot.com/");
	//1) select specific chekbox
	//driver.findElement(By.xpath("//input[@id='sunday']")).click();//if want to click all the checkbox
	//2)select all checkbox
	List<WebElement> checkbox=driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
	/*for(int i=0;i<checkbox.size();i++)
	{
		checkbox.get(i).click();
	}*/
	/*for (WebElement check:checkbox)
	{
		check.click();
	}*/
	/// conditional checkbox -last three checkbox
	
	
	//* click last threre check box
	
	

	}

}
