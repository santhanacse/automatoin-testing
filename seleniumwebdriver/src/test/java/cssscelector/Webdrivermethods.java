 package cssscelector;
 
 import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
 import org.openqa.selenium.chrome.ChromeDriver;

public class Webdrivermethods {

	public static void main(String[] args) {
		// checkbox and 
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/register");
	boolean val=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
	System.out.println("status of the logo : "+val);
	// isEnabled for inputbox,dropdown,checkbox,radio button
	
	boolean text1=driver.findElement(By.xpath("//input[@id='FirstName']")).isEnabled();
	System.out.println("text box is enaabled: "+text1);
	//is selected ==checkbox,radiobutton
boolean gender=	driver.findElement(By.xpath("//label[@for='gender-male']")).isSelected();
System.out.println("gender is selected:"+gender);

	driver.findElement(By.xpath("//label[@for='gender-female']")).click();
	
	boolean female =	driver.findElement(By.xpath("//label[@for='gender-female']")).isSelected();
	System.out.println("gender is selected:"+female);

	
	
	

	}

}
