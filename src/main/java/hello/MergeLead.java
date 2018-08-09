package hello;

import org.junit.Test;
import org.openqa.selenium.WebElement;

public class MergeLead extends SeMethods {
	@Test
	public void MergeLead() {
	{
	startApp("chrome","http://leaftaps.com/opentaps/control/main");	
	WebElement username = locateElement("username");
	type(username,"DemoSalesManager");
	WebElement password = locateElement("password");
	type(password,"crmsfa"); 
	WebElement login = locateElement("class","decorativeSubmit"); 
	click(login); 
	WebElement crmsfa = locateElement("LinkText","CRM/SFA");
	//driver.findElementByLinkText("CRM/SFA"); 
	click(crmsfa); 
	WebElement Leads = locateElement("LinkText","Leads");
	click(Leads); 
	WebElement MergeLeads = locateElement("LinkText","Merge Leads");
	click(MergeLeads); 
	WebElement fromLeadIcon = locateElement("xpath","//img[@alt='Lookup']"); 
	click(fromLeadIcon);  
	switchToWindow(1); 
	WebElement enterLeadId = locateElement("xpath","//div[@class='x-form-element']/input");
	type(enterLeadId,"10210"); 
	WebElement findLeadsButton = locateElement("xpath","//button[@class='x-btn-text']");
	click(findLeadsButton); 
	WebElement resultingLead = locateElement("xpath","//a[@class='linktext']");
	nosnap(resultingLead);
	switchToWindow(0);
	WebElement toLeadIcon = locateElement("xpath","//input[@name='partyIdTo']/following::a[1]");
	click(toLeadIcon);
	switchToWindow(1); 
	WebElement enterLeadIdTo = locateElement("xpath","//div[@class='x-form-element']/input");
	type(enterLeadIdTo,"10217");
	WebElement findLeadsButtonTo = locateElement("xpath","//button[@class='x-btn-text']");
	click(findLeadsButtonTo);
	WebElement resultingLeadTo = locateElement("xpath","//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
	nosnap(resultingLeadTo);
	switchToWindow(0); 
	WebElement mergeButton = locateElement("LinkText","Merge"); 
	nosnap(mergeButton); 
	acceptAlert(); 
	WebElement findLeadsLink = locateElement("LinkText","Find Leads");
	click(findLeadsLink); 
	WebElement enterLeadIdto = locateElement("xpath","//div[@class='x-form-element' and @style='padding-left:155px']/input");
	type(enterLeadIdto,"100000"); 
	WebElement findLeadsButtonF = locateElement("xpath","//button[text()='Find Leads']");
	click(findLeadsButtonF);  
	verifyExactText(locateElement("xpath", "//div[contains(text(),'No records to display')]"),"No records to display");
	closeBrowser();
}
}



}
