package test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GridTest {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		// TODO Auto-generated method stub

		WebDriver driver;
		//System.setProperty("webdriver.chrome.driver", "C:\\jars\\chromedriver.exe");
		String URL = "https://www.DemoQA.com";
	
		 String Node = "http://192.168.1.167:4444/wd/hub";
//		 DesiredCapabilities cap = DesiredCapabilities.chrome();
//		 
		 ChromeOptions options = new ChromeOptions();
		 options.addArguments("disable-infobars");
		 driver = new RemoteWebDriver(new URL(Node), options);
		// driver = new RemoteWebDriver(new URL(Node), cap);
		
		 driver.navigate().to(URL);
		 System.out.println(driver.getTitle());
		 Thread.sleep(5000);
		 driver.quit();
		 } 
	}


