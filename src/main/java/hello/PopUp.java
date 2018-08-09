package hello;

import org.openqa.selenium.chrome.ChromeDriver;

public class PopUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","H:\\Selenium\\Softwares\\Softwares\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://popuptest.com/");
		driver.findElementByXPath(" //a[@href='popuptest12.html']").click();
		driver.quit();
		System.out.println("Test completed");
		
		
	}

}
