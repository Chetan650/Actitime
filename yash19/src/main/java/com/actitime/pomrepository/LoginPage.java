package com.actitime.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(xpath = "//input[@id='username']")
	private WebElement usrtbx;

	@FindBy(xpath = "//input[@name='pwd']")
	private WebElement pwdtbx;

	@FindBy(xpath = "//div[text()='Login ']")
	private WebElement loginbtn;

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void setLogin(String un, String pw) {
		usrtbx.sendKeys(un);
		pwdtbx.sendKeys(pw);
		loginbtn.click();
	}
}
