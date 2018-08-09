package hello;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Auto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","H:\\Selenium\\Softwares\\Softwares\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		driver.findElementById("userRegistrationForm:userName").sendKeys("rageshtamizharasu");
		driver.findElementById("userRegistrationForm:password").sendKeys("1234");
		driver.findElementById("userRegistrationForm:confpasword").sendKeys("1234");
		WebElement dd1 = driver.findElementById("userRegistrationForm:securityQ");
		Select ss1=new Select(dd1);
		ss1.selectByIndex(3);
		driver.findElementById("userRegistrationForm:securityAnswer").sendKeys("noidea");
		WebElement dd2 = driver.findElementById("userRegistrationForm:prelan");
		Select ss2=new Select(dd2);
		ss2.selectByIndex(1);
		driver.findElementById("userRegistrationForm:firstName").sendKeys("Ragesh");
		driver.findElementById("userRegistrationForm:middleName").sendKeys("");
		driver.findElementById("userRegistrationForm:lastName").sendKeys("Tamizharasu");
		driver.findElementById("userRegistrationForm:gender:1").click();
		driver.findElementById("userRegistrationForm:maritalStatus:1").click();
		driver.findElementById("userRegistrationForm:uidno").sendKeys("808080808080");
		WebElement dd3 = driver.findElementById("userRegistrationForm:dobDay");
		Select ss3=new Select(dd3);
		ss3.selectByIndex(1);
		WebElement dd4 = driver.findElementById("userRegistrationForm:dobMonth");
		Select ss4=new Select(dd4);
		ss4.selectByValue("03");
		WebElement dd5 = driver.findElementById("userRegistrationForm:dateOfBirth");
		Select ss5=new Select(dd5);
		ss5.selectByVisibleText("2000");
		System.out.print("Test is completed successfully" );
			}

		}
	

