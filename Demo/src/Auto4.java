import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Auto4 {

	public static void main(String[] args) throws Exception {
		
//		https://www.jotform.com/42382403598964
		
		WebDriver wb = new ChromeDriver();
		
		wb.get("https://www.jotform.com/42382403598964");
		
		wb.findElement(By.id("input_3")).click();
//		Thread.sleep(2000);
		wb.findElement(By.id("input_3")).sendKeys("Pintu");
//		Thread.sleep(2000);
		wb.findElement(By.id("input_4")).click();
//		Thread.sleep(2000);
		wb.findElement(By.id("input_4")).sendKeys("Door@gmail.com");
//		Thread.sleep(2000);
		
 
		
	 
		Select sr = new Select(wb.findElement(By.id("input_7_month")));
		sr.selectByIndex(5);
		
		Select sr1 = new Select(wb.findElement(By.id("input_7_day")));
		sr1.selectByVisibleText("2");
		
		Select sr2 = new Select(wb.findElement(By.id("input_7_year")));
		sr2.selectByValue("2024");
		
		wb.findElement(By.id("input_5_addr_line1")).sendKeys("plot no 78");
		wb.findElement(By.id("input_5_addr_line2")).sendKeys("Pune road");
		wb.findElement(By.id("input_5_city")).sendKeys("Pune");
		wb.findElement(By.id("input_5_state")).sendKeys("MH");
		wb.findElement(By.id("input_5_postal")).sendKeys("411504");
		
		Select sr3 = new Select(wb.findElement(By.id("input_5_country")));
		sr3.selectByValue("India");
		
		wb.findElement(By.id("input_2")).click();
 
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
