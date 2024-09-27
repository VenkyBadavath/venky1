package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("test@123");
		driver.findElement(By.id("pass")).sendKeys("12345678");
		
		System.out.println("**************");
		
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("firstname")).sendKeys("venky");
		driver.findElement(By.name("lastname")).sendKeys("jadav");
		driver.findElement(By.name("reg_email__")).sendKeys("venky123@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Venky@123");
				
			System.out.println("*************");
			
			
			new Select(driver.findElement(By.id("day"))).selectByIndex(16);
			new Select(driver.findElement(By.id("day"))).selectByValue("12");
			new Select(driver.findElement(By.id("day"))).selectByVisibleText("1");
			new Select(driver.findElement(By.id("month"))).selectByIndex(5);
			new Select(driver.findElement(By.id("year"))).selectByValue("1999");
		driver.findElement(By.name("sex")).click();
		driver.findElement(By.name("websubmit")).click();
			
			

		
		
		
		
		

	}

}
