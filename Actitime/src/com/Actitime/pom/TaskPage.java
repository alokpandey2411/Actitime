package com.Actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskPage {
	//Declaration
	@FindBy(xpath ="//div[.='Add New']")
	private WebElement addnewbtn;
	
	@FindBy(xpath = "//div[.='+ New Customer']")
	private WebElement newCust;
	
	@FindBy(xpath = "(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement custName;
	
	@FindBy(xpath = "//textarea[@placeholder='Enter Customer Description']")
	private WebElement custDesc;
	
	@FindBy(xpath = "//div[.='Create Customer']")
	private WebElement createCust;
	
	//Initialization
	public TaskPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	//Utilization
	public WebElement getAddnewbtn() {
		return addnewbtn;
	}

	public WebElement getNewCust() {
		return newCust;
	}

	public WebElement getCustName() {
		return custName;
	}

	public WebElement getCustDesc() {
		return custDesc;
	}

	public WebElement getCreateCust() {
		return createCust;
	}
	
	
	
	
}
