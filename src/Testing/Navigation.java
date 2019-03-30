package Testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://czimail.logix.in/sensiple.com/?session=f9d8c490c90d969687b99fed91ea214ad41d8cd98f00b204e9800998ecf8427ea92a464da9291c8f78460b1bda52765dd41d8cd98f00b204e9800998ecf8427e&sessurl=aHR0cDovL21haWwuc2Vuc2lwbGUuY29t");
		driver.navigate().to("https://mail.yahoo.com/");
		
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		

	}

}
