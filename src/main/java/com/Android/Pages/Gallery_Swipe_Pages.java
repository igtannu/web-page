package com.Android.Pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.Android.Base.BasePage;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import junit.framework.Assert;

public class Gallery_Swipe_Pages  extends BasePage {
	public Gallery_Swipe_Pages() {
		PageFactory.initElements(new AppiumFieldDecorator(AppDriver), this);
	}
	AndroidTouchAction actions=new AndroidTouchAction(AppDriver);

	@AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Views\"]")
	public MobileElement ViewsOption;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Gallery\"]")
	public MobileElement GalleryOption;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"1. Photos\"]")
	public MobileElement PhotosOption;
		
//	Click on view option
	public void Clickon_ViewsOption() throws Exception {
		logger.info("Click on View");
		ViewsOption.click();
	}
//	Click on gallery option
	public void Clickon_GalleryOption() throws Exception {
		logger.info("Click on Gallery");
		GalleryOption.click();
	}
//	Click on Photo option
	public void Clickon_PhotosOption() throws Exception {
		logger.info("Click on Photos");
		PhotosOption.click();
	}
//	Swipe gallery Function
	public void Swipe_Gallery() throws Exception{
		logger.info("Swipe in Gallery");
		AndroidElement pic1=(AndroidElement) AppDriver.findElements(By.className("android.widget.ImageView")).get(0);
		actions.press(ElementOption.element(pic1)).waitAction().moveTo(PointOption.point(-500, 210)).release().perform();
		
	}
//	Check Assertion
	public boolean Check() {
		logger.info("Check for Asssertion");
		AndroidElement pic2=(AndroidElement) AppDriver.findElements(By.className("android.widget.ImageView")).get(2);
		if(pic2.isSelected())
			return true;
		else return false;
		
	}

}
