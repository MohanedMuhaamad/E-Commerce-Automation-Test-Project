package com.automation.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import com.automation.pages.Currencies;

public class ChangeCurrency {
    Currencies currencies = Base.pagebase.currenciesPage();

    @When("user click on currencies list")
    public void currencies_list()  {
        currencies.go();
    }

    @Then("user change the currency")
    public void change_currency() throws InterruptedException{

        WebElement el = currencies.change();
        Select sel = new Select(el);

        WebElement first = sel.getFirstSelectedOption();
        String currentCurrency = first.getText();
        System.out.println("Current Currency is : " + currentCurrency );

        if (currentCurrency.contains("US Dollar"))
            sel.selectByVisibleText("Euro");

        else if (currentCurrency.contains ("Euro"))
            sel.selectByVisibleText("US Dollar");


    }
    @And("currency changed successfully")
    public void currenychanged(){
        String test = currencies.changedCurrency();
        Assert.assertTrue(test.contains("€"),"Incorrect currency");
    }


}
