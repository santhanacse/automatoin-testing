package Day38Screen;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import  org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.chrome.ChromeDriver;
public class Specificarea {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.britannica.com/plant/rose-plant");
		WebElement feature= driver.findElement(By.xpath("//section[@id='ref341680']"));
	File sour=	feature.getScreenshotAs(OutputType.FILE);
		File targ=new File(System.getProperty("user.dir")+"\\screenshot\\partpage.png");
		sour.renameTo(targ);
		
		
		
		
		
	}

}
