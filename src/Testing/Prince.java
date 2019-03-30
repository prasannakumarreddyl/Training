package Testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prince {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://prince2.sensiple.com/prince-web/ems/login/view");
		driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("2132");
		driver.findElement(By.xpath("//input[@name='j_password']")).sendKeys("2133");
		driver.findElement(By.xpath("//button[@class='btn btn-lg btn-primary btn-block']")).click();
		driver.findElement(By.xpath("//a[@class='dropdown-toggle']")).click();
		driver.findElement(By.xpath("//a[@class='page-scroll']")).click();
		driver.findElement(By.xpath("//div[@class='htAutocompleteArrow']")).click();
		
		driver.findElement(By.xpath("//button[@class='pika-button pika-day']")).click();
		

	}

}
