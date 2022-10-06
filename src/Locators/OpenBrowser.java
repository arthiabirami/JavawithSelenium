package Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class OpenBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/usr/local/bin/chromedriver");
		ChromeOptions options = new ChromeOptions();
		options.setHeadless(false);
		
		WebDriver driver  = new ChromeDriver(options);
		driver.get("https://demo.nopcommerce.com/");
		
		System.out.println("Title of the page:"+driver.getTitle());
	}

}
