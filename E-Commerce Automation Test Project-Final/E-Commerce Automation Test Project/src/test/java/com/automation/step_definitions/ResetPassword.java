package com.automation.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import com.automation.pages.MyAccount;

public class ResetPassword {
    static Register R = new Register();
    MyAccount myAccountPage = Base.pagebase.myAccountPage();

    @Given("user go to account page")
    public void go_to_account_page()  {
        myAccountPage.go();
    }

    @And("user choose change password")
    public void choose_change_password()  {
    myAccountPage.changePass();
    }

    @When ("user enter new password")
    public void enter_a_valid_data() {

        myAccountPage.old(R.pass);
        myAccountPage.newPass();
        myAccountPage.confirm();
    }

    @And("user press on change password button")
    public void register_button()
    {
        myAccountPage.btn();
    }

    @Then("user changed password successfully")
    public void success_register() {
        String expectedResult = "Password was changed";
        String actualResult = myAccountPage.asrt();
        Assert.assertTrue(actualResult.contains(expectedResult), "change password error");
    }
    }
