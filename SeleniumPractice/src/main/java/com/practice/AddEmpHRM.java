package com.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddEmpHRM {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rohith-trials641.orangehrmlive.com");

		WebElement uname = driver.findElement(By.id("txtUsername"));
		uname.clear();
		uname.sendKeys("Admin");
		
		WebElement pass = driver.findElement(By.id("txtPassword"));
		pass.clear();
		pass.sendKeys("oI3M@wa4TM");
		
		driver.findElement(By.id("btnLogin")).click();
		
		driver.findElement(By.xpath("//li[@id='menu_pim_viewPimModule']//span[text()='PIM']")).click();
		
		
		driver.findElement(By.xpath("//a[@id='menu_pim_addEmployee']//span[text()='Add Employee']")).click();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.id("firstName")).sendKeys("Navaz");
		driver.findElement(By.id("middleName")).sendKeys("mohz");
		driver.findElement(By.id("lastName")).sendKeys("MD");
		WebElement id = driver.findElement(By.id("employeeId"));
		id.clear();
		id.sendKeys("E004");
		
		//driver.findElement(By.xpath("//div[@class='select-wrapper initialized']//ul")).click();
		//driver.findElement(By.xpath("//div[@class='select-wrapper initialized']//ul//span[contains(text(),'BANGALORE')]")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.id("systemUserSaveBtn")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}

}
