package test;

import java.util.ArrayList;
import java.util.Stack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;




public class WindowHandling {
	static WebDriver driver=null;
	public CustomWindow Window=new CustomWindow(); 
	public class CustomWindow{
		private Stack <String>stackWindowHandles=new Stack <String> ();
		//Store the main parent window  handle
		/*public CustomWindow(String sHwnd){
			stackWindowHandles.push(sHwnd);
		}*/
		private void SetParentWindow(String sHwnd){
			stackWindowHandles.push(sHwnd);
		}
		//Switch to immediate child window
		public void SwitchToChild(){
			ArrayList<String> arlistHwnds = new ArrayList<String> (driver.getWindowHandles());
			System.out.println(arlistHwnds);
			for(String shwnd:arlistHwnds){
				if(!stackWindowHandles.contains(shwnd)){
					SwitchWindow(shwnd);
					return;
				}
			}
		}
		//Close Active child window and switch back to its parent
		public void CloseChild(){
			if(stackWindowHandles.size()==1){
				return; // Don't close main window
			}
		
			if(stackWindowHandles.peek().equalsIgnoreCase(driver.getWindowHandle())){
				
				driver.close();
				stackWindowHandles.pop();
				SwitchWindow(stackWindowHandles.peek());
			}
		}
		//Switch to parent window without closing child (Useful for situation where child window closed automatically by application itself)
		public void SwitchToParent(){
			if(stackWindowHandles.size()==1){
				return; // Only one window exists
			}
			
			stackWindowHandles.pop();
			SwitchWindow(stackWindowHandles.peek());
		}
		private boolean SwitchWindow(String sHwnd){
			try{
				driver.switchTo().window(sHwnd);
					
				if (!stackWindowHandles.contains(sHwnd))
					stackWindowHandles.push(sHwnd);
				return true;
			}
			catch(Exception e){
				throw e;
			}
		}
	}
	
	
	


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WindowHandling ob=new WindowHandling();
		
		
		System.setProperty("webdriver.edge.driver", "C:\\jars\\msedgedriver.exe");
		
		 driver=new EdgeDriver();
		driver.get("https://www.google.com/");
		ob.Window.SetParentWindow(driver.getWindowHandle());
		String act=driver.getTitle();
		System.out.println(act);
		System.out.println(driver.getWindowHandles().size());
		driver.manage().window().maximize();
		
		ob.Window.SwitchToChild();
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//img[@alt='HSBC']")).click();
		ob.Window.SwitchToChild();
		ob.Window.CloseChild();
		ob.Window.SwitchToChild();
		ob.Window.CloseChild();
		ob.Window.SwitchToParent();
		driver.findElement(By.name("keyword")).sendKeys("done");
}
}