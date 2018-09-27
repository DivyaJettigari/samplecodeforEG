package com.automation.sampledemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class FBLoginDemo {

	public static void main(String[] args) {
		ProfilesIni pi = new ProfilesIni();
		FirefoxProfile fp = new FirefoxProfile();
		fp = pi.getProfile("SeleniumProfile");
		WebDriver driver = new FirefoxDriver(fp);
		driver.get("http://facebook.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		System.out.println("Facebook page loaded successfully");
		
		driver.findElement(By.id("email")).sendKeys("");;
		driver.findElement(By.id("pass")).sendKeys("");
		driver.findElement(By.id("u_0_u")).click();
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.partialLinkText("/events/upcoming")).click();
		//driver.findElement(By.xpath(".//*[@id='pagelet_reminders']/div/div[2]/div[2]/a/div/div/span")).click();
			
		
	}

}
