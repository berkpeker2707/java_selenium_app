package com.test.java_selenium_app.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class N11Page {
	
	WebDriver driver = null;

	By n11_login = By.cssSelector("#header > div > div > div.hMedMenu > div.customMenu > div.myAccountHolder.customMenuItem.withLocalization > div > div > a.btnSignIn");
	By n11_login_textbox = By.cssSelector("#email");
	By n11_login_password = By.cssSelector("#password");
	//By n11_login_button = By.cssSelector("#loginButton");
	
	///***///
	
	By n11_search_textbox = By.cssSelector("//*[@id=\"searchData\"]");
	By n11_search_button = By.cssSelector("//*[@id=\"header\"]/div/div/div[2]/div[1]/a/span");
	By n11_search_nextPage = By.cssSelector("#contentListing > div > div > div.productArea > div.pagination > a.next.navigation");
	By n11_addToCart_button = By.xpath("//*[@id=\"unf-p-id\"]/div/div[3]/div[1]/div[1]/div[2]/div[4]/div[2]/div[2]/a");
	
	//Constructor
	public N11Page(WebDriver driver) {
		this.driver = driver;
	}
	
	///***///
	
	public void clickLogin() {
		driver.findElement(n11_login).sendKeys(Keys.RETURN);
	}
	
	public void setLoginTextbox(String login){
		driver.findElement(n11_login_textbox).sendKeys(login);
	}
	
	public void setLoginPassword(String pass) {
		driver.findElement(n11_login_password).sendKeys(pass);
	}
	
	/*public void clickLoginButton() {
		driver.findElement(n11_login_button).sendKeys(Keys.RETURN);
	}*/
	
	///***///
	
	public void searchTextbox(String text) {
		driver.findElement(n11_search_textbox).sendKeys(text);
	}
	
	public void clickSearchButton() {
		driver.findElement(n11_search_button).sendKeys(Keys.RETURN);
	}
	
	public void clickNextPage() {
		driver.findElement(n11_search_nextPage).sendKeys(Keys.RETURN);
	}
	
	public void clickAddToCartButton() {
		driver.findElement(n11_addToCart_button).sendKeys(Keys.RETURN);
	}
}
