package com.automation.sampledemo;

import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class GmailLoginDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.get("http://google.co.in");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Gmail")).click();
		/*Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.linkText("Gmail"))).click();
		actions.build().perform();*/
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.id("Email")).sendKeys("");
		driver.findElement(By.id("next")).click();
		driver.findElement(By.id("Passwd")).sendKeys("");
		driver.findElement(By.id("signIn")).click();
		System.out.println("Login successful");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@id='gb']/div[1]/div[1]/div[2]/div[4]/div[1]/a/span")).click();
		Sleeper.sleepTightInSeconds(5);
		//driver.findElement(By.id("gb_71")).click();
		driver.findElement(By.linkText("Sign out")).click();
		System.out.println("Log Out successful");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Sign in with a different account")).click();
		
		driver.findElement(By.linkText("Remove")).click();
		driver.findElement(By.id("choose-account-0")).click();
		Sleeper.sleepTightInSeconds(5);
		//driver.findElement(By.className("V2qUud UtHQcd")).click();
		driver.findElement(By.linkText("Done")).click();
		Sleeper.sleepTightInSeconds(5);
		driver.close();
		
		
		
		/*
		java.util.List<WebElement> allLinks;
		allLinks = driver.findElements(By.tagName("a"));
		System.out.println("Number of link in Google home page:: " +allLinks.size());
		
		//Details of links and corresponding URLs
		for(int i = 0; i<allLinks.size(); i++){
						String references = allLinks.get(i).getAttribute("href");
			String title = allLinks.get(i).getAttribute("title");
			System.out.println("Link number:: " +i + " related href:: " +references + " Title:: " +title);
			}
		*/
			
		
	}

}
