package com.practice;



import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ActionClass_B {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@class='_3Njdz7']//button")).click();
		
		for (int i = 0; i < 55; i++) {
			driver.findElement(By.className("_26sdfg")).click();

		}
		
		driver.navigate().to("https://www.amazon.in");
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.id("nav-link-yourAccount"))).build().perform();
		action.moveToElement(driver.findElement(By.xpath("//div[@id='nav-flyout-ya-newCust']//a"))).click().build().perform();

		driver.findElement(By.id("ap_customer_name")).sendKeys("Rohith");
		
		Select country = new Select(driver.findElement(By.name("countryCode")));
		country.selectByVisibleText("GR +30");		
		driver.findElement(By.id("ap_phone_number")).sendKeys("5555555555");
		driver.findElement(By.cssSelector("#ap_email")).sendKeys("test@gmail.com");
		driver.findElement(By.id("ap_password")).sendKeys("te123");
		driver.findElement(By.id("continue")).click();
		
		List<WebElement> all_countries = country.getOptions();
		
		for (int i = 0; i <all_countries.size(); i++) {
			System.out.println(all_countries.get(i).getText());
		}
		
		
	}

}
