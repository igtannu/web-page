package com.Android.Utlis;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class AppiumServer {
	
	//To start and stop Appium Server
	public static AppiumDriver<MobileElement> AppDriver=null;
	protected static AppiumDriverLocalService service;
	
//	Start Appium Server
	public static void startservice() {
		service=AppiumDriverLocalService.buildDefaultService();
		service.start();
	}
// Start Appium Server
	public static void stopservice() {
		service.stop();
	}

}
