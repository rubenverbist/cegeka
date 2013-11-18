package com.cegeka.continious;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import junit.framework.Assert;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AcceptanceTest {
	@Test
	public void saysHello_saysHello() throws MalformedURLException {
		WebDriver webDriver = new FirefoxDriver();
		webDriver.get("http://localhost:9000/continious");
		Assert.assertEquals("Hello World!",  webDriver.findElement(By.id("greeting")).getText());	
		webDriver.close();	
	}
}
