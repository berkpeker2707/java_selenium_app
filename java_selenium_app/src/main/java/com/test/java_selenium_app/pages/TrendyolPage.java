package com.test.java_selenium_app.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class TrendyolPage {
	
	WebDriver driver = null;

	//By trendyol_login = By.cssSelector("#accountBtn > div.icon-container > i");
	By trendyol_login_textbox = By.cssSelector("#email");
	By trendyol_login_password = By.cssSelector("#password");
	By trendyol_login_button = By.cssSelector("#loginSubmit");
	By trendyol_cart = By.cssSelector("#myBasketListItem");
	
	///***///
	
	By trendyol_search_textbox = By.cssSelector("#auto-complete-app > div > div > input");
	//By trendyol_search_button = By.cssSelector("#auto-complete-app > div > div > i");
	//By trendyol_addToCart_button = By.cssSelector("#product-detail-app > div > div.pr-cn > div.pr-cn-in > div.pr-in-at > div:nth-child(4) > button.pr-in-btn.add-to-bs > div.add-to-bs-tx");
	//By trendyol_trash_button = By.cssSelector("#partial-basket > div > div:nth-child(2) > div.pb-basket-item > div.pb-basket-item-actions > button");
	
	//Constructor
	public TrendyolPage(WebDriver driver) {
		this.driver = driver;
	}
	
	///***///
	
//	public void clickLogin() {
//		driver.findElement(trendyol_login).sendKeys(Keys.RETURN);
//	}
	
	public void setLoginTextbox(String login){
		driver.findElement(trendyol_login_textbox).sendKeys(login);
	}
	
	public void setLoginPassword(String pass) {
		driver.findElement(trendyol_login_password).sendKeys(pass);
	}
	
	public void clickLoginButton() {
		driver.findElement(trendyol_login_button).sendKeys(Keys.RETURN);
	}

	
	public void searchTextbox(String text) {
		driver.findElement(trendyol_search_textbox).sendKeys(text);
	}
	
//	public void clickSearchButton() {
//		driver.findElement(trendyol_search_button).sendKeys(Keys.RETURN);
//	}
	
//	public void clickAddToCartButton() {
//		driver.findElement(trendyol_addToCart_button).sendKeys(Keys.RETURN);
//	}
	
//	public void clickCartTrashButton() {
//	driver.findElement(trendyol_trash_button).sendKeys(Keys.RETURN);
//}
	
	
	
}
