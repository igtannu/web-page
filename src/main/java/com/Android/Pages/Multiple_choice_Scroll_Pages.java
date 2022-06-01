package com.Android.Pages;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.Android.Base.BasePage;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Multiple_choice_Scroll_Pages extends BasePage{
	public  Multiple_choice_Scroll_Pages() {
		PageFactory.initElements(new AppiumFieldDecorator(AppDriver), this);
	}
	@AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Views\"]")
	public MobileElement ViewsOption;	
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Lists\"]")
	public MobileElement ListsOption;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"10. Single choice list\"]")
	public MobileElement SingelChoiceOption;
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.CheckedTextView[4]")
	public MobileElement Childern_selection;

	
//	Click on View Option
	public void Clickon_ViewsOption() throws Exception {
		logger.info("Click on View");
		ViewsOption.click();
		}
	
//	Click on Single Choice Option
	public void Clickon_SingelChoiceOption() throws Exception {
		logger.info("Click on Singel Option");
		SingelChoiceOption.click();
		}
//	Click on  List Option
	public void Clickon_ListsOption() throws Exception {
		logger.info("Click on Lists Option");
		ListsOption.click();
		}
//	Click on Children Option

	public void Select_childern() throws Exception {
		logger.info("Click on Select Children");
		Childern_selection.click();
		}
//	Assert if Children Selected

	public boolean childern_selected() {
		logger.info("Assert of Children Selected");
		return Childern_selection.isSelected();
		
		}
	
		
	
}