//*@author divya jettigari**//
package com.automation.sampledemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonShopping {
	
	public static void main(String[] args)
	{
		try {
			String expectedTitle="";
			WebDriver driver = new FirefoxDriver();
			WebDriverWait wait=new WebDriverWait(driver, 20);
			//Navigate to url
			driver.get("https://www.amazon.com/");
			//wait time to load the browser
			WebElement amazonLink;
			amazonLink= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("twotabsearchtextbox")));
			driver.manage().window().maximize();
			String webTitle=driver.getTitle();
			//Verifying webiste has been loaded properly
			if(webTitle.contains(expectedTitle))
			{
				System.out.println("website has been launched successfully");
			}
			else {
				System.out.println("website has not been launched successfully");
				return;
			}
			//search here
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("books best sellers");
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
			
			//Select value from drop down
			Select sortBy=new Select(driver.findElement(By.id("sort")));
			sortBy.selectByVisibleText("Avg. Customer Review");
			
			//Navigate to literature n Fiction Link
			driver.findElement(By.xpath(".//span[text()='Literature & Fiction']")).click();
			
			//Select the book
			
			driver.findElement(
			By.linkText("When God Calls the Heart: Devotions from Hope Valley")).click();
			
			//Add the book to cart
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("add-to-cart-button")));
            driver.findElement(By.id("add-to-cart-button")).click();     
            Thread.sleep(3000);
            driver.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}

}
