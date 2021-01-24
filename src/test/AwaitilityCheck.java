package test;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.awaitility.Awaitility.*;
import static org.awaitility.Duration.*;
import static java.util.concurrent.TimeUnit.*;
import static org.hamcrest.Matchers.*;

import java.util.List;
import java.util.concurrent.TimeUnit;
public class AwaitilityCheck {
	
	
	static WebDriver driver;
	public static boolean ufxIsExists(By objByIdentification,int nTimeOut) throws InterruptedException{
		int count=1;
		int nSynchResponsivenessInMillis=1000;
		try{
			int nAttemptsRemaining = nTimeOut/nSynchResponsivenessInMillis;	  
			while(driver.findElements(objByIdentification).size() == 0 && --nAttemptsRemaining>0){
				Thread.sleep(nSynchResponsivenessInMillis);
			}
			if(driver.findElements(objByIdentification).size()>0) {//TODO: review - new synch logic added to handle azure login synch issue
				Boolean boolReturn = new WebDriverWait(driver, 1) //1 seconds
						.until(ExpectedConditions.stalenessOf(driver.findElement(objByIdentification)));
				while(boolReturn) {
					boolReturn = new WebDriverWait(driver, 1) //1 seconds
							.until(ExpectedConditions.stalenessOf(driver.findElement(objByIdentification)));
					
				}
				//addition
				
				
			}
			return (driver.findElements(objByIdentification).size()>0);
		}
		catch(Exception ex){				
			//Wait for object until DOM is refreshed, added to handle stale element exception triggered while trying to identify element on page refresh due to ajax calls
			try {
				return new WebDriverWait(driver, (nTimeOut/1000)) //TODO: Not so perfect. This method only works fine only under a positive situation. It throws exception instead of returning false when element doesn't exist.
						.ignoring(StaleElementReferenceException.class)
						.until(ExpectedConditions.presenceOfAllElementsLocatedBy(objByIdentification))
						.size()>0;
			}catch(Exception e) {
				return false;
			}		
		}
	}
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\jars\\chromedriver.exe");
		driver=new ChromeDriver();
		
		By ob=By.id("loading");
		
		driver.get("http://www.seleniumeasy.com/test/dynamic-data-loading-demo.html");
		
		
		
		WebDriverWait wait=new WebDriverWait(driver, 10);
		for(int i=0; i<5; i++){
			
			WebElement newUserBtn = driver.findElement(By.id("save"));
			List<WebElement> newUserBtn1 = driver.findElements(By.id("save"));
			WebElement loadingElement = driver.findElement(By.id("loading"));
			
			
			System.out.println("Size is "+AwaitilityCheck.ufxIsExists(ob, 5000));
			System.out.println(i);
			Wait<WebDriver> waits = new FluentWait<WebDriver>(driver)
	                .withTimeout(10, TimeUnit.SECONDS)
	                .pollingEvery(1, TimeUnit.SECONDS)
	                .ignoring(NoSuchElementException.class).ignoring(StaleElementReferenceException.class);

			waits.until(ExpectedConditions.visibilityOfElementLocated(By.id("save")));
			
		    newUserBtn.click();
		    
		    
		    
		    await("Wait for new user to load").atMost(5, SECONDS)
		                                      .until(loadingElement::getText, not("loading..."));
		    System.out.println(driver.findElement(By.id("loading")).getText()+" is the text after");
		    driver.get("http://www.seleniumeasy.com/test/dynamic-data-loading-demo.html");
		   
		}
	driver.quit();
//			newUserBtn.click();
//		System.out.println(driver.findElement(By.id("loading")).getText()+" is the text before");
//		//Wait for the loading to disappear
////		await("Wait for new user to load").atMost(5, SECONDS)
////		                                  .until(loadingElement::getText, not("loading..."));
////		
//		System.out.println(driver.findElement(By.id("loading")).getText()+" is the text after");
//		
		
		
		
	}

}
