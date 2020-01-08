package com.ciber.actitime.testbase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Baseclass {
	public WebDriver driver;
   @BeforeClass
  public void open_browser() {
	   driver = new FirefoxDriver();
       driver.manage().window().maximize();
       driver.get("https://demo.actitime.com/");
       driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }
 //  @AfterClass
//  public void close_browser() {
//	  driver.close();
 // }
  @BeforeMethod
  public void login() {
	  driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
	  driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
	  driver.findElement(By.xpath("//div[text()='Login ']")).click();
  }
 //  @AfterMethod
//  public void logout() {
//	     driver.findElement(By.xpath("//a[@href='/logout.do']")).click();
//  }
  
}
