package org.mizutest.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import java.util.concurrent.TimeUnit;

public class LandingPage extends BasePage{

    private By cartButtonLocator = By.xpath("/html/body/div[2]/div[3]/div/div[4]/nav/ul/li[5]/a/span");
    private By subheaderOverlayLocator = By.xpath("/html/body/div[5]");//Loginden sonraki boş alan tanımı
    public LandingPage(WebDriver driver) {
        super(driver);
    }
// Login sonrası boş alana tıklamak için metod
    public LandingPage clickSubheadOverlay(){
        click(subheaderOverlayLocator);
        return this;
    }
    //Login sonrası açılan sayfadaki assert
    public boolean cartButtonDisplayed(){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        return isDisplayed(cartButtonLocator);
    }

}
