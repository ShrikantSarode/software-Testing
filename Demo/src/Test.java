import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		WebDriver wd=new ChromeDriver();
		wd.get("https://www.google.com");
//		Thread.sleep(4000);
//		wd.manage().window().maximize();
//		wd1.get("https://www.gmail.com");
		WebDriver wd1 = new ChromeDriver();
		wd1.get("https://www.google.com");
		
		//how to print title of website in any selenium?
//		String s=wd.getTitle();
//		System.out.println(s);
		
		String url1= wd.getCurrentUrl();
		String url2= wd1.getCurrentUrl();
		System.out.println(url1);
		System.out.println(url2);
		
		if(url1.equals(url2))
		{
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		
		//use to make web page change forward and backward and refresh
		wd.navigate().back();
		
		wd.navigate().forward();
		
		wd.navigate().refresh();
		//
		
		
		
		
	}
}