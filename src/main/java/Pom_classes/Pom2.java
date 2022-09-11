package Pom_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom2 {
//Declaration
	@FindBy(xpath = "//input[@id='pin']")private WebElement pin;
	@FindBy(xpath = "//button[@class='button-orange wide']")private WebElement ctnbtn;
	
	//Initialization
	public Pom2(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public void enterpin(String pinvalue) {
		pin.sendKeys(pinvalue);
	}
	public void enterctnbtn() {
		ctnbtn.click();
	}
	
	
}
