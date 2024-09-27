package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		
		/* Locating Web / HTML elements
 		One of the most important fundamental techniques to learn when using WebDriver is how
 		to find elements on a page.
 		An important task in Automation functional testing is locating elements or object identification
 
 Element Locators / Selectors in Selenium
 What is Element Locators?
 		It is an address that identifies a web element uniquely within a web page
 	Selenium supports 8 types of locators
id, name, classname, linkText, partiallinkText, Tagname, css & xpath.


Why do we need to use different locators for locating elements?
> All locators may not be visible for every element.
> Some locators are not applicable for every element like EX: linkText & partialLinkText
> Some locators are duplicated
> Tagname locator is not recommended since it is duplicated for most of the elements.

NOTE --> Any tool is not posssible to identify the object directly, for that purpose 
		developers designed a unique properties such as locators which are found in HTML source of every page.
		
EX:- HTML source
 	<html>
 	<body>
 		<input id = "u_0_H", type = "textbox">
 	</body>
 	</html>
 	
 input / a / span / div ... = tagnames
 id = is property name / locator type
 u_0_H = property value 	
 		
 */
		//launching browser
		WebDriver driver = new ChromeDriver();
		
		//Navigate to Web Page
		driver.get("http://www.facebook.com");
		
		//ID locator for Text box
		driver.findElement(By.id("email")).sendKeys("test@123");
		
		//Id locator for Text box 
		driver.findElement(By.id("pass")).sendKeys("123456");
		
		System.out.println("********");
		
		//ID locator for Drop Downs
	/* HTML source
	 
	 	<html>
	 	<body>
	 		<select id = "day", type = "Dropdown">
	 	</html>
	 	</body>
	 	
	 	select --> tagname
	 	id --> propertyname
	 	day --> propertyvalue
	 	
	 	In order to select a dropdown we have 3 options
	 	SelectByIndex -- starts from 0
	 	SelectByValue
	 	SelectByVisibleText
	 	
	 Syntax
	 new Select(driver.findElement(By.id("day")).selectByIndex(12);
	 new Select(driver.findElement(By.id("day")).selectByValue("12");	
	 new Select(driver.findElement(By.id("day")).selectByVisibletext("12");	
	 */
		
		
	//Link text
		driver.findElement(By.linkText("Create new account")).click();
		
		//wait command
		Thread.sleep(2000); //this line will make the script pause for 2 sec 
		
	//First name text box
		//name locator
		driver.findElement(By.name("firstname")).sendKeys("Manual");
		
	//Surname
		
	//Mobile number
		
	//New Password
		
		
	//By using ID locator for Day Drop down
		//new Select(driver.findElement(By.id("day"))).selectByIndex(16);
		//new Select(driver.findElement(By.id("day"))).selectByValue("12");
		new Select(driver.findElement(By.id("day"))).selectByVisibleText("1");
		
	//Month drop down
		
	
	//Year drop down
		
		
		
		
	}

}

		
		
		
		
		
	}

}
