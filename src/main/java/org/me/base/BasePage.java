package org.me.base;

import org.me.utilities.PropertyReader;
import org.me.utilities.WaitForHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class BasePage {


    protected WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver = driver;
    }

    public void goToUrl(String url){
        driver.get(PropertyReader.readItem("url"));
    }

    public void waitForElementToAppear(By elementLocation){
        new WaitForHelper(driver).presenceOfElement(elementLocation);

    }
    public void writeText(By elementLocation, String text){
        driver.findElement(elementLocation).clear();
        driver.findElement(elementLocation).sendKeys(text);

    }
    public void waitForLoading(){
        new WaitForHelper(driver).implicitWait();
    }

    public void click(By elementLocation){
        driver.findElement(elementLocation).click();
    }

    public void moveToElement(By elementLocation){
        new Actions(driver).moveToElement(driver.findElement(elementLocation)).build().perform();

    }

    public void waitForClickable(By elementidentifier){
        new WaitForHelper((driver)).elementToBeClickable(elementidentifier);
    }





}
