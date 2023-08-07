package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utiles.User;

import static org.openqa.selenium.remote.tracing.EventAttribute.setValue;

public class SignInPage extends BasePage {

    @FindBy(xpath = "//input[@data-test='username']")
    private WebElement email;

    @FindBy(xpath = "//input[@data-test='password']")
    private WebElement password;

    @FindBy(xpath = "//input[@data-test='login-button']")
    private WebElement submitBtn;

    public HomePage clickLoginBtn() {
        click(submitBtn);
        return this.clickLoginBtn();
    }
}
