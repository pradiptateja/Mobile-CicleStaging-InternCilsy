package objects;

import org.openqa.selenium.By;

public class pageWelcome {

    By buttonSkip = By.xpath("//android.view.View[@content-desc=\"Skip\"]");
    public By getButtonSkip() {
        return buttonSkip;
    }

    By buttonToLoginPage = By.xpath("//android.widget.Button[@content-desc=\"Go to Sign In\"]");
    public By getButtonToLoginPage() {
        return buttonToLoginPage;
    }
}
