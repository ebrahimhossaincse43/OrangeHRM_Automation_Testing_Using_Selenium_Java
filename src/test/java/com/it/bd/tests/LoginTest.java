package com.it.bd.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.it.bd.basedrivers.BaseDriver;
import com.it.bd.basedrivers.PageDriver;
import com.it.bd.pages.LoginPage;

public class LoginTest extends BaseDriver{
	
	@BeforeClass
	public void start() throws InterruptedException {
		PageDriver.getCurrentDriver().get(url);
		Thread.sleep(5000);
	}

	@Test
	public void loginTest() throws InterruptedException {
		LoginPage loginPage = new LoginPage();
		loginPage.login();
	}
}
