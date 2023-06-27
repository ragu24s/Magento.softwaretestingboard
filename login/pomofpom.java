package com.login;

import org.openqa.selenium.WebDriver;

public class pomofpom {

	public WebDriver driver;
	
	private Login l;
	
	private Websitetesting w;


	public pomofpom(WebDriver driver1) {
		this.driver=driver1;
	}
	public Login getL() {
		Login s=new Login(driver);
		return s;
	}

	public Websitetesting getW() {
		Websitetesting w=new Websitetesting(driver);
		return w;
	}
	
	
	
	
}
