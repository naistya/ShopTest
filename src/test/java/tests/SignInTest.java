package tests;
import org.testng.annotations.Test;
import org.testng.Assert;
import pages.SignInPage;
import utiles.User;

public class SignInTest extends TestInit {

    @Test
    public void checkLogin() {
        SignInPage signInPage = new SignInPage();
        User user = User.builder()
                .email("standard_user")
                .password("secret_sauce")
                .build();


        Assert.assertTrue(true);
    }

}
