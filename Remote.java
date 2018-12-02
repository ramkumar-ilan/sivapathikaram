package com.example.tests;

import com.thoughtworks.selenium.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.regex.Pattern;;
import java.util.ArrayList;
g
hh
public class remote {
	private Selenium selenium;

	@Before
	public void setUp() throws Exception {
		selenium = new DefaultSelenium("localhost", 4444, "*chrome", "https://www.google.co.in/");
		selenium.start();
		ECHO CLEAN;
	}

	@Test
	public void testRemote() throws Exception {
		selenium.open("/search?q=how+to+record+replay+in+selenium+IDE+firefox&ie=utf-8&oe=utf-8&client=firefox-b-ab&gfe_rd=cr&ei=0AhhV9nCC86L8QfIlbKAAQ");
		selenium.click("link=Selenium IDE Plugins");
		selenium.waitForPageToLoad("30000");
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
