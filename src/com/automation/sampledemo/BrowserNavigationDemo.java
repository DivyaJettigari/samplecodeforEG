package com.automation.sampledemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class BrowserNavigationDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://google.co.in");
		Sleeper.sleepTightInSeconds(5);
		
		//maximize feature
		driver.manage().window().maximize();
		String str = driver.getTitle();
		System.out.println("Title1:: " +str);
		
		//change the URL to another link
		driver.get("http://facebook.com");
		String str2 = driver.getTitle();
		System.out.println("Title2:: " +str2);
		
		//Page navigation via back option i.e. back arrow
		Sleeper.sleepTightInSeconds(5);
		driver.navigate().back();
		String str3 = driver.getTitle();
		System.out.println("Title after page back:: " +str3);
		
		driver.navigate().forward();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String str4 = driver.getTitle();
		System.out.println("Title after forward navigation::" +str4);
		
		//page navigate to Gmail link and usage of Implicit time wait condition
		Sleeper.sleepTightInSeconds(3);
		driver.navigate().to("http://gmail.com");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String str5 = driver.getTitle();
		System.out.println("Title after gmail URL:: " +str5);
		
		// to retrieve the window ID
		String str6 = driver.getWindowHandle();
		System.out.println("Window ID:: " +str6);
					
	}

}
