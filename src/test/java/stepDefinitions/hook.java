package stepDefinitions;

import config.setUp;
import helper.*;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import objects.*;
import io.appium.java_client.android.AndroidDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class hook extends setUp {

    devices devices = new devices();
    onBoard onBoard = new onBoard();

    @Before
    public void Before() throws MalformedURLException, InterruptedException {
        desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("appium:appPackage", "staging.cicle");
        desiredCapabilities.setCapability("appium:appActivity", "staging.cicle.MainActivity");
        desiredCapabilities.setCapability("platformName", "Android");
        devices.deviceList(desiredCapabilities,devicesUsed);

        URL remoteUrl = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver(remoteUrl, desiredCapabilities);

        wait = new WebDriverWait(driver,duration);

        Thread.sleep(threadSleepOpeningApplication);

        onBoard.login();


    }


    @After
    public void after(Scenario scenario) throws IOException {
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        if (scenario.isFailed()){
            FileUtils.copyFile(srcFile, new File(System.getProperty("user.dir") + "/src/test/resources/screenshots/failed/" + scenario.getName() + ".png"));
        } else {
            FileUtils.copyFile(srcFile, new File(System.getProperty("user.dir") + "/src/test/resources/screenshots/success/" + scenario.getName() + ".png"));
        }

        driver.quit();
    }
}
