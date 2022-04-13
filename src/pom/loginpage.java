package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {

	@FindBy(id= "txtUsername")
	private WebElement username;
	// github is webservice 
	@FindBy(xpath = "//*[@id='txtPassword']")
	private WebElement password ;
	
	@FindBy(xpath = "//*[@id='btnLogin']")
	private WebElement button;

	public loginpage(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	public WebElement getUsernameTab() {

		return username;
	}

	public WebElement getPasswordTab() {

		return password;
	}

	public WebElement getButton() {

		return button;
	}

	}


