package Day38Screen;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class BLockadd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions opt=new ChromeOptions();
		
		WebDriver driver=new ChromeDriver(opt);
		driver.get("https://timesofindia.indiatimes.com/city/kolkata/kolkata-doctor-rape-murder-live-updates-rg-kar-hospital-vandalism-ima-mamata-banerjee-mahua-moitra-sanjoy-roy/liveblog/112555663.cms");
	}

}
