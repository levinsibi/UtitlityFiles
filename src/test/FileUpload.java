package test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUpload {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/autoit.html");

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.switchTo().frame("JotFormIFrame-72320244964454");
		driver.findElement(By.id("input_3")).sendKeys("aruu");
		driver.findElement(By.xpath("//input[@name='q4_email']")).sendKeys("a@b.com");

		WebElement e = driver.findElement(By.xpath("(//div[@id='cid_5'])/input[@type='file']"));
		// below line execute the AutoIT script .
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", e);

		String decoded = "D:\\AutoIt\\Upload.exe";
		String sFilePath = "D:\\AutoIt\\T1.txt";
		String sExe = (decoded + " " + sFilePath);
		Thread.sleep(5000);
		try {
			Runtime.getRuntime().exec(sExe);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}
}