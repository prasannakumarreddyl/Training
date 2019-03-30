package JavaTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		WebDriver dri=new ChromeDriver();
		dri.get("https://en.wikipedia.org/wiki/Selenium_(software)");
		dri.manage().window().maximize();
		dri.findElement(By.partialLinkText("Create")).click();
		System.out.println(dri.getCurrentUrl());
		String firsturl= dri.getCurrentUrl();
		if(firsturl.contains("wikipedia.org")){
			System.out.println("it is internal link -passed");
			
		}else{
			System.out.println("it is not internal -failed");
		}
		dri.navigate().back();
		dri.findElement(By.linkText("www.seleniumhq.org")).click();
		String securl =dri.getCurrentUrl();
		if(! securl.contains("wikipedia.org")){
			System.out.println("it is extrernal link -passed");
		}else{
			System.out.println("it's not external -failed");
		}
		dri.close();
	}
}
