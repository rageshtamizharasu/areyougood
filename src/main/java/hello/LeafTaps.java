package hello;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LeafTaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*ChromeOptions op= new ChromeOptions();
		op.setHeadless(true);*/	
		System.setProperty("webdriver.chrome.driver","H:\\Selenium\\Softwares\\Softwares\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("HDC");
		driver.findElementById("createLeadForm_lastName").sendKeys("Tamizharasu");
		driver.findElementById("createLeadForm_firstName").sendKeys("Ragesh");
		WebElement dropdown = driver.findElementById("createLeadForm_industryEnumId");
		Select ss = new Select(dropdown);
		ss.selectByValue("IND_INSURANCE");
		driver.findElementById("createLeadForm_primaryPhoneCountryCode").sendKeys("+91");
		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("1234567890");
		driver.findElementById("createLeadForm_primaryEmail").sendKeys("ragesh@gmail.com");
		driver.findElementByName("submitButton").click();
		driver.findElementByLinkText("Find Leads").click(); 
		driver.findElementByLinkText("Email").click();
		driver.findElementByName("emailAddress").sendKeys("ragesh@gmail.com");
		driver.findElementByName("emailAddress").sendKeys(Keys.ENTER);
		
		//driver.findElementByLinkText("10142").click();
		
		
		System.out.println("Lead creation completed");
	}

}
