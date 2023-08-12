package org.me.tests;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.me.base.TestBase;
import org.me.pages.DashboardPage;
import org.me.pages.LoginPage;

public class TestDashboard extends TestBase {


        @Test
        @Disabled
        public void atestingLoginToVWO(){
            LoginPage loginPage = new LoginPage(driver);
            loginPage.openLoginPage();
            loginPage.loginToVWO();
        }
        @Test

        public void logoutOfVWO(){
            LoginPage loginPage = new LoginPage(driver);
            loginPage.openLoginPage();
            loginPage.loginToVWO();
            var dashboardPage = new DashboardPage(driver);
            dashboardPage.Logout();

        }

    }

