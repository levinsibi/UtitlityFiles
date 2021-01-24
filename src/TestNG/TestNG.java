package TestNG;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;

@Listeners(ListenersTestNG.class)
public class TestNG {
	WebDriver driver;
	@BeforeTest
	public void BT(){
		System.setProperty("webdriver.chrome.driver", "C:\\jars\\chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.get("https://www.demoqa.com");
	}
	
	
	@Test(enabled = true)  //Success Test(
	public void ZCloseBrowser() {
		driver.close();
		Reporter.log("Driver Closed After Testing");
	}
	
	@Test //Failed Test
	public void OpenBrowser() {
	        
	        driver.get("https://www.demoqa.com");
	        String expectedTitle = "Free QA Automation Tools For Everyone";
	        String originalTitle = driver.getTitle();
	        Assert.assertEquals(originalTitle, expectedTitle, "Titles of the website do not match");
  }
	
	
	@Test (enabled = true) // Skip Test
	public void SkipTest() {
		throw new SkipException("Skipping The Test Method ");
	}
}