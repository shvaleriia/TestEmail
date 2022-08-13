package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SendMessagePage extends BasePage {

    public SendMessagePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "div.T-I.T-I-KE.L3")
    private WebElement mainButton;


    @FindBy(xpath = "//input[@class='agP aFw']")
    private WebElement enterYourEmail;
    
    @FindBy(xpath = "//div[@class='Am Al editable LW-avf tS-tW']")
    private WebElement textField;


    @FindBy( xpath= "//div[@class='T-I J-J5-Ji aoO v7 T-I-atl L3']")
    private WebElement sendButton;

    @FindBy(css = "div.TN.bzz.aHS-bnu")
    private WebElement sentMessagesButton;


    @FindBy(xpath = "//div[@class='BltHke nH oy8Mbf aE3']")
    private List<WebElement> sentEmailList;



    public void clickWriteButton() {
        mainButton.click();
    }


    public void putEmailAddress(final String keyword) {
        enterYourEmail.sendKeys(keyword);
    }

    public void AddYourText(final String keyword) {
        textField.sendKeys(keyword);
    }
    public void clickSendButton() {
        sendButton.click();}

    public void clickSentMessagesButton() {
        sentMessagesButton.click();}

    public List<WebElement>
    getSentEmailList() {
        return sentEmailList;
    }

    public int getResultsEmailList() {
        return getSentEmailList().size();
    }
}
