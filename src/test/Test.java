package test;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\jars\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		String act=driver.getTitle();
		System.out.println(act);
		
		
		

		
	}

}
