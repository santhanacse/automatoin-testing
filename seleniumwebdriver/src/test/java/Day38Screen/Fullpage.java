package Day38Screen;

import java.io.File;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.OutputType;
import  org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.chrome.ChromeDriver;

public class Fullpage {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.orangehrm.com/");
		//1)Full page screenshoty
       TakesScreenshot ts=(TakesScreenshot)driver;
     File sourcefile=  ts.getScreenshotAs(OutputType.FILE);
     File target = new File(System.getProperty("user.dir")+"\\screenshot\\fullpage.png");
     sourcefile.renameTo(target);
     
     
    	
		
	}

}
