package StepDefinations;

import org.testng.Assert;

import com.Android.Base.BasePage;
import com.Android.Base.BasicFun;
import com.Android.Base.XlsReader;
import com.Android.Pages.Web_view_Pages;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

//Web view Steps
public class Web_view_Steps extends BasePage {

	@When("^Choose Views and Scroll down$")
	public void choose_Views_and_Scroll_down() throws Throwable {
		logger.info("Web View Feature Started");
		Web_view_Pages web = new Web_view_Pages();
		web.Clickon_ViewsOption();
		// Vertical swipe
		BasicFun.VerticalSwipe(0.9, 0.1);
		Thread.sleep(1000);
		BasicFun.VerticalSwipe(0.9, 0.1);
		Thread.sleep(1000);


	}

	@When("^Click on Webview$")
	public void click_on_Webview() throws Throwable {
		Web_view_Pages web = new Web_view_Pages();
		Thread.sleep(1000);
		web.Clickon_WebviewOption();
	}

	@When("^Click on link$")
	public void click_on_link() throws Throwable {
		Web_view_Pages web = new Web_view_Pages();
		Thread.sleep(1000);
		web.Clickon_LinkOption();
	}

	@Then("^Check if Sucessfully reached Webview Page$")
	public void check_if_Sucessfully_reached_Webview_Page() throws Throwable {
		Web_view_Pages web = new Web_view_Pages();
		// Assertion
		Assert.assertEquals(web.Clickon_ContentOption(), XlsReader.readExcel(9, 1));
		logger.info("Web View Feature Ended");

	}

}
