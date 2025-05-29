package seleni;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practise {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.manageengine.com/browser-security/request-demo.html");

		WebElement n= driver.findElement(By.name("Name"));
		n.sendKeys("Vivek");
		WebElement n2= driver.findElement(By.id("Email"));
		n2.sendKeys("akc123@gmail.com");
		WebElement n3= driver.findElement(By.id("Phone"));
		n3.sendKeys("7896543944");
		WebElement n4= driver.findElement(By.id("Managed_Devices"));
		n4.sendKeys("12");
		WebElement n6= driver.findElement(By.name("Demo_Date"));
		n6.sendKeys("2001-10-12 12:00");
		WebElement n5= driver.findElement(By.id("Submit"));
		n5.click();     
	}

}
