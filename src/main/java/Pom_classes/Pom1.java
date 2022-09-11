package Pom_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom1 {
//step1 Declaration
	@FindBy(xpath = "//input[@id='userid']")private WebElement UN;
	@FindBy(xpath = "//input[@id='password']")private WebElement pwd;
	@FindBy(xpath = "//button[@class='button-orange wide']")private WebElement loginbtn;
	
	//Initialization
	public Pom1(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	//utilization
	public void enterUN(String username) {
		UN.sendKeys(username);
	}
	public void enterpwd(String password) {
		pwd.sendKeys(password);
	}
	public void enterloginbtn() {
		loginbtn.click();
	}
}
