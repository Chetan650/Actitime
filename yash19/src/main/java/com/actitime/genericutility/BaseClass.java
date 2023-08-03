package com.actitime.genericutility;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {

	public static WebDriver driver;
	public FileUtility fileUtil = new FileUtility();
	public ExcelUtility exelUtil = new ExcelUtility();
	public WebDriverWait wait;

	@BeforeClass
	public void openBrowser() throws IOException {
		String br = fileUtil.readDataFromFile("browser");
		if (br.equals("chrome")) {
			driver = new ChromeDriver();
		}
		if (br.equals("firefox")) {
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	@AfterClass
	public void closeBrowser() {
		// driver.quit();
	}
}
