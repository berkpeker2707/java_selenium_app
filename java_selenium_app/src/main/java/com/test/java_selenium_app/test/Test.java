package com.test.java_selenium_app.test;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.test.java_selenium_app.pages.TrendyolPage;

public class Test {

	private static WebDriver driver = null;
	
	public static void main(String[] args) throws InterruptedException {
		trendyolProjectTest();
		driver.quit();
		driver.close();
	}
	
	public static void trendyolProjectTest() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		TrendyolPage trendpage = new TrendyolPage(driver);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		///***///
		driver.get("https://www.trendyol.com/");
		driver.manage().window().maximize();
		
		String title = driver.getTitle();	
		
		if(title.equalsIgnoreCase("En Trend Ürünler Türkiye'nin Online Alışveriş Sitesi Trendyol'da"))
			System.out.println("Trendyol Anasayfa Yüklendi");
		else
			System.out.println("You are not at trendyol.com - main page.");
		
		driver.navigate().refresh();
		
		//trendpage.clickLogin();
		WebElement elementLogin = driver.findElement(By.cssSelector("#accountBtn > div.icon-container > i"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elementLogin);
		elementLogin.click();
		Thread.sleep(5000); 
		
		trendpage.setLoginTextbox("nonclergyable@marfito.gq");
		trendpage.setLoginPassword("q1w2e3r4t5y6");
		trendpage.clickLoginButton();
		System.out.println("Logged In");
		Thread.sleep(5000); 
				
		trendpage.searchTextbox("kedi maması");
		Thread.sleep(3000);
		//trendpage.clickSearchButton();
		WebElement elementSearch = driver.findElement(By.cssSelector("#auto-complete-app > div > div > i"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elementSearch);
		elementSearch.click();
		
		selectRandomProduct();
	    Thread.sleep(3000);
	    
	    //trendpage.clickAddToCartButton();
	    WebElement AddToCart = driver.findElement(By.cssSelector("#product-detail-app > div > div.pr-cn > div.pr-cn-in > div.pr-in-at > div:nth-child(1) > button.pr-in-btn.add-to-bs > div.add-to-bs-tx"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", AddToCart);
		AddToCart.click();
		Thread.sleep(3000);
		
		WebElement myCart = driver.findElement(By.cssSelector("#myBasketListItem"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", myCart);
		myCart.click();
		Thread.sleep(3000);
		
		
		WebElement addOneMoreProduct = driver.findElement(By.cssSelector("#partial-basket > div > div.pb-merchant-group > div.pb-basket-item > div.pb-basket-item-actions > div.pb-counter-container > div > button:nth-child(3)"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", addOneMoreProduct);
		addOneMoreProduct.click();
		Thread.sleep(3000);
		
		
		WebElement removeFromCart = driver.findElement(By.cssSelector("#partial-basket > div > div.pb-merchant-group > div.pb-basket-item > div.pb-basket-item-actions > button"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", removeFromCart);
		removeFromCart.click();
		Thread.sleep(3000);
		
		
		WebElement yesDelete = driver.findElement(By.cssSelector("#ngdialog1 > div.ngdialog-content > form > div > div.footer > div > div.left > button.btn-item.btn-remove"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", yesDelete);
		yesDelete.click();
		Thread.sleep(3000);
		
		System.out.println("Test Completed");

	}
	
	private static void selectRandomProduct(){

		List<WebElement> productElems = driver.findElements(By.xpath("//*[@id=\"search-app\"]/div/div/div[2]/div[2]/div//img"));
	    // get the len of productElems
	    int maxProducts = productElems.size();
	    // get random number
	    Random random = new Random();
	    int randomProduct = random.nextInt(maxProducts);
	    // Select the list item
	    productElems.get(randomProduct).click();
	    
	    
	} 	

}
