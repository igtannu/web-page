package Hooks;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;

import com.Android.Base.BasePage;
import com.Android.Utlis.AppiumServer;
import com.aventstack.extentreports.service.ExtentTestManager;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class Hooks extends BasePage{

	protected static AppiumDriverLocalService service;

//Start Server
//	@Before
//	public void startservices() {
//		AppiumServer.startservice();
//	}
//
//	// Stop server
//	@After
//	public void stopservices() {
//		AppiumServer.stopservice();
//	}

//For screenshot
	public static String getBase64Screenshot() throws IOException {
		logger.info("Save screenshot");
		return ((TakesScreenshot) BasePage.getDriver()).getScreenshotAs(OutputType.BASE64);
	}

//To store screenshots in project folder
	@After
	public void af(Scenario scenario) throws IOException {
		
		if (scenario.isFailed()) {
			logger.info("Store Screenshot in Folder");
			ExtentTestManager.getTest().addScreenCaptureFromBase64String(getBase64Screenshot());
		
		Date dat = new Date();
		File src = ((TakesScreenshot) BasePage.getDriver()).getScreenshotAs(OutputType.FILE);

		SimpleDateFormat Sdf = new SimpleDateFormat("ddMMYYYY_HHmmss");
		String sdat = Sdf.format(dat);

		FileUtils.copyFile(src, new File((BasePage.ssdir) + "image_" + sdat + ".png"));
		}
	}
}
