package test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import page.RegisterPage;
import helper.Utils;

@RunWith(JUnit4.class)
public class RegisterTest extends BaseTest {

        RegisterPage registerPage;
        Utils utils = new Utils();

        @Test
        public void registerTest() {
            registerPage = new RegisterPage(driver);
            registerPage.getRegisterPage();

            String email = "testing@"+ utils.getRandomNumberUntil(2000) +"testing.com";
            registerPage.register("Moni", "Holasz",email, "password", "password");

            registerPage.waitForConfirmationMessage();
            Assert.assertEquals(registerPage.getConfirmationMessage(),"Thank you for registering with Madison Island.");
        }
}
