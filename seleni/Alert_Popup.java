package seleni;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Popup {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
        Alert alert1=driver.switchTo().alert();
        String print=alert1.getText();
        System.out.println(print);
        alert1.accept();
     
		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
        Alert alert2=driver.switchTo().alert();
        String print1=alert2.getText();
        System.out.println(print1);
        Thread.sleep(Duration.ofSeconds(50));
        alert2.sendKeys("Sandeep");
        alert2.accept();
	}
	

}
