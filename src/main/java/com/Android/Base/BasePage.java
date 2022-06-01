package com.Android.Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import org.openqa.selenium.remote.DesiredCapabilities;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import io.appium.java_client.service.local.AppiumDriverLocalService;

public class BasePage {
	public static AppiumDriver<MobileElement> AppDriver = null;
	protected static AppiumDriverLocalService service;

	public static String ssdir = System.getProperty("user.dir") + "/FailedScreenshots/";
	public static Logger logger;

	public static void setup() throws IOException {
		DesiredCapabilities capabilities = new DesiredCapabilities();

		capabilities.setCapability("platformName", XlsReader.readExcel(1, 1));
		capabilities.setCapability("platformVersion", XlsReader.readExcel(2, 1));
		capabilities.setCapability("deviceName", XlsReader.readExcel(6, 1));
		capabilities.setCapability("app", System.getProperty("user.dir")+XlsReader.readExcel(3, 1));
		capabilities.setCapability("appPackage", XlsReader.readExcel(4, 1));
		capabilities.setCapability("appActivity", XlsReader.readExcel(5, 1));

		AppDriver = new AppiumDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
		AppDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

//		 Set up logger
		logger = Logger.getLogger("Logger_file");
		PropertyConfigurator.configure(System.getProperty("user.dir")+"\\src\\test\\resources\\log4j.properties");
		logger.info("Basic Set-up");

	}

	//Return App Driver
	public static AppiumDriver<MobileElement> getDriver() {
		return AppDriver;
	}
//
}