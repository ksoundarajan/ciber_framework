package com.ciber.actitime.Tasks;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.ciber.actitime.testbase.Baseclass;

public class Create_Customer extends Baseclass {
  @Test
  public void testCreate_customer() {
	  //test comments for github
	  driver.findElement(By.xpath("//div[@class='title ellipsis']")).click();
	  driver.findElement(By.xpath("div[@class='item createNewCustomer']")).click();
	  driver.findElement(By.xpath("(//input[@placeholder='Enter Customer Name'])[2]")).sendKeys("kalaivani");
	  driver.findElement(By.xpath("//textarea[@placeholder='Enter Customer Description']")).sendKeys("testcustomeradded");
	  driver.findElement(By.xpath("//div[@class='components_button  withPlusIcon']")).click();

  }
}
