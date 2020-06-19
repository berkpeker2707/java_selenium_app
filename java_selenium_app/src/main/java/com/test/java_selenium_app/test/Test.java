package com.test.java_selenium_app.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.test.java_selenium_app.pages.N11Page;

public class Test {

	private static WebDriver driver = null;
	
	public static void main(String[] args) throws InterruptedException {
		n11ProjectTest();
	}
	
	public static void n11ProjectTest() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		N11Page n11page = new N11Page(driver);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		///***///
		driver.get("https://www.n11.com/");
		driver.manage().window().maximize();
		
		String title = driver.getTitle();	
		
		if(title.equalsIgnoreCase("n11.com - Alışverişin Uğurlu Adresi"))
			System.out.println("N11 Anasayfa Yüklendi");
		else
			System.out.println("You are not at n11.com - main page.");
		
		n11page.clickLogin();
		n11page.setLoginTextbox("o10.chel@necsilan.cf");
		n11page.setLoginPassword("q1w2e3r4t5y6");
		Thread.sleep(5000);
		//n11page.clickLoginButton();
		
		/*
		WebElement element = driver.findElement(By.cssSelector("#loginButton"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(500); 
		element.click();
		System.out.println("test giris");*/
		
		
		WebElement element = driver.findElement(By.cssSelector("#loginButton"));
		Actions actions = new Actions(driver);
		actions.moveToElement(element).click().perform();
		System.out.println("test giris");
		
		
	}

}
