package com.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Websitetesting {

	public WebDriver driver;
	
	@FindBys({
		@FindBy(xpath="(//a[@role='menuitem']//span)[1]")
	})

	private WebElement whatsnewClick;
	
	
	@FindBys({
		@FindBy(xpath="(//a[text()=\"Pants\"])[2]")
	})
	private WebElement pants;
	
	
	@FindBys({
		@FindBy(xpath="(//div[@class='filter-options-title'])[2]")
	})
	private WebElement size;
	
	@FindBys({
		@FindBy(xpath="//a[@aria-label='36']//div[1]")
	})
	private WebElement sizeclick;
	
	
	@FindBys({
		@FindBy(xpath="//a[contains(text(),'Livingston All-Purpose Tight')]")
	})
	private WebElement clickproduct;
	
	
	@FindBys({
		@FindBy(xpath="(//div[text()='36'])[1]")
	})
	private WebElement sizeenter;
	@FindBys({
		@FindBy(xpath="(//div[@class='swatch-option color'])[1]")
	})
	private WebElement colourenter;
	
	@FindBys({
		@FindBy(xpath="//input[@class='input-text qty']")
	})
	private WebElement enterquantity;
	
	@FindBys({
		@FindBy(xpath="//span[text()='Add to Cart']")
	})
	
	private WebElement addtocart;
	
	@FindBys({
		@FindBy(xpath="//a[contains(text(),'shopping cart')]")
	})
	private WebElement clickaddtocart;
	
	@FindBys({
		@FindBy(xpath="//span[text()='Proceed to Checkout']")
	})
	private WebElement clickcheckout;
	
	@FindBys({
		@FindBy(xpath="(//input[@id='customer-email'])[1]")
	})
	private WebElement enteremail;
	
	@FindBys({
		@FindBy(xpath="(//span[text()='First Name']/following::input)[1]")
	})
	private WebElement entername;
	
	@FindBys({
		@FindBy(xpath="(//span[text()='Last Name']/following::input)[1]")
	})
	private WebElement enternamelast;
	
	@FindBys({
		@FindBy(xpath="((//span[text()='Company']/following::input)[1])")
	})
	private WebElement entercompany;
	@FindBys({
		@FindBy(xpath="((//span[text()='Street Address: Line 1']/following::input)[1])")
	})
	private WebElement enteraddress;
	
	@FindBys({
		@FindBy(xpath="((//select[@class='select'])[2])")
	})
	private WebElement selectcountry;
	
	@FindBys({
		@FindBy(xpath="(//span[text()='City']/following::input)[1]")})
	private WebElement entercity;
	
	@FindBys({
		@FindBy(xpath="((//select[@class='select'])[1])")
	})
	private WebElement selectstate;
	
	@FindBys({
		@FindBy(xpath="((//span[text()='Zip/Postal Code']/following::input)[1])")
	})
	private WebElement enterzipcode;
	
	@FindBys({
		@FindBy(xpath="((//span[text()='Phone Number']/following::input)[1])")
	})
	private WebElement enternumber;
	
	@FindBys({
		@FindBy(xpath="((//input[@class='radio'])[1])")
	})
	private WebElement clickamount;
	
	@FindBys({
		@FindBy(xpath="(//button[@type='submit']//span)[3]")
	})
	private WebElement clicknext;
	
	public Websitetesting(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getWhatsnewClick() {
		return whatsnewClick;
	}

	public WebElement getPants() {
		return pants;
	}

	public WebElement getSize() {
		return size;
	}

	public WebElement getSizeclick() {
		return sizeclick;
	}

	public WebElement getClickproduct() {
		return clickproduct;
	}

	public WebElement getEnterquantity() {
		return enterquantity;
	}

	public WebElement getSizeenter() {
		return sizeenter;
	}

	public WebElement getColourenter() {
		return colourenter;
	}

	public WebElement getAddtocart() {
		return addtocart;
	}

	public WebElement getClickaddtocart() {
		return clickaddtocart;
	}

	public WebElement getClickcheckout() {
		return clickcheckout;
	}

	public WebElement getEnteremail() {
		return enteremail;
	}

	public WebElement getEntername() {
		return entername;
	}

	public WebElement getEnternamelast() {
		return enternamelast;
	}

	public WebElement getEntercompany() {
		return entercompany;
	}

	public WebElement getEnteraddress() {
		return enteraddress;
	}

	public WebElement getSelectcountry() {
		return selectcountry;
	}

	public WebElement getEntercity() {
		return entercity;
	}

	public WebElement getSelectstate() {
		return selectstate;
	}

	public WebElement getEnterzipcode() {
		return enterzipcode;
	}

	public WebElement getEnternumber() {
		return enternumber;
	}

	public WebElement getClickamount() {
		return clickamount;
	}

	public WebElement getClicknext() {
		return clicknext;
	}
	
	
	
}
