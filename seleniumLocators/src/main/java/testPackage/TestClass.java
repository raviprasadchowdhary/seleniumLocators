package testPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) {
		System.out.println("Script started!");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/");
		driver.quit();
		
		System.out.println("Script execution complerted!");
		
	}

}
