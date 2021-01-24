package test;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestGecko {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\jars\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
		String act=driver.getTitle();
		System.out.println(act);
		
		
		

		
	}

}
