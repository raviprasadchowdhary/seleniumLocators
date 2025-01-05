package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Script execution started!");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		loginPageSelectors(driver);
		
		driver.quit();
		System.out.println("Script execution completed!");
	}
	
	private static void loginPageSelectors(WebDriver driver) throws InterruptedException {
		driver.get("https://practicetestautomation.com/practice-test-login/");
		
		// ID Locator: WebElement element = driver.findElement(By.id("elementId"));
		WebElement inputUserNameFieldById = driver.findElement(By.id("username"));
		inputUserNameFieldById.sendKeys("student");
		Thread.sleep(500);
		
		// Name Locator: WebElement element = driver.findElement(By.name("elementName"));
		WebElement inputPasswordFieldByName = driver.findElement(By.name("password"));
		inputPasswordFieldByName.sendKeys("Password123");
		Thread.sleep(500);
		
		// Class Name Locator: WebElement element = driver.findElement(By.className("className"));
		WebElement submitButtonByClass = driver.findElement(By.className("btn"));
		submitButtonByClass.click();
		Thread.sleep(500);

		// Link Text Locator: WebElement element = driver.findElement(By.linkText("linkText"));
		WebElement logoutButtonByLinkText = driver.findElement(By.linkText("Log out"));
		logoutButtonByLinkText.click();
		Thread.sleep(500);
		
		// Tag Name Locator: WebElement element = driver.findElement(By.tagName("tagName"));
		WebElement inputUserNameFieldBytagName = driver.findElement(By.tagName("input"));
		inputUserNameFieldBytagName.sendKeys("student");
		Thread.sleep(500);
		inputUserNameFieldBytagName.clear();
		Thread.sleep(500);
		
		// Partial Link Text Locator: WebElement element = driver.findElement(By.partialLinkText("partialLinkText"));
			// Locate element by attribute: WebElement element = driver.findElement(By.xpath("//input[@name='username']"));
			WebElement inputUserNameFieldByXPathAttribute = driver.findElement(By.xpath("//input[@name='username']"));
			inputUserNameFieldByXPathAttribute.sendKeys("student");
			Thread.sleep(500);
			// Locate element by partial attribute value WebElement element = driver.findElement(By.xpath("//input[contains(@name, 'user')]"));
			WebElement inputPasswordFieldByXPathByPartialAttribute = driver.findElement(By.xpath("//input[contains(@name, 'pass')]"));
			inputPasswordFieldByXPathByPartialAttribute.sendKeys("Password123");
			Thread.sleep(500);
			// Locate element by text WebElement element = driver.findElement(By.xpath("//a[text()='Login']"));
			WebElement submitButtonByXPathText = driver.findElement(By.xpath("//button[text()='Submit']"));
			submitButtonByXPathText.click();
			Thread.sleep(500);
			// Locate element by attribute value that starts with a specific string WebElement element = driver.findElement(By.xpath("//input[starts-with(@name, 'user')]"));
			WebElement logoutButtonByXPathStartingWith = driver.findElement(By.xpath("//a[starts-with(text(),'Log')]"));
			logoutButtonByXPathStartingWith.click();
			Thread.sleep(500);
			// Locate element using multiple conditions WebElement element = driver.findElement(By.xpath("//input[@name='username' and @type='text']"));
			WebElement submitButtonByXPathMultipleCondition = driver.findElement(By.xpath("//button[@id='submit' and @class='btn']"));
			System.out.println(submitButtonByXPathMultipleCondition.getText());
			Thread.sleep(500);
		
		// CSS Selector Locator: WebElement element = driver.findElement(By.cssSelector("cssSelector"));
			// Locate the password input field by its name attribute WebElement passwordField = driver.findElement(By.cssSelector("input[name='password']"));
			WebElement submitButtonByCssSelectorAttribute = driver.findElement(By.cssSelector("button[id='submit']"));
			System.out.println(submitButtonByCssSelectorAttribute.getText());
			Thread.sleep(500);

			// Locate the username input field by its ID WebElement usernameField = driver.findElement(By.cssSelector("#username"));
			WebElement submitButtonByCssSelectorId = driver.findElement(By.cssSelector("#submit"));
			System.out.println(submitButtonByCssSelectorId.getText());
			Thread.sleep(500);
			
			// Locate the input field whose placeholder contains 'User' WebElement usernameField = driver.findElement(By.cssSelector("input[placeholder*='User']"));
			WebElement submitButtonByCssSelectorContains = driver.findElement(By.cssSelector("button[id*='ubmi']"));
			System.out.println(submitButtonByCssSelectorContains.getText());
			Thread.sleep(500);
			// Locate the input field whose placeholder starts with 'Pass' WebElement passwordField = driver.findElement(By.cssSelector("input[placeholder^='Pass']"));
			WebElement submitButtonByCssSelectorStarts = driver.findElement(By.cssSelector("button[id^='submi']"));
			System.out.println(submitButtonByCssSelectorStarts.getText());
			Thread.sleep(500);
			// Locate the input field whose placeholder ends with 'name' WebElement usernameField = driver.findElement(By.cssSelector("input[placeholder$='name']"));
			WebElement submitButtonByCssSelectorEnds = driver.findElement(By.cssSelector("button[id$='bmit']"));
			System.out.println(submitButtonByCssSelectorEnds.getText());
			Thread.sleep(500);
			
			// Locate the div with class 'login-form' WebElement loginForm = driver.findElement(By.cssSelector(".login-form"));
			
			// Locate the first input field WebElement firstInputField = driver.findElement(By.cssSelector("input"));
			
			// Locate the input field with class 'login-form' and name 'username' WebElement usernameField = driver.findElement(By.cssSelector("div.login-form input[name='username']"));
						
			

	}

}
