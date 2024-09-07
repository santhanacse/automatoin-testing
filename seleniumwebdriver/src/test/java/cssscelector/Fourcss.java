package cssscelector;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fourcss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
		//css selector
		//tag # id
		driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T-shirts");
		//tag class == tag.classname
		//driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("T-shiurt");
		//tag attribute   tag{attri="value"]
		//driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("t-pant");
		//driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("t-Shirts");
		
		//tag class attribute= tag.classname[attri='value']
		//driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("pants");
		
		
		
		
		
		

	}

}
