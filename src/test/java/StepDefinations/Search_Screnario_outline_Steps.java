package StepDefinations;

import org.testng.Assert;

import com.Android.Base.BasePage;
import com.Android.Pages.Search_Screnario_outline_Pages;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

// Search Query Steps
public class Search_Screnario_outline_Steps extends BasePage {

	@When("^Choose App and Search$")
	public void choose_App_and_Search() throws Throwable {
		logger.info("Search Scrneario Feature Started");
		Search_Screnario_outline_Pages search = new Search_Screnario_outline_Pages();
		search.Clickon_AppOption();
		search.Clickon_SearchOption();

	}

	@When("^Choose Invoke Search$")
	public void choose_Invoke_Search() throws Throwable {
		Search_Screnario_outline_Pages search = new Search_Screnario_outline_Pages();
		search.Clickon_InvokeSearchOption();

	}

	@When("^Enter Prefill Query (.*)$")
	public void enter_Prefill_Query_Prefill_Query(String Prefill) throws Throwable {
		Search_Screnario_outline_Pages search = new Search_Screnario_outline_Pages();
		search.Clickon_PrefillOption(Prefill);
	}

	@When("^Enter  App Data (.*)$")
	public void enter_App_Data_App_Data(String App_Data) throws Throwable {
		Search_Screnario_outline_Pages search = new Search_Screnario_outline_Pages();
		search.Clickon_AppDataOption(App_Data);
	}

	@When("^Click on OnSearchRequest button$")
	public void click_on_OnSearchRequest_button() throws Throwable {
		Search_Screnario_outline_Pages search = new Search_Screnario_outline_Pages();
		search.Clickon_OnSearchbtnOption();
	}

	@Then("^User is on Search Page$")
	public void user_is_on_Search_Page() throws Throwable {
		Search_Screnario_outline_Pages search = new Search_Screnario_outline_Pages();
		Assert.assertEquals(search.Clickon_Search_bar_Option(), true);
		logger.info("Search Scrneario Feature Ended");

	}

}
