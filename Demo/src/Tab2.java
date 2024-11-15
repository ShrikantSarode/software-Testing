import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tab2 {

	public static void main(String[] args) {

		WebDriver wd = new ChromeDriver();

		String s1 = wd.getWindowHandle();

		wd.get("https://getbootstrap.com");
		wd.switchTo().newWindow(WindowType.TAB);

		String s2 = wd.getWindowHandle();

		wd.get("https://workspace.google.com/intl/en_in/gmail");
		wd.switchTo().newWindow(WindowType.TAB);

		String s3 = wd.getWindowHandle();

		wd.get("https://copilot.microsoft.com/chats/j5NrRupC75EhrSsLTTDaz");
		wd.switchTo().newWindow(WindowType.TAB);

		String s4 = wd.getWindowHandle();

		wd.get("https://shrikantweatherapp.netlify.app/");
		wd.switchTo().newWindow(WindowType.TAB);
		
		wd.switchTo().window(s3);
		wd.switchTo().window(s2);
		wd.switchTo().window(s1);
		wd.switchTo().window(s4);
		
		wd.switchTo().window(s3);
		wd.close();
		wd.switchTo().window(s2);
		wd.close();
		wd.switchTo().window(s1);
		wd.close();
		wd.switchTo().window(s4);
		wd.close();
	

	}

}
