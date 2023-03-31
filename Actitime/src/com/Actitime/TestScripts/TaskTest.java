package com.Actitime.TestScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.Actitime.GenericLibrary.BaseClass;
import com.Actitime.GenericLibrary.FileLibrary;
import com.Actitime.pom.HomePage;
import com.Actitime.pom.TaskPage;

public class TaskTest  extends BaseClass{
	@Test
	public void createCustomer() throws EncryptedDocumentException, IOException {
		HomePage hp = new HomePage(driver);
		hp.getTasklink().click();
		
		
		TaskPage tp = new TaskPage(driver);
		tp.getAddnewbtn().click();
		tp.getNewCust().click();
		FileLibrary f = new FileLibrary();
		String name = f.readDataFromExelSheet("Sheet1", 2, 1);
		tp.getCustName().sendKeys(name);
		String desc = f.readDataFromExelSheet("Sheet1", 4, 2);
		tp.getCustDesc().sendKeys(desc);
		tp.getCreateCust().click();
	}
}
