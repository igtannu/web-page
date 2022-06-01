package com.Android.Pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.Android.Base.BasePage;
import com.Android.Base.BasicFun;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Hide_Show_Animation_Pages extends BasePage {
	public Hide_Show_Animation_Pages() {
		PageFactory.initElements(new AppiumFieldDecorator(AppDriver), this);
	}

	@AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Animation\"]")
	public MobileElement AnimationOption;

	@AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Hide-Show Animations\"]")
	public MobileElement HideShowAnimation;

	@AndroidFindBy(id = "io.appium.android.apis:id/addNewButton")
	public MobileElement ShowButton;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.Button[1]")
	public MobileElement Button;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.Button[1]")
	public MobileElement Button_1;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.Button[2]")
	public MobileElement Button_2;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.Button[3]")
	public MobileElement Button_3;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.Button[4]")
	public MobileElement Button_4;

//	Click on Animation Option
	public void Clickon_Animationoption() throws Exception {
		logger.info("Click on Animation");
		AnimationOption.click();
	}

//	Click on Hide Show Animation Option
	public void Clickon_Hide_Show_Animation() throws Exception {
		logger.info("Click on Hide and Show Animation");
		HideShowAnimation.click();
	}

//	Click on Show Button
	public void Clickon_ShowButton() throws Exception {
		logger.info("Click on Show Button");
		ShowButton.click();
	}

//	Click on  Buttons
	public void Clickon_Button_0() throws Exception {
		logger.info("Click to hide Button");
		Button.click();
		logger.info("Click to hide Button");
		Button.click();
		logger.info("Click to hide Button");
		Button.click();
		logger.info("Click to hide Button");
		Button.click();
	}

//	Assertion of Button 1
	public boolean check_btn_0() {
		logger.info("Assertion of Button 1");
		if (!BasicFun.isElementDisplayed(Button_1))
			return true;
		return false;
	}

// Assertion of Button 2	
	public boolean check_btn_1() {
		logger.info("Assertion of Button 2");
		if (!BasicFun.isElementDisplayed(Button_2))
			return true;
		return false;
	}

//	Assertion of Button 3
	public boolean check_btn_2() {
		logger.info("Assertion of Button 3");
		if (!BasicFun.isElementDisplayed(Button_3))
			return true;
		return false;
	}

//	Assertion of Button 4
	public boolean check_btn_3() {
		logger.info("Assertion of Button 4");
		if (!BasicFun.isElementDisplayed(Button_4))
			return true;
		return false;
	}
}
