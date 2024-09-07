package day29Checkbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxvariety {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
	List<WebElement> checkbox=	driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		/*for(int i=0;i<check.size();i++)
		{
			check.get(i).click();
		}*/
	
	/*for(WebElement check:checkbox)
	{
		check.click();
	}*//*last three check boxes*/
	
	/*for(int i=0;i<checkbox.size();i++)
	{
		checkbox.get(i).click();
	}*/
	
	/*first three check boxes*/
	
	/*for(int i=0;i<3;i++)
	{
		checkbox.get(i).click();
	}                  *************** unselect the selected box*/
	
	for(int i=0;i<7;i++)
	{
		checkbox.get(i).click();
		
	
	}
	Thread.sleep(2000);
	
	for(int i=0;i<3;i++)
	{
		if(checkbox.get(i).isSelected())
		{
			checkbox.get(i).click();
		
	
	}
	
		
	
	
	
	
	}

}
}
