package com.Actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	// Declaration
	@FindBy(xpath = "//div[.='Tasks']")
	private WebElement tasklink;
	
	@FindBy(xpath = "//div[.='Reports']")
	private WebElement reportlink;
	
	@FindBy(xpath = "//div[.='Users']")
	private WebElement userlink;
	
	@FindBy(id="logoutLink")
	private WebElement logoutlink;
	
	//Initialization 
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	// Utilization
	public WebElement getTasklink() {
		return tasklink;
	}
	
	public WebElement getReportlink() {
		return reportlink;
	}
	
	public WebElement getUserlink() {
		return userlink;
	}
	
	public WebElement getLogoutlink() {
		return logoutlink;
	}
}
