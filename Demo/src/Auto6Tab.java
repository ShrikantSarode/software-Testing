import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto6Tab {
	
	public static void main(String[] args) throws Exception {
		WebDriver wd = new ChromeDriver();
		
		String PW = wd.getWindowHandle();
		
		wd.get("https://www.google.co.in");
		
//		wd.navigate().to("https://getbootstrap.com/");
		
		wd.switchTo().newWindow(WindowType.TAB); // switching to new tab
		
		String cW= wd.getWindowHandle();
		
		wd.get("https://www.gmail.com");
	 
		wd.switchTo().window(PW);// again switching to parent/  previous window
	
		
		 
	}
	
	

}
