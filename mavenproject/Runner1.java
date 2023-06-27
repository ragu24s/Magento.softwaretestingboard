package com.mavenproject;

import org.openqa.selenium.WebDriver;

import com.login.Websitetesting;
import com.login.pomofpom;
import com.mproject.ActualCode;

public class Runner1 extends ActualCode{
	
public static WebDriver driver=browser_Launch();// int a=sum()
	
	public static void main(String[] args) {
		
		url("https://magento.softwaretestingboard.com/");
		
	   pomofpom p=new pomofpom(driver);
		implicitWait(15);
		click(p.getW().getWhatsnewClick());
		click(p.getW().getPants());
		click(p.getW().getSize());
		click(p.getW().getSizeclick());
		
		click(p.getW().getClickproduct());
		sendKeys(p.getW().getEnterquantity(),"12");
		click(p.getW().getSizeenter());
		click(p.getW().getColourenter());
		click(p.getW().getAddtocart());
		click(p.getW().getClickaddtocart());
		click(p.getW().getClickcheckout());
		
		select(p.getW().getSelectcountry(),"India");
		select(p.getW().getSelectstate(),"Tamil Nadu");
		sendKeys(p.getW().getEnterzipcode(),"606001");
		sendKeys(p.getW().getEnternumber(),"9998887776");
		
		
		sendKeys(p.getW().getEnteremail(),"ragupathi@gmail.com");
		sendKeys(p.getW().getEntername(),"ragupathi");
		sendKeys(p.getW().getEnternamelast(),"s");
		sendKeys(p.getW().getEntercompany(),"ragu info technology");
		sendKeys(p.getW().getEnteraddress(),"sholinganallur,chennai");
		
		/*select(w.getSelectcountry(),"India");
		select(w.getSelectstate(),"Tamil Nadu");
		sendKeys(w.getEnterzipcode(),"606001");
		sendKeys(w.getEnternumber(),"9998887776");*/
		
		click(p.getW().getClickamount());
		click(p.getW().getClicknext());
		
		sysout("dress Book sucessfully");
		
		
	}
}
