package config;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

public class setUp {
    protected static AppiumDriver driver;
    protected static DesiredCapabilities desiredCapabilities;
    protected static WebDriverWait wait;

    protected static String[] device = {"redmi", "emulator", "vivo", "oppo"};
    protected static String devicesUsed = device[2];

    protected static int duration = 60;
    protected static int threadSleep = 5000;
    protected static int threadSleepOpeningApplication = 15000;


    //Global Variable
    protected static String companyName = "CompanyA";
    protected static String teamName = "TeamA";
    protected static String HQName = "HQA";
    protected static String projectName = "ProjectA";
    protected static String companyId;

    protected static String docTitle1 = "DocA";
    protected static String docContent1 = "Desc for DocA";
    protected static String docCheers = "Yay!";
    protected static String textComment = "Comment sample";
}
