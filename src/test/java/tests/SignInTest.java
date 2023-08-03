package tests;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.Assert;
import pages.SignInPage;
import utiles.User;

public class SignInTest extends TestInit {

    @Test
    public void checkLogin() {
        SignInPage signInPage = new SignInPage();
        User user = User.builder().build();
        signInPage.login(user);

        Assert.assertTrue(true);
    }

}
