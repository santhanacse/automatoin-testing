package day29Checkbox;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
 driver.findElement(By.xpath("//button[@onclick='myFunctionAlert()']")).click();
 Alert myalert= driver.switchTo().alert();
System.out.println(myalert.getText());
 myalert.accept();		
 
 driver.findElement(By.xpath("//button[@onclick='myFunctionPrompt()']")).click();
Alert prompt=driver.switchTo().alert();
prompt.sendKeys("sananana");
prompt.accept();
 
 
	}

	
	
}
