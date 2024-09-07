package Day38Screen;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class Incognitemode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--incognito");
		WebDriver driver=new ChromeDriver(opt);
		//chrome is automated is disabled
		driver.get("https://www.orangehrm.com/");

		
		
		
	}

}
