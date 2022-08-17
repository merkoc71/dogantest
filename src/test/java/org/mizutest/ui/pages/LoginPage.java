package org.mizutest.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;


public class LoginPage extends BasePage{
    final String LOGIN_PAGE_URL = "https://www.mizu.com/en-mx/login";
    private By mailId = By.id("EmailLogin");
    private By passwordId = By.id("Password");
    private By signInButtonClassLocator = By.xpath("//button[text()='Sign In']");


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage getPage(){
        driver.get(LOGIN_PAGE_URL);
        return this;
    }
    public LoginPage setMail(String mail){
        setText(mailId, mail);
        return this;
    }
    public LoginPage setPassword(String password){
        setText(passwordId, password);
        return this;
    }

    public LandingPage clickSignIn(){
        click(signInButtonClassLocator);
        return new LandingPage(driver);
    }
}
