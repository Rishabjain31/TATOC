package com.qait.automation.training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Test_NG {
	WebDriver driver;
	
	@BeforeTest
	public void setDiver()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rishabh.jain1\\Documents\\chromedriver.exe");
		 
		driver=new ChromeDriver();
	}
	
	@Test
	public void test() {
		driver.get("http://10.0.1.86/tatoc");
		driver.findElement(By.cssSelector("a[href*='basic']")).click();
		//driver.findElement(By.cssSelector("a")).click();
		//driver.findElement(By.className("greenbox")).click();
		verifyRedBox();
		driver.findElement(By.className("greenbox")).click();
	}
	
	public void verifyRedBox()
	{
		Assert.assertTrue("Green box is not displayed", driver.findElement(By.className("greenbox")).isDisplayed());
		System.out.println("Green box is displayed");
	}

}
