package helper;

import config.setUp;
import objects.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.util.List;

public class onBoard extends setUp {
    pageWelcome elementPageWelcome = new pageWelcome();
    pageHome elementPageHome = new pageHome();
    pageLogin elementPageLogin = new pageLogin();

    public void login() throws InterruptedException {
        //skip welcome page
       wait.until(ExpectedConditions.presenceOfElementLocated(elementPageWelcome.getButtonSkip()));
        if (driver.findElement(elementPageWelcome.getButtonSkip()).isDisplayed()) {
            driver.findElement(elementPageWelcome.getButtonSkip()).click();
        }

        //Login process
        WebElement buttonToLoginPage = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageWelcome.getButtonToLoginPage()));
        buttonToLoginPage.click();

        WebElement buttonSignInGoogle = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageLogin.getButtonSignInGoogle()));
        buttonSignInGoogle.click();

        WebElement accountGoogle = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageLogin.getAccountGoogle()));
        accountGoogle.click();

        //Logged in
        WebElement imgLogoCicle = wait.until(ExpectedConditions
                .presenceOfElementLocated(elementPageHome.getImgLogoCicle()));
        imgLogoCicle.isDisplayed();

        List<WebElement> notifNewUser = driver.findElements(elementPageHome.getNotifNewUser());
        boolean isPresent = notifNewUser.size() > 0;

        if (isPresent) {
            WebElement buttonNotifClose = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageHome.getButtonNotifClose()));
            buttonNotifClose.click();
        }

        WebElement buttonExistingCompany = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageHome.getButtonCreatedCompanyName()));
        buttonExistingCompany.isDisplayed();
        buttonExistingCompany.click();

        Thread.sleep(threadSleep);


    }
}
