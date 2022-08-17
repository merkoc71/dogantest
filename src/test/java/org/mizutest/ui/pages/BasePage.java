package org.mizutest.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class BasePage {
    protected WebDriver driver;
    public WebDriverWait wait;
    public Long WAIT = Long.valueOf(20);
    public BasePage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(WAIT));

    }
    //Locator görene kadar beklemek için method
    public void waitForLocator(By locator){
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }
//Locator bulmak için method
    public WebElement find(By locator){

        return driver.findElement(locator);
    }
//Click içn method
    public void click(By locator){
        waitForLocator(locator);
        find(locator).click();
    }

    public void setText(By locator, String text){
        waitForLocator(locator);
        find(locator).sendKeys(text);
    }
    //Sayfanın açıldığına dair doğrulama için metod
    public boolean isDisplayed(By locator){
        waitForLocator(locator);
        return find(locator).isDisplayed();
    }









}
