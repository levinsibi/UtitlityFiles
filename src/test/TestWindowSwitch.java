package test;

import java.io.File;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestWindowSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.edge.driver", "C:\\jars\\msedgedriver.exe");
		
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.google.com/");
		String act=driver.getTitle();
		System.out.println(act);
		System.out.println(driver.getWindowHandles().size());
		driver.manage().window().maximize();
		// To open Naukri website with multiple windows
		driver.get("http://www.naukri.com/");
		String childWindow = null;
		// It will return the parent window name as a String
		String mainWindow=driver.getWindowHandle();
		// It returns no. of windows opened by WebDriver and will return Set of Strings
		Set<String> set =driver.getWindowHandles();
		// Using Iterator to iterate with in windows
		System.out.println(set.size());
		Iterator<String> itr= set.iterator();
		while(itr.hasNext()){
			childWindow=itr.next();
			System.out.println(childWindow);
		   	// Compare whether the main windows is not equal to child window. If not equal, we will close.
			if(!mainWindow.equals(childWindow)){
			driver.switchTo().window(childWindow);
			System.out.println(driver.switchTo().window(childWindow).getTitle());
			
			}
		}
		driver.findElement(By.xpath("//img[@alt='HSBC']")).click();
		for(String win:driver.getWindowHandles())
		{
			driver.switchTo().window(win);
		}
		System.out.println(driver.findElement(By.xpath("//div[@class='job_tupple']")).getText());
		driver.close();
		driver.switchTo().window(childWindow);
		driver.findElement(By.xpath("//img[@alt='HSBC']")).click();
		for(String win:driver.getWindowHandles())
		{
			driver.switchTo().window(win);
		}
		System.out.println(driver.findElement(By.xpath("//div[@class='job_tupple']")).getText());
		driver.close();
		driver.switchTo().window(childWindow);
		driver.close();
		//This is to switch to the main window
		driver.switchTo().window(mainWindow);
		driver.findElement(By.name("keyword")).sendKeys("done");
		}
		

		
	

}
