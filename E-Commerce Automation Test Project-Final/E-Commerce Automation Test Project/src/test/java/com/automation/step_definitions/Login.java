package com.automation.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import com.automation.pages.LoginPage;

public class Login {

    static Register R = new Register();

    LoginPage loginPage = Base.pagebase.loginpage();
    @Given("user go to login page")
    public void go_to_login_page() throws InterruptedException {

     loginPage.go();
    }

    @When("user login with valid email and password")
    public void valid_username_password( )
    {
        loginPage.usernamePassword(R.email,R.pass);
    }

    @And("user press on login button")
    public void login_button()
    {
        loginPage.loginbtn();
    }

    @Then("user login to the system successfully")
    public void success_login()
    {
        Assert.assertTrue( loginPage.loginSuccess());

    }

    @When("^click on follow us \"([^\"]*)\"$")
    public void clickFollowUstest(String locator)
    {
        loginPage.followUs(locator);

    }
    @Then("^\"([^\"]*)\" opened successfully$")
    public void navigatedSuccessfully( String URL){
        loginPage.navigatedSuccssfully();
        String actualURL = loginPage.getCurrentURL();
        Assert.assertEquals(actualURL,URL,"InCorrect");
    }


    @After
    public static void sleepDriver() throws InterruptedException {
        Thread.sleep(4000);
    }
}
