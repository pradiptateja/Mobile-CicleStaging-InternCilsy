package objects;

import config.setUp;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class pageHome extends setUp {

    By notifNewUser = By.xpath("//android.view.View[@content-desc=\"you are a new user on this device and you have not joined any company, please create a new company or join another company\"]");
    public By getNotifNewUser() {
        return notifNewUser;
    }

    By buttonNotifClose = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.widget.Button");
    public By getButtonNotifClose() {
        return buttonNotifClose;
    }

    By imgLogoCicle = By.xpath("//android.widget.ImageView[@content-desc=\"Cicle Logo\"]");
    public By getImgLogoCicle() {
        return imgLogoCicle;
    }


    By buttonCreatedCompanyName = By.xpath("//android.view.View[@content-desc="+ "\""+ companyName +"\"]");
    public By getButtonCreatedCompanyName() {
        return buttonCreatedCompanyName;
    }

    By buttonCreatedHQ = By.xpath("//android.widget.Button[contains(@content-desc, \""+HQName+"\")]");
    public By getButtonCreatedHQ() {
        return buttonCreatedHQ;
    }

    By buttonCreatedTeam = By.xpath("//android.widget.Button[contains(@content-desc, \""+teamName+"\")]");
    public By getButtonCreatedTeam() {
        return buttonCreatedTeam;
    }

    By buttonCreatedProject = MobileBy.AndroidUIAutomator("new UiScrollable (new UiSelector().scrollable(true)).scrollIntoView(descriptionContains(\""+projectName+"\"))");
    public By getButtonCreatedProject() {
        return buttonCreatedProject;
    }

    By buttonDocsAndFiles = By.xpath("//*[contains(@content-desc,\"Docs & Files\")]");
    public By getButtonDocsAndFiles() {
        return buttonDocsAndFiles;
    }

}
