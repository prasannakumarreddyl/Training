package JavaTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		WebDriver dri=new ChromeDriver();
		dri.get("https://in.yahoo.com/)");
		dri.manage().window().maximize();
	
	try{
		if(dri.findElement(By.linkText("fly")).isDisplayed()){
		System.out.println("News exists - passed");
	}
	}
	catch (NoSuchElementException e){
		System.out.println("Not exits failed");
	}
		
	
	}
}
