import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioAuto {

	public static void main(String[] args) throws Exception {
//		 https://demo.guru99.com/test/radio.html
		
		WebDriver wd = new ChromeDriver();
		
		wd.get(" https://demo.guru99.com/test/radio.html");
		
		wd.findElement(By.id("vfb-7-1")).click();
		Thread.sleep(2000);
		wd.findElement(By.id("vfb-7-2")).click();
		Thread.sleep(2000);
		wd.findElement(By.id("vfb-7-3")).click();
		Thread.sleep(2000);
		wd.findElement(By.id("vfb-6-0")).click();
		Thread.sleep(2000);
		wd.findElement(By.id("vfb-6-1")).click();
		Thread.sleep(2000);
		wd.findElement(By.id("vfb-6-2")).click();
		 

	}

}
