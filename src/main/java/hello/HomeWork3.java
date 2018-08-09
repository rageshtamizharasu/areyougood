package hello;

import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","H:\\Selenium\\Softwares\\Softwares\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		System.out.println(driver.getCurrentUrl());
		driver.findElementByLinkText("Contact Us").click();
		System.out.println(driver.getTitle());
		//System.out.println(driver.getCurrentUrl());
		driver.quit();

	}

}