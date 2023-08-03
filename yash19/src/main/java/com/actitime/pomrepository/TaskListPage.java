package com.actitime.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {

	@FindBy(xpath = "//div[text()='Add New']")
	private WebElement addNewButton;

	@FindBy(xpath = "//div[.='+ New Customer']")
	private WebElement newCustomerButton;

	@FindBy(xpath = "//div[@class='customerNameDiv']//input")
	private WebElement enterCustomername;

	@FindBy(xpath = "//textarea[@placeholder='Enter Customer Description']")
	private WebElement enterCustomerDescription;

	@FindBy(xpath = "//div[@class='emptySelection' and .='- Select Customer -']")
	private WebElement selectCustomer;

	@FindBy(xpath = "//div[.='- Select Customer -']/following-sibling:: div[.='Big Bang Company']")
	private WebElement selectCustomerFromDD;

	@FindBy(xpath = "//div[.='Create Customer']")
	private WebElement createCustomer;

	public TaskListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getAddNewButton() {
		return addNewButton;
	}

	public WebElement getNewCustomerButton() {
		return newCustomerButton;
	}

	public WebElement getEnterCustomername() {
		return enterCustomername;
	}

	public WebElement getEnterCustomerDescription() {
		return enterCustomerDescription;
	}

	public WebElement getSelectCustomer() {
		return selectCustomer;
	}

	public WebElement getSelectCustomerFromDD() {
		return selectCustomerFromDD;
	}

	public WebElement getCreateCustomer() {
		return createCustomer;
	}

}
