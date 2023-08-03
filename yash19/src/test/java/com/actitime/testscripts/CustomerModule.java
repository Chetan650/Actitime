package com.actitime.testscripts;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.genericutility.BaseClass;
import com.actitime.pomrepository.HomePage;
import com.actitime.pomrepository.LoginPage;
import com.actitime.pomrepository.TaskListPage;

@Listeners(com.actitime.genericutility.ListenerImplementation.class)

public class CustomerModule extends BaseClass {

	@Test
	public void CreateCustomer() throws IOException {
		LoginPage lp = new LoginPage(driver);
		lp.setLogin(fileUtil.readDataFromFile("username"), fileUtil.readDataFromFile("password"));

		HomePage hm = new HomePage(driver);
		hm.getTaskButton().click();

		TaskListPage tl = new TaskListPage(driver);
		tl.getAddNewButton().click();
		tl.getNewCustomerButton().click();
		tl.getEnterCustomername().sendKeys(exelUtil.readDataFromExcel("custdetail", 1, 0));
		tl.getEnterCustomerDescription().sendKeys(exelUtil.readDataFromExcel("custdetail", 1, 1));
		tl.getSelectCustomer().click();
		tl.getSelectCustomerFromDD().click();
		tl.getCreateCustomer().click();

	}
}
