
package datadriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datadriven {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis= new FileInputStream(System.getProperty("user.dir") + "\\DDT\\property.properties");
		Properties pro=new Properties();
		pro.load(fis);
	//String B =	pro.getProperty("browser");
	String U =pro.getProperty("url");
	String UN=pro.getProperty("username");
	String PW=pro.getProperty("password");
	WebDriver driver=new ChromeDriver();
	driver.get(U);
	driver.findElement(By.cssSelector("input[name='user_name']")).sendKeys(UN);
	
driver.findElement(By.name("user_password")).sendKeys(PW);
driver.findElement(By.id("submitButton")).click();
			
		

	}

}
