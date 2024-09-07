package Day38Screen;
import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Webelement {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.britannica.com/plant/rose-plant");
		driver.manage().window().maximize();
		WebElement rose=driver.findElement(By.xpath("//img[@alt='hybrid tea rose']"));
		
		File sour=rose.getScreenshotAs(OutputType.FILE);
		File tar= new File(System.getProperty("user.dir")+"\\screenshot\\rose.png");
		sour.renameTo(tar);
		
		
		     


		
		
		
		
		
		
		
		
		
	}

}
