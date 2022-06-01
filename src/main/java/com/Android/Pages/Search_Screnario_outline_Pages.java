package com.Android.Pages;

import org.openqa.selenium.support.PageFactory;

import com.Android.Base.BasePage;
import com.Android.Base.BasicFun;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Search_Screnario_outline_Pages extends BasePage {
	public Search_Screnario_outline_Pages() {
		PageFactory.initElements(new AppiumFieldDecorator(AppDriver), this);
	}

	@AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"App\"]")
	public MobileElement AppOption;

	@AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Search\"]")
	public MobileElement SearchOption;

	@AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Invoke Search\"]")
	public MobileElement InvokeSearchOption;

	@AndroidFindBy(id = "io.appium.android.apis:id/txt_query_prefill")
	public MobileElement PrefillOption;

	@AndroidFindBy(id = "io.appium.android.apis:id/txt_query_appdata")
	public MobileElement AppDataOption;

	@AndroidFindBy(id = "io.appium.android.apis:id/btn_start_search")
	public MobileElement OnSearchbtnOption;

	@AndroidFindBy(id = "android:id/search_src_text")
	public MobileElement Search_bar_Option;

//	Click on App Option
	public void Clickon_AppOption() throws Exception {
		logger.info("Click on app Option");
		AppOption.click();

	}
//	Click on Search Option

	public void Clickon_SearchOption() throws Exception {
		logger.info("Click on Search Option");
		SearchOption.click();

	}
//	Click on Invoke Search Option

	public void Clickon_InvokeSearchOption() throws Exception {
		logger.info("Click on invoke Option");
		InvokeSearchOption.click();

	}
//	send Prefill Option

	public void Clickon_PrefillOption(String Prefill) throws Exception {
		logger.info("Send keys Prefill Option");
		PrefillOption.sendKeys(Prefill);

	}
//	send App Data Option

	public void Clickon_AppDataOption(String Appdata) throws Exception {
		logger.info("Send keys in App data Option");
		AppDataOption.sendKeys(Appdata);

	}

//	click on search btn Option
	public void Clickon_OnSearchbtnOption() throws Exception {
		logger.info("Click on Search btn");
		OnSearchbtnOption.click();
	}

//	Assert Search bar
	public boolean Clickon_Search_bar_Option() {
		logger.info("Assert on Search btn");
		if (BasicFun.isElementDisplayed(Search_bar_Option))
			return true;
		return false;

	}

}
