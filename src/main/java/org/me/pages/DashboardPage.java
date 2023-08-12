package org.me.pages;

import org.me.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage extends BasePage {


    public DashboardPage(WebDriver driver){
        super(driver);
        this.driver = driver;
    }

    By userNameOnDashboard = By.cssSelector("[data-qa=\"lufexuloga\"]");
    By accountSettings = By.cssSelector("vwo-menu[menu-api='accountDropdownApi'] vwo-transclude[class='menu-activator js-menu-activator']");
    By logoutButton = By.xpath("//li[@no-async-loader='true']");

    public String loggedInUserName(){
        waitForElementToAppear(userNameOnDashboard);
        return driver.findElement(userNameOnDashboard).getText();
    }
    public void Logout(){
        waitForClickable(accountSettings);
        click(accountSettings);
        waitForClickable(logoutButton);
        click(logoutButton);
    }



}
