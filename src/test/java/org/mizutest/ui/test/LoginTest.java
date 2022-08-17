package org.mizutest.ui.test;

import org.junit.Assert;
import org.mizutest.ui.DataProvider.DataProvider;
import org.mizutest.ui.driver.Base;
import org.mizutest.ui.pages.LandingPage;
import org.mizutest.ui.pages.LoginPage;
import org.testng.annotations.Test;

public class LoginTest extends Base {
    LoginPage loginPage;
    LandingPage landingPage;
    @Test(dataProvider = "data-provider", dataProviderClass = DataProvider.class)
    public void loginTestWithValidCred(String userName, String password, boolean assertionResult) throws InterruptedException {
        loginPage = new LoginPage(driver);
        landingPage = new LandingPage(driver);
        loginPage
                .getPage()
                .setMail(userName)
                .setPassword(password)
                .clickSignIn()
                .clickSubheadOverlay();
        Assert.assertTrue(landingPage.cartButtonDisplayed());
        Assert.assertEquals("not found", landingPage.cartButtonDisplayed(), assertionResult);
    }

}
