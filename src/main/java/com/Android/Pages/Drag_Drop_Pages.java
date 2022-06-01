package com.Android.Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.Android.Base.BasePage;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;

//Drag And Drop Pages
public class Drag_Drop_Pages  extends BasePage {
//	Log4jprop logger = new Log4jprop("Drag_Drop_Pages");
	public Drag_Drop_Pages() {
		PageFactory.initElements(new AppiumFieldDecorator(AppDriver), this);
	}
	AndroidTouchAction actions=new AndroidTouchAction(AppDriver);

	@AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Views\"]")
	public MobileElement ViewsOption;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Drag and Drop\"]")
	public MobileElement DragDrop;
	
	@AndroidFindBy(id = "io.appium.android.apis:id/drag_dot_1")
	public AndroidElement drag;
	
	@AndroidFindBy(id = "io.appium.android.apis:id/drag_dot_2")
	public AndroidElement drop;
	
	@AndroidFindBy(id = "io.appium.android.apis:id/drag_result_text")
	public AndroidElement result;
	
//	Click on Views Option
	public void Clickon_ViewsOption() throws Exception {
		logger.info("Click on Views");
		ViewsOption.click();
	}
//	Click on Drag & Drop
	public void Clickon_DragDropOption() throws Exception {
		logger.info("Click on Drag and Drop");
		DragDrop.click();
	}
//	Drag & Drop Functioning
	public void Drag_drop_Function() throws Exception {
		logger.info("Drag and Dropping ");
		actions.longPress(ElementOption.element(drag)).
		waitAction().moveTo(ElementOption.element(drop)).release().perform();
	}
// Return of output of Drag and Drop
	public String Assert_Drag_Drop() {
		logger.info("Dropped");
		return result.getText();
	}
	

}
