package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utiles.User;

public class SignInPage extends BasePage {

    @FindBy(xpath = "//input[@data-test='username']")
    private WebElement username;

    @FindBy(xpath = "//input[@data-test='password']")
    private WebElement password;

    @FindBy(xpath = "//input[@data-test='login-button']")
    private WebElement submitBtn;

    public HomePage login(User user) {
        setValue(username, user.getEmail());
        setValue(password, user.getPassword());
        click(submitBtn);
        return new HomePage();
    }
}
