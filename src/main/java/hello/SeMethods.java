package hello;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import wdMethods.WdMethods;

public class SeMethods implements WdMethods{
	RemoteWebDriver driver ;
	int i = 1;
	public void startApp(String browser, String url) {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver = new ChromeDriver();			
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./drivers/geckoriver.exe");
			driver = new FirefoxDriver();		
		}
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("The Browser "+browser+" is Launched Successfully");
		takeSnap();

	}

	public WebElement locateElement(String locator, String locValue) {
		switch (locator) {
		case "id": 	  return driver.findElementById(locValue);
		case "class": return driver.findElementByClassName(locValue);
		case "xpath": return driver.findElementByXPath(locValue);	 
		case "LinkText" : return driver.findElementByLinkText(locValue); 
		}
		return null;
	}

	public WebElement locateElement(String locValue) {
		return driver.findElementById(locValue);
	}

	public void type(WebElement ele, String data) {
		ele.sendKeys(data);
		System.out.println("The Data "+data+" is Entered Successfully");
		takeSnap();
	}

	public void click(WebElement ele) {
		ele.click();
		//	System.out.println("The Element "+ele+" is clicked Successfully");
		takeSnap();		
	}

	public String getText(WebElement ele) {
		// returns the text Value as a String
		ele.getText();
		//		System.out.println(ele.getText());
		return ele.getText(); 
	}

	public void selectDropDownUsingText(WebElement ele, String value) {
		// TODO Auto-generated method stub
		Select dd = new Select(ele);
		dd.selectByValue(value); 

	}

	public void selectDropDownUsingIndex(WebElement ele, int index) {
		// TODO Auto-generated method stub

		Select dd = new Select(ele);
		dd.selectByIndex(index);
		System.out.println("The Dropdown"+index+" has been selected");

	}

	public boolean verifyTitle(String expectedTitle) { 

		return false;
	}

	public void verifyExactText(WebElement ele, String expectedText) {
		String text = ele.getText();
		if (expectedText.equals(text)){
			System.out.println(" the text is exacting matching");
		}else {
			System.out.println(" the text is not exacting matching");
		}
	}


	public void verifyPartialText(WebElement ele, String expectedText) {
		// TODO Auto-generated method stub

	}

	public void verifyExactAttribute(WebElement ele, String attribute, String value) {
		// TODO Auto-generated method stub

	}

	public void verifyPartialAttribute(WebElement ele, String attribute, String value) {
		// TODO Auto-generated method stub

	}

	public void verifySelected(WebElement ele) {
		// TODO Auto-generated method stub

	}

	public void verifyDisplayed(WebElement ele) {
		// TODO Auto-generated method stub

	}

	public void switchToWindow(int index) {
		Set<String> allWindowHandle = driver.getWindowHandles();
		List<String> wh = new ArrayList<String>();
		wh.addAll(allWindowHandle);
		driver.switchTo().window(wh.get(index));

	}

	public void switchToFrame(WebElement ele) {
		// TODO Auto-generated method stub

	}

	public void acceptAlert() {
		Alert myAlert = driver.switchTo().alert();
		myAlert.accept(); 

	}

	public void dismissAlert() {
		// TODO Auto-generated method stub
		Alert myAlert = driver.switchTo().alert();
		myAlert.dismiss(); 
	}

	public String getAlertText() {
		// TODO Auto-generated method stub
		return null;
	}

	public void takeSnap() {
		File src = driver.getScreenshotAs(OutputType.FILE);
		File desc = new File("./snaps/img"+i+".png");
		try {
			FileUtils.copyFile(src, desc);
		} catch (IOException e) {
			e.printStackTrace();
		}
		i++;
	}

	public void closeBrowser() {
		driver.close();
	}

	public void closeAllBrowsers() {
		// TODO Auto-generated method stub

	}

	public void nosnap(WebElement ele) {
		ele.click();
		//		System.out.println("The Element "+ele+" is clicked Successfully");
		//takeSnap();	

	}

	public void acceptAlert1() {
		Alert myAlert = driver.switchTo().alert();
		myAlert.accept(); 
	}

}
