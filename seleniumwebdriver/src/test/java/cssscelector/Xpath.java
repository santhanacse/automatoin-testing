package cssscelector;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) 
	{
		
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
	//boolean is=	driver.findElement(By.xpath("/html[1]/body[1]/div[6]/div[1]/div[2]/div[1]/a[1]/img[1]")).isDisplayed();
		
	//System.out.println(is);
	//String value=is.getTitle();
		
		//*[@id="small-searchterms"]
		//html/body/div[6]/div[1]/div[2]/div[2]/form/input
		
		//maual relative Xpath single attribute
		//driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("t-shirts");
		
		//multiple attribute
		//driver.findElement(By.xpath("//input[@name='q'][@placeholder='Search store']")).sendKeys("t-shirts");
	
	//And Or 
		
	//driver.findElement(By.xpath("//input[@name='q' and @placeholder='search store']")).sendKeys("t-shirts");
	
	//driver.findElement(By.xpath("//input[@name='q' or @placeholder='Search store']")).sendKeys("t-shirts");
	//xpath with text(()
	//driver.findElement(By.xpath("//a[text()='Log in']")).click();
		
		
		
	String value=	driver.findElement(By.xpath("//h2[text()='Welcome to our store']")).getText();
	
	System.out.println(value);
	// xpath with contains
	
	boolean s=driver.findElement(By.xpath("//input[contains(@placeholder,'Searc')]")).isDisplayed();
	System.out.println(s);
	boolean a=driver.findElement(By.xpath("//div[@class='header-logo']/a/img")).isDisplayed();
	System.out.println(a);
	
	}
	
	
	

}
