package com.utility;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {
		public static WebDriver driver;
		
	     @Test
		public void intializeDriver() throws InterruptedException, IOException {
	    	 
	        System.setProperty("webdriver.chrome.driver","C:\\Users\\AKUM1236\\AppData\\Local\\Programs\\Python\\Python38-32\\chromedriver.exe");
	    	driver=new ChromeDriver();
	    	driver.manage().window().maximize();
			driver.get("https://www.saucedemo.com/v1/");
			driver.findElement(By.id("user-name")).sendKeys("standard_user");
			driver.findElement(By.id("password")).sendKeys("secret_sauce");
			driver.findElement(By.id("login-button")).click();
			Thread.sleep(500);
			driver.close();
		}

	}
