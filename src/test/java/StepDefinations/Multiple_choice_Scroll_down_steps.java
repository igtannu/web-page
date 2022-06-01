package StepDefinations;

import org.testng.Assert;

import com.Android.Base.BasePage;
import com.Android.Base.BasicFun;
import com.Android.Pages.Multiple_choice_Scroll_Pages;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Multiple_choice_Scroll_down_steps extends BasePage {
	@When("^Choose Views and Scroll$")
	public void choose_Views_and_Scroll() throws Throwable {
		logger.info("Multiple Choice Feature Started that will be failed and save screenshot");
		Multiple_choice_Scroll_Pages mutliple_choice = new Multiple_choice_Scroll_Pages();
		mutliple_choice.Clickon_ViewsOption();
		// Vertical Scroll
		BasicFun.VerticalSwipe(0.8, 0.1);

	}

	@When("^Choose List and Multiple choice list$")
	public void choose_List_and_Multiple_choice_list() throws Throwable {
		Multiple_choice_Scroll_Pages mutliple_choice = new Multiple_choice_Scroll_Pages();
		mutliple_choice.Clickon_ListsOption();
		mutliple_choice.Clickon_SingelChoiceOption();

	}

	@When("^Choose Multiple Options$")
	public void choose_Multiple_Options() throws Throwable {
		Multiple_choice_Scroll_Pages mutliple_choice = new Multiple_choice_Scroll_Pages();
		mutliple_choice.Select_childern();

	}

	@Then("^Check if Options are Selected$")
	public void check_if_Options_are_Selected() throws Throwable {
		Multiple_choice_Scroll_Pages mutliple_choice = new Multiple_choice_Scroll_Pages();
		mutliple_choice.childern_selected();
//		Assertions Failed
		Assert.assertEquals(mutliple_choice.childern_selected(), true);
		logger.info("Multiple Choice Feature Ended");

	}

}
