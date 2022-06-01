package com.Android.Base;

import java.time.Duration;

import org.openqa.selenium.Dimension;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class BasicFun extends BasePage {

	// Function for Vertical Swipe
	public static void VerticalSwipe(double startPoint, double EndPoint) {
		Dimension Size = AppDriver.manage().window().getSize();

		int startEdge = (int) (Size.getHeight() * startPoint);
		int endEdge = (int) (Size.getHeight() * EndPoint);
		AndroidTouchAction actions = new AndroidTouchAction(AppDriver).press(PointOption.point(0, startEdge))
				.waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000))).moveTo(PointOption.point(0, endEdge))
				.release().perform();
	}

	//IF Mobile element is visible
	public static boolean isElementDisplayed(MobileElement element) {
		try {
			return element.isDisplayed();

		} catch (Exception e) {
			// System.out.println(e);
			return false;
		}
	}

}
