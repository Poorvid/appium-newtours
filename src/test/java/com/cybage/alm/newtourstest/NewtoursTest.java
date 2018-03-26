package com.cybage.alm.newtourstest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewtoursTest {
	
	WebDriver driver;
	@BeforeTest
	public void before() throws MalformedURLException
	{
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("browserName","browser");
		capabilities.setCapability("Version","Android 4.4.2");
		capabilities.setCapability("deviceName","SampleDevice");
		capabilities.setCapability("platformName","Android");
		//capabilities.setCapability("appPackage","com.android.calculator2");
		//capabilities.setCapability("appActivity","com.android.calculator2.Calculator");	
		driver =new RemoteWebDriver(new URL("http://172.27.59.193:4723/wd/hub"),capabilities);
		
	}
	@Test
	public void test()throws Exception
	{
	driver.get("http://newtours.demoaut.com/");
	
	driver.findElement(By.name("userName")).sendKeys("poorvi");
	driver.findElement(By.name("password")).sendKeys("poorvi");
	driver.findElement(By.name("login")).click();
	}
	@AfterTest
	public void after()
	{
		driver.quit();
	}
	
	//}

}
