package com.mavenproject;

import org.openqa.selenium.WebDriver;

import com.login.Websitetesting;
import com.mproject.ActualCode;

public class RunnerClass extends ActualCode{

	public static WebDriver driver=browser_Launch();// int a=sum()
	
	public static void main(String[] args) {
		
		url("https://magento.softwaretestingboard.com/");
		
	    Websitetesting w=new Websitetesting(driver);
		implicitWait(15);
		click(w.getWhatsnewClick());
		click(w.getPants());
		click(w.getSize());
		click(w.getSizeclick());
		
		click(w.getClickproduct());
		sendKeys(w.getEnterquantity(),"12");
		click(w.getSizeenter());
		click(w.getColourenter());
		click(w.getAddtocart());
		click(w.getClickaddtocart());
		click(w.getClickcheckout());
		
		select(w.getSelectcountry(),"India");
		select(w.getSelectstate(),"Tamil Nadu");
		sendKeys(w.getEnterzipcode(),"606001");
		sendKeys(w.getEnternumber(),"9998887776");
		
		
		sendKeys(w.getEnteremail(),"ragupathi@gmail.com");
		sendKeys(w.getEntername(),"ragupathi");
		sendKeys(w.getEnternamelast(),"s");
		sendKeys(w.getEntercompany(),"ragu info technology");
		sendKeys(w.getEnteraddress(),"sholinganallur,chennai");
		sendKeys(w.getEntercity(),"chennai");
		
		/*select(w.getSelectcountry(),"India");
		select(w.getSelectstate(),"Tamil Nadu");
		sendKeys(w.getEnterzipcode(),"606001");
		sendKeys(w.getEnternumber(),"9998887776");*/
		
		click(w.getClickamount());
		click(w.getClicknext());
		
		
		System.out.println("pants suucessfully");
		
	}

}
