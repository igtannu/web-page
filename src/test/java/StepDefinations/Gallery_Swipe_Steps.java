package StepDefinations;

import com.Android.Base.BasePage;
import com.Android.Pages.Gallery_Swipe_Pages;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

// Gallery Swipe
public class Gallery_Swipe_Steps extends BasePage {

	@When("^Click on Views and Gallery$")
	public void click_on_Views_and_Gallery() throws Throwable {
		logger.info("Gallery Swipe Feature Started");
		Gallery_Swipe_Pages gallery = new Gallery_Swipe_Pages();
		gallery.Clickon_ViewsOption();
	}

	@When("^Click on photos$")
	public void click_on_photos() throws Throwable {
		Gallery_Swipe_Pages gallery = new Gallery_Swipe_Pages();
		gallery.Clickon_GalleryOption();
		gallery.Clickon_PhotosOption();
	}

	@When("^Swipe images$")
	public void swipe_images() throws Throwable {
		Gallery_Swipe_Pages gallery = new Gallery_Swipe_Pages();
		gallery.Swipe_Gallery();

	}

	@Then("^Check Sucessfully Swipped$")
	public void check_Sucessfully_Swipped() throws Throwable {
		Gallery_Swipe_Pages gallery = new Gallery_Swipe_Pages();
		// Assertions
		if (gallery.Check())
			Assert.assertTrue(true);
		else
			Assert.fail("Swipe is Works Properly");
		logger.info("Gallery Swipe Feature Ended");

	}

}