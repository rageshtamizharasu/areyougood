package hello;

import org.junit.Test;
import org.openqa.selenium.WebElement;

public class SimpleTestCaseWithSeMethods extends SeMethods {
	@Test
	public void loginIntoBroser() throws InterruptedException {
		login();
		WebElement linkCRM = locateElement("link","CRM/SFA");
		click(linkCRM);
		WebElement linkContact = locateElement("link","Create Contact");
		click(linkContact);
		WebElement firstName = locateElement("id","firstNameField");
		type(firstName, "Raji");
		WebElement lastName = locateElement("id","lastNameField");
		type(lastName, "Raghu");
		WebElement firstNameLo = locateElement("id","createContactForm_firstNameLocal");
		type(firstNameLo, "saran");
		WebElement lastNameLo = locateElement("id","createContactForm_lastNameLocal");
		type(lastNameLo, "venkat");
		WebElement title = locateElement("id","createContactForm_personalTitle");
		type(title, "Miss");
		WebElement title1 = locateElement("id","createContactForm_generalProfTitle");
		type(title1, "Ms");
		WebElement depart = locateElement("id","createContactForm_departmentName");
		type(depart, "science");

		//drop down select
		WebElement currency = locateElement("id","createContactForm_preferredCurrencyUomId");
		selectDropDownUsingText(currency, "INR - Indian Rupee");

		//Contact Information
		WebElement des = locateElement("id","createContactForm_description");
		type(des, "Creating contact for Raji");
		WebElement imp = locateElement("id","createContactForm_importantNote");
		type(imp, "Unique contact for Raji");
		WebElement area = locateElement("id","createContactForm_primaryPhoneAreaCode");
		type(area, "000");
		WebElement extn = locateElement("id","createContactForm_primaryPhoneExtension");
		type(extn, "044");
		WebElement email = locateElement("id","createContactForm_primaryEmail");
		type(email, "gavtamsaran@gmail.com");
		WebElement phone = locateElement("id","createContactForm_primaryPhoneNumber");
		type(phone, "33389082");
		WebElement ask = locateElement("id","createContactForm_primaryPhoneAskForName");
		type(ask, "Venkat-Manager");

		//capturing FirstName to Toname
		WebElement toName = locateElement("id","generalToNameField");
		String attribute = null;
		String value = null;
		verifyExactAttribute(toName, attribute, value);

		/*	WebElement toName = driver.findElementById("generalToNameField");
		String valueToNAme = toName.getAttribute("value");
		System.out.println("The captured name is "+valueToNAme);*/

		WebElement adrs1 = locateElement("id","createContactForm_generalAddress1");
		type(adrs1, "No:124,College Road");
		WebElement city = locateElement("id","createContactForm_generalCity");
		type(city, "Chennai");
		WebElement postal = locateElement("id","createContactForm_generalPostalCode");
		type(postal, "600114");
		WebElement postExtn = locateElement("id","createContactForm_generalPostalCodeExt");
		type(postExtn, "600");
		WebElement attName = locateElement("id","createContactForm_generalAttnName");
		type(attName, "Raghav");
		WebElement adrs2 = locateElement("id","createContactForm_generalAddress2");
		type(adrs2, "Palavanthangal");

		//drop down select
		WebElement country = locateElement("id","createContactForm_generalCountryGeoId");
		selectDropDownUsingText(country, "India");

		//To wait for auto-population of state
		Thread.sleep(3000);

		//drop down select
		WebElement state = locateElement("id","createContactForm_generalStateProvinceGeoId");
		selectDropDownUsingText(state, "TAMILNADU");

		//click Create Contact
		WebElement create = locateElement("class","smallSubmit");
		click(create);

		//verify Toname
		WebElement verifyName = locateElement("id","viewContact_fullName_sp");
		String valueToNAme = null;
		verifyPartialText(verifyName, valueToNAme);

		//click Edit
		WebElement edit = locateElement("xpath","//a[text()='Edit']");
		click(edit);

		//drop down select
		WebElement market = locateElement("id","addMarketingCampaignForm_marketingCampaignId");
		selectDropDownUsingText(market, "Car and Driver");

		//click Add
		WebElement add = locateElement("xpath","(//input[@class='smallSubmit'])[2]");
		click(add);

		//click Update
		WebElement update = locateElement("xpath","(//input[@class='smallSubmit'])[1]");
		click(update);
}

	private void login() {
		// TODO Auto-generated method stub
		
	}
}