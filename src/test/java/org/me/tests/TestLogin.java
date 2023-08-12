package org.me.tests;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.me.base.TestBase;
import org.me.pages.DashboardPage;
import org.me.pages.LoginPage;
import org.me.utilities.PropertyReader;
import static org.assertj.core.api.Assertions.*;


public class TestLogin extends TestBase {

    @Test
    @Disabled
    public void testingLoginToVWO(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openLoginPage();
        loginPage.loginToVWO();
    }
    @Test

    public void verifyLoggedUser(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openLoginPage();
        loginPage.loginToVWO();
        var dashboardPage = new DashboardPage(driver);
        assertThat(dashboardPage.loggedInUserName()).isEqualTo(PropertyReader.readItem("expectedusername"));

    }


}

