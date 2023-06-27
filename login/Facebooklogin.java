package com.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebooklogin {

	
public WebDriver driver;
    
@FindAll({
	@FindBy(xpath = "(//input[contains(@class,'inputtext _55r1')])[1]")
})
	private WebElement username;
	
    @FindBy(xpath = "//input[@type='password']")
	private WebElement password;
	
		
    @FindBy(xpath="//button[@type='submit']")
	
	private WebElement login;
	
	public Facebooklogin(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public WebElement getUsername() {
		return username;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLogin() {
		return login;
	}
	
	
}
