package testrunner;

import config.Setup;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.LoginPage;

public class DashboardTestRunner extends Setup {
@BeforeTest
    public void login(){
        LoginPage loginPage=new LoginPage(driver);
        loginPage.doLogin("admin","admin123");
    }
@Test(priority = 2)
    public void createUser(){
        DashboardPage dashboardPage =new DashboardPage(driver);
        dashboardPage.createUser("test","user","testuser100","1234");

    }



}
