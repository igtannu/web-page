package StepDefinations;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.Assert;

import com.Android.Base.BasePage;
import com.Android.Pages.Hide_Show_Animation_Pages;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

// Hide Show Animation Steps
public class Hide_Show_Animation_Steps extends BasePage {

	@Given("^Open Emulator and App$")
	public void open_Emulator_and_App() throws Throwable {
		BasePage.setup();

	}

	@When("^Choose Animation and Hide show animation$")
	public void choose_Animation_and_Hide_show_animation() throws Throwable {
		logger.info("Hide and Show Buttons Feature Started");
		Hide_Show_Animation_Pages hide_show = new Hide_Show_Animation_Pages();
		hide_show.Clickon_Animationoption();
		hide_show.Clickon_Hide_Show_Animation();

	}

	@And("^Click on buttons for hiding$")
	public void click_on_buttons() throws Throwable {
		Hide_Show_Animation_Pages hide_show = new Hide_Show_Animation_Pages();
		hide_show.Clickon_Button_0();
	}

	@Then("^Check if Sucessfully hide buttons$")
	public void check() throws Throwable {
		Hide_Show_Animation_Pages hide_show = new Hide_Show_Animation_Pages();
//	Assertions on every buttons
		if (hide_show.check_btn_0())
			Assert.assertTrue(true);
		else
			Assert.fail("Button with value 1 is displayed");
		if (hide_show.check_btn_1())
			Assert.assertTrue(true);
		else
			Assert.fail("Button with value 2 is displayed");
		if (hide_show.check_btn_2())
			Assert.assertTrue(true);
		else
			Assert.fail("Button with value 3 is displayed");
		if (hide_show.check_btn_3())
			Assert.assertTrue(true);
		else
			Assert.fail("Button with value 4 is displayed");
		logger.info("Hide Buttons Feature Ended");

	}

	@And("^Click on Show_button$")
	public void click_on_Show_button() throws Throwable {
		Hide_Show_Animation_Pages hide_show = new Hide_Show_Animation_Pages();
		hide_show.Clickon_ShowButton();

	}

	@Then("^Check if buttons Displayed$")
	public void check_if_buttons_Displayed() throws Throwable {
		Hide_Show_Animation_Pages hide_show = new Hide_Show_Animation_Pages();
//	Assertions on every buttons
		if (!hide_show.check_btn_0())
			Assert.assertTrue(true);
		else
			Assert.fail("Button with value 1 is displayed");
		if (!hide_show.check_btn_1())
			Assert.assertTrue(true);
		else
			Assert.fail("Button with value 2 is displayed");
		if (!hide_show.check_btn_2())
			Assert.assertTrue(true);
		else
			Assert.fail("Button with value 3 is displayed");
		if (!hide_show.check_btn_3())
			Assert.assertTrue(true);
		else
			Assert.fail("Button with value 4 is displayed");
		logger.info("Show Buttons Feature Ended");

	}

}
