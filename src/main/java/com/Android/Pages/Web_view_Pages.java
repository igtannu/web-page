package com.Android.Pages;

import org.openqa.selenium.support.PageFactory;

import com.Android.Base.BasePage;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Web_view_Pages extends BasePage {
	public Web_view_Pages() {
		PageFactory.initElements(new AppiumFieldDecorator(AppDriver), this);
	}

	@AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Views\"]")
	public MobileElement ViewsOption;

	@AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"WebView\"]")
	public MobileElement Webview;

	@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"i am a link\"]/android.widget.TextView")
	public MobileElement Link;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.webkit.WebView/android.webkit.WebView/android.widget.TextView")
	public MobileElement Content;

//	Click on views Option
	public void Clickon_ViewsOption() throws Exception {
		logger.info("Click on view Option");
		ViewsOption.click();
	}

//	Click on Web view Option
	public void Clickon_WebviewOption() throws Exception {
		logger.info("Click on Webview Option");
		Webview.click();
	}

//	Click on Link Option
	public void Clickon_LinkOption() throws Exception {
		logger.info("Click on Link Option");
		Link.click();
	}

//	Assertion on Content 
	public String Clickon_ContentOption() throws Exception {
		logger.info("Assertion on Content");
		return Content.getText();
	}

}
