package org.me.pages;

import org.me.base.BasePage;
import org.me.utilities.PropertyReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage extends BasePage {

    //WebDriver driver;

    public LoginPage(WebDriver driver){
        super(driver);
        this.driver = driver;
    }

    By userName = By.id("login-username");
    By password = By.id("login-password");
    By signButton = By.id("js-login-btn");
    By signInButtonText = By.xpath("//span[@data-qa='ezazsuguuy']");

    public void openLoginPage() {
        goToUrl("url");
    }

    public void loginToVWO(){
        writeText(userName, PropertyReader.readItem("username"));
        writeText(password, PropertyReader.readItem("password"));
        click(signButton);
    }

    public String signInText(){
        String e = driver.findElement(By.xpath("//span[@data-qa='ezazsuguuy']")).getText();
        return e;
    }
    public DashboardPage afterLogin(){
        return new DashboardPage(driver);
    }


}

