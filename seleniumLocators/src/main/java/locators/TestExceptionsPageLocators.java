package locators;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestExceptionsPageLocators {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Script execution started!");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		testExceptionPageLocators(driver);
		
		driver.quit();
		System.out.println("Script execution completed!");
	}
	
	private static void testExceptionPageLocators(WebDriver driver) throws InterruptedException {
		driver.get("https://practicetestautomation.com/practice-test-exceptions/");
		System.out.println(driver.getTitle());
		Thread.sleep(500);
		
		// Find WebElement for the "Selenium WebDriver with Java for beginners program." link using link text
			// store the current window handle
			String mainWindowhandle = driver.getWindowHandle();
			WebElement SeleniumWebDriverLinkByLinkText = driver.findElement(By.linkText("Selenium WebDriver with Java for beginners program"));
			SeleniumWebDriverLinkByLinkText.click();
			Thread.sleep(3000);
			// get all window handles
			Set<String> allWindoeHandles = driver.getWindowHandles();
			for(String handle: allWindoeHandles) {
				if(!handle.equals(mainWindowhandle)) {
					driver.switchTo().window(handle);
					break;
				}
			}
			System.out.println(driver.getTitle());
			// switch back to main window handle
			driver.switchTo().window(mainWindowhandle);
			Thread.sleep(500);
			
		// Find WebElements for the input field using tag, class name, XPath and CSS
			WebElement inputFieldByTag = driver.findElement(By.tagName("input"));
			WebElement inputFieldByClass = driver.findElement(By.className("input-field"));
			WebElement inputFieldByXPath = driver.findElement(By.xpath("//input[@class='input-field']"));
			WebElement inputFieldByCSS = driver.findElement(By.cssSelector("input[class='input-field']"));
		
		// Create a list of WebElements for all buttons using tag
			
		
		// Identify both buttons, using ID, name, CSS, XPath for each
		
		
	}
	
}
