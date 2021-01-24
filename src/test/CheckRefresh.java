package test;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
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
import java.util.function.Predicate;
public class CheckRefresh {
	
	
	static WebDriver driver;
	private static By ob=By.id("save");
	
	public static boolean retryingFindClick(By by) {
	    boolean result = false;
	    int attempts = 0;
	    while(attempts < 2) {
	        try {
	        	WebDriverWait wait=new WebDriverWait(driver, 10);
	        	wait.until(ExpectedConditions.presenceOfElementLocated(by));
	            driver.findElement(by).click();
	            result = true;
	            break;
	        } catch(Exception e) {
	        	System.out.println(e);
	        }
	        attempts++;
	    }
	    return result;
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\jars\\chromedriver.exe");
		driver=new ChromeDriver();
		
		
		
		driver.get("http://www.seleniumeasy.com/test/dynamic-data-loading-demo.html");
		
		
		
		
		for(int i=0; i<20; i++){
			
			
			
			
			retryingFindClick(ob);
			
		   
		    
		    
		    driver.get("http://www.seleniumeasy.com/test/dynamic-data-loading-demo.html");
		    System.out.println(i);
		   
		    retryingFindClick(ob);
		   
		}
	driver.quit();
	
		
		
		
	}

}
