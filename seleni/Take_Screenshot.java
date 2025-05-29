package seleni;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class Take_Screenshot {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888");
		driver.findElement(By.xpath("//input[@name=\"user_name\"]")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name=\"user_password\"]")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id=\"submitButton\"]")).click();
		TakesScreenshot ts=(TakesScreenshot)driver;
	File sourcefile=	ts.getScreenshotAs(OutputType.FILE);
	sourcefile.
		

		
	}

}
