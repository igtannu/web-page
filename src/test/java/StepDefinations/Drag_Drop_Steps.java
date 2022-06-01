package StepDefinations;

import org.apache.log4j.Logger;
import org.testng.Assert;

import com.Android.Base.BasePage;
import com.Android.Base.XlsReader;
import com.Android.Pages.Drag_Drop_Pages;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

//Drap Drop steps
public class Drag_Drop_Steps extends BasePage {

	@When("^Click on Views and Drag_Drop$")
	public void click_on_Views_and_Drag_Drop() throws Throwable {
		Drag_Drop_Pages drag_drop = new Drag_Drop_Pages();
		logger.info("Drag Drop Feature Started");
		drag_drop.Clickon_ViewsOption();
		drag_drop.Clickon_DragDropOption();

	}

	@When("^Drag First circle to Second$")
	public void drag_First_circle_to_Second() throws Throwable {
		Drag_Drop_Pages drag_drop = new Drag_Drop_Pages();
		drag_drop.Drag_drop_Function();

	}

	@Then("^Sucessfully Dropped and get it Written$")
	public void sucessfully_Dropped_and_get_it_Written() throws Throwable {
		Drag_Drop_Pages drag_drop = new Drag_Drop_Pages();
		// Assertion
		Assert.assertEquals(drag_drop.Assert_Drag_Drop(), XlsReader.readExcel(10, 1));
		logger.info("Drag Drop Feature Ended");

	}

}
