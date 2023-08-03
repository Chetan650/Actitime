package com.actitime.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(xpath = "//a[@class='content tasks']")
	private WebElement taskButton;

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getTaskButton() {
		return taskButton;
	}

}
