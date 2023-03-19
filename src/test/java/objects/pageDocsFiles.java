package objects;

import config.setUp;
import org.openqa.selenium.By;

public class pageDocsFiles extends setUp {

    By buttonAddItems = By.xpath("//android.view.View[contains(@content-desc,\"Home\")]/ancestor::android.view.View/preceding-sibling::android.widget.Button");
    public By getButtonAddItems() {
        return buttonAddItems;
    }

    By HeaderDocsAndFiles = By.xpath("//*[contains(@content-desc,\"Doc & Files\")]");
    public By getHeaderDocsAndFiles() {
        return HeaderDocsAndFiles;
    }

    By buttonAddDoc = By.xpath("//android.view.View[@content-desc=\"Add a new doc\"]");
    public By getButtonAddDoc() {
        return buttonAddDoc;
    }

    By buttonAddFile = By.xpath("//android.view.View[@content-desc=\"Upload File\"]");
    public By getButtonAddFile() {
        return buttonAddFile;
    }

    By buttonAddFolder = By.xpath("//android.view.View[@content-desc=\"Create a new folder\"]");
    public By getButtonAddFolder() {
        return buttonAddFolder;
    }

    By inputDocTitle = By.xpath("//*/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText");
    public By getInputDocTitle() {
        return inputDocTitle;
    }

    By inputDocContent = By.xpath("//*/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.widget.EditText");
    public By getInputDocContent() {
        return inputDocContent;
    }

    By buttonAddSubsDoc = By.xpath("//android.view.View[@content-desc=\"Who do you wanna be notified?\"]");
    public By getButtonAddSubsDoc() {
        return buttonAddSubsDoc;
    }

    By checklistSubsDoc = By.xpath("//*/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.CheckBox");
    public By getChecklistSubsDoc() {
        return checklistSubsDoc;
    }

    By buttonDoneSubsDoc = By.xpath("//android.view.View[@content-desc=\"done\"]");
    public By getButtonDoneSubsDoc() {
        return buttonDoneSubsDoc;
    }

    By buttonPublish = By.xpath("//android.widget.Button[@content-desc=\"Publish\"]");
    public By getButtonPublish() {
        return buttonPublish;
    }

    By switchPublicPrivate = By.xpath("//*/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.Switch");
    public By getSwitchPublicPrivate() {
        return switchPublicPrivate;
    }

    By toastSuccess = By.xpath("//android.view.View[contains(@content-desc,\"successful\")]");
    public By getToastSuccess() {
        return toastSuccess;
    }

    By createdDoc = By.xpath("//android.view.View[contains(@content-desc,\""+docTitle1+"\")]");
    public By getCreatedDoc() {
        return createdDoc;
    }

    By buttonOptionDoc = By.xpath("//android.view.View[contains(@content-desc, \"test\")]/android.widget.Button");
    public By getButtonOptionDoc() {
        return buttonOptionDoc;
    }

    By buttonEditDoc = By.xpath("//android.view.View[contains(@content-desc,\"Edit\")]");
    public By getButtonEditDoc() {
        return buttonEditDoc;
    }

    By buttonPublishChange = By.xpath("//android.widget.Button[@content-desc=\"Publish changes\"]");
    public By getButtonPublishChange() {
        return buttonPublishChange;
    }

    By buttonArchiveDoc = By.xpath("//android.view.View[@content-desc=\"Archive\"]");
    public By getButtonArchiveDoc() {
        return buttonArchiveDoc;
    }

    By buttonOk = By.xpath("//android.widget.Button[@content-desc=\"Ok\"]");
    public By getButtonOk() {
        return buttonOk;
    }

    By toastMandatory = By.xpath("//android.view.View[contains(@content-desc, \"must be filled\")]");
    public By getToastMandatory() {
        return toastMandatory;
    }

    public By getTitleDoc(String newDocTitle) {
        By titleDoc = By.xpath("//android.view.View[contains(@content-desc,\""+newDocTitle+"\")]");
        return titleDoc;
    }

    By buttonDocCheers = By.xpath("//android.view.View[contains(@content-desc,\""+docTitle1+"\")]/android.widget.ImageView[2]");
    public By getButtonDocCheers() {
        return buttonDocCheers;
    }

    By inputDocCheers = By.xpath("//android.view.View[contains(@content-desc,\""+docTitle1+"\")]/android.widget.EditText");
    public By getInputDocCheers() {
        return inputDocCheers;
    }

    By buttonDoneDocCheers = By.xpath("//android.view.View[contains(@content-desc,\""+docTitle1+"\")]/android.view.View[3]");
    public By getButtonDoneDocCheers() {
        return buttonDoneDocCheers;
    }

    public By getCreatedCheers(String txtCheers) {
        By createdCheers = By.xpath("//android.widget.ImageView[@content-desc=\""+txtCheers+"\"]");
        return createdCheers;
    }

    By buttonDeleteCheersDoc = By.xpath("//android.view.View[contains(@content-desc,\""+docTitle1+"\")]/following-sibling::android.view.View");
    public By getButtonDeleteCheersDoc() {
        return buttonDeleteCheersDoc;
    }

    By buttonAddComments = By.xpath("//android.view.View[@content-desc=\"Add new comment...\"]");
    public By getButtonAddComments() {
        return buttonAddComments;
    }

    By inputComment = By.xpath("//android.widget.TextView[@text=\"Tell your comment here...\"]/preceding-sibling::android.widget.EditText");
    public By getInputComment() {
        return inputComment;
    }

    By buttonSubmit = By.xpath("//android.widget.Button[@content-desc=\"submit\"]");
    public By getButtonSubmit() {
        return buttonSubmit;
    }

    public By getCreatedComment(String comment) {
        By createdComment = By.xpath("//android.view.View[contains(@content-desc,\""+comment+"\")]");
        return createdComment;
    }

    By ButtonOptionCreatedComment = By.xpath("//android.view.View[contains(@content-desc,\""+textComment+"\")]/android.view.View[1]");
    public By getButtonOptionCreatedComment() {
        return ButtonOptionCreatedComment;
    }

    By toastSuccessEditComment = By.xpath("//android.view.View[@content-desc=\"your comment has been edited\"]");
    public By getToastSuccessEditComment() {
        return toastSuccessEditComment;
    }

    By buttonReplyComment = By.xpath("//android.view.View[@content-desc=\"Reply\"]");
    public By getButtonReplyComment() {
        return buttonReplyComment;
    }

    By toastArchiveSuccess = By.xpath("//android.view.View[@content-desc=\"your comment has been archived\"]");
    public By getToastArchiveSuccess() {
        return toastArchiveSuccess;
    }
}
