package Day32checkbox;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selectcheckbox {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement dropopt=driver.findElement(By.xpath("//select[@id='country']"));
		Select opt=new Select(dropopt);
		//opt.selectByIndex(9);
		//opt.selectByValue("france");
		//opt.selectByVisibleText("Canada");
	List<WebElement> option=opt.getOptions();
		/*System.out.println(option.size());
		for(int i=0;i<option.size();i++)
		{
			System.out.println(option.get(i).getText());
		}*/
		
		for( WebElement o:option)
		{
			System.out.println(o.getText());
			
		}
		
	}

}
