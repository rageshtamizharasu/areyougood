package hello;

import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","H:\\Selenium\\Softwares\\Softwares\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElementById("nav-link-yourAccount").click();
		driver.findElementById("ap_email").sendKeys("rageshtamizharasu@gmail.com");
		driver.findElementById("continue").click();
		driver.findElementById("ap_password").sendKeys("Tamizh!23");
		driver.findElementById("signInSubmit").click();
		driver.findElementById("nav-your-amazon").click();
		
		
		
	}
	

}
