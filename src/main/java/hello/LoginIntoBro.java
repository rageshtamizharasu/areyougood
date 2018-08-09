package hello;

import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginIntoBro extends SeMethods{
	@Test
	public void loginIntoBroser() throws InterruptedException {
		//login();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");	
		driver.findElementById("username").sendKeys("DemosalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		Thread.sleep(5000);
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Contact").click();

		//
		driver.findElementById("firstNameField").sendKeys("Raji");
		driver.findElementById("lastNameField").sendKeys("Raghu");
		driver.findElementById("createContactForm_firstNameLocal").sendKeys("saran");
		driver.findElementById("createContactForm_lastNameLocal").sendKeys("venkat");
		driver.findElementById("createContactForm_personalTitle").sendKeys("Miss");
		driver.findElementById("createContactForm_generalProfTitle").sendKeys("Ms");
		driver.findElementById("createContactForm_departmentName").sendKeys("science");
		//drop down select
		WebElement currency=driver.findElementById("createContactForm_preferredCurrencyUomId");
		Select dd = new Select(currency);
		dd.selectByVisibleText("INR - Indian Rupee");

		//Contact Information
		driver.findElementById("createContactForm_description").sendKeys("Creating contact for Raji");
		driver.findElementById("createContactForm_importantNote").sendKeys("Unique contact for Raji");
		driver.findElementById("createContactForm_primaryPhoneAreaCode").sendKeys("000");
		driver.findElementById("createContactForm_primaryPhoneExtension").sendKeys("044");
		driver.findElementById("createContactForm_primaryEmail").sendKeys("gavtamsaran@gmail.com");
		driver.findElementById("createContactForm_primaryPhoneNumber").sendKeys("33389082");
		driver.findElementById("createContactForm_primaryPhoneAskForName").sendKeys("Venkat-Manager");

		//capturing FirstName to Toname
		WebElement toName = driver.findElementById("generalToNameField");
		String valueToNAme = toName.getAttribute("value");
		System.out.println("The captured name is "+valueToNAme);

		driver.findElementById("createContactForm_generalAddress1").sendKeys("No:124,College Road");
		driver.findElementById("createContactForm_generalCity").sendKeys("Chennai");
		driver.findElementById("createContactForm_generalPostalCode").sendKeys("600114");
		driver.findElementById("createContactForm_generalPostalCodeExt").sendKeys("600");
		driver.findElementById("createContactForm_generalAttnName").sendKeys("Raghav");
		driver.findElementById("createContactForm_generalAddress2").sendKeys("Palavanthangal");

		//drop down select
		WebElement country=driver.findElementById("createContactForm_generalCountryGeoId");
		Select dd1 = new Select(country);
		dd1.selectByVisibleText("India");
		//To wait for auto-population of state
		Thread.sleep(3000);

		//drop down select
		WebElement state=driver.findElementById("createContactForm_generalStateProvinceGeoId");
		Select dd2 = new Select(state);
		dd2.selectByVisibleText("TAMILNADU");

		driver.findElementByClassName("smallSubmit").click();

		//verify Toname
		String verifyName = driver.findElementById("viewContact_fullName_sp").getText();
		if(verifyName.contains(valueToNAme)) {
			System.out.println("First NAme is verified with To field");
		}
		else
			System.out.println("Not Verified");
		driver.findElementByXPath("//a[text()='Edit']").click();

		//drop down select
		WebElement market=driver.findElementById("addMarketingCampaignForm_marketingCampaignId");
		Select dd3 = new Select(market);
		dd3.selectByVisibleText("Car and Driver");

		driver.findElementByXPath("(//input[@class='smallSubmit'])[2]").click();
		driver.findElementByXPath("(//input[@class='smallSubmit'])[1]").click();
		
		
		
	}
}



