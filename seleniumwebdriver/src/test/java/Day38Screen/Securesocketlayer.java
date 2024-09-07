package Day38Screen;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class Securesocketlayer {

	public static void main(String[] args) {
		
//cretificate to browser a certain page;
		
		ChromeOptions option=new ChromeOptions();
		
	option.setAcceptInsecureCerts(true);//accept the certificate and allow the website
		
		WebDriver driver=new ChromeDriver(option);
		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle());//error privacy error
	}

}
