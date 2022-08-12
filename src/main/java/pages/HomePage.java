package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "//input[@type='email']")
    private WebElement inputForEmail;

    @FindBy(xpath = "//span[contains(text(),'Далее')]")
    private WebElement nextButton;

    @FindBy(xpath = "//input[@autocomplete='current-password']")
    private WebElement inputForPassword;

    @FindBy(xpath = "//span[contains(text(),'Далее')]")
    private WebElement nextButtonPassword;


    public void putYourEmailAddress(final String keyword) {
        inputForEmail.sendKeys(keyword);
    }

    public void clickNextButton() {
        nextButton.click();
    }

    public void putYourPassword(final String keyword) {
        inputForPassword.sendKeys(keyword);
    }
}

