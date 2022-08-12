package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MainTest extends BaseTest {


    private static final String MY_EMAIL = "testmynewmail662@gmail.com";
    private static final String MY_PASSWORD = "kfvbrjy1" + "\n";
    private static final String USER_EMAIL = "shvarevalerochka2@gmail.com"  + "\n";
    private static final String MESSAGE = "Hello, this is my test message.";
    private static final int ACCEPTED_RESULT = 1;


    @Test
    public void checkThatMessageSendToTheUser() {
        getHomePage().implicitWait(30);
        getHomePage().putYourEmailAddress(MY_EMAIL);
        getHomePage().clickNextButton();
        getHomePage().implicitWait(60);
        getHomePage().putYourPassword(MY_PASSWORD);
        getHomePage().implicitWait(60);
        getSendMessagePage().clickWriteButton();
        getSendMessagePage().implicitWait(100);
        getSendMessagePage().putEmailAddress(USER_EMAIL);
        getSendMessagePage().implicitWait(100);
        getSendMessagePage().AddYourText(MESSAGE);
        getSendMessagePage().implicitWait(60);
        getSendMessagePage().clickSendButton();
        getSendMessagePage().implicitWait(60);
        getSendMessagePage().clickSentMessagesButton();
        getSendMessagePage().implicitWait(60);
        Assert.assertEquals(getSendMessagePage().getResultsEmailList(), ACCEPTED_RESULT);
    }
}

