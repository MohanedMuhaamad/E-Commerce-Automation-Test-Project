package com.automation.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Search {

    com.automation.pages.Search searchPage = Base.pagebase.searchPage();

    @When("user clicks on search field")
    public void clicks_on_search_field()
    {
        searchPage.clickField();
    }

    @And("user search with name of product")
    public void search_with_product_name()
    {
        searchPage.typing();
        searchPage.searchBtn();
    }

    @Then("user could find relative results")
    public void find_relative_results()
    {    int count = Base.driver.findElements(By.cssSelector("h2[class=\"product-title\"] a")).size();

        Assert.assertTrue(searchPage.result() > 0);
        for (int x = 0; x < count ; x++) {
            Assert.assertTrue(searchPage.assertT());
        }
    }

    @Given ("user choose advanced search")
    public void advanced_search()
    {
        searchPage.advanced_search();
    }

    @When("user choose specific category")
    public void choose_category()
    {   WebElement el = searchPage.choose_category();
        Select sel = new Select(el);
        sel.selectByIndex(3);
    }

    @Then("user choose manufacturer")
    public void choose_manufacturer()
    {   WebElement el = searchPage.choose_manufacturer();
        Select sel = new Select(el);
        sel.selectByIndex(2);
    }
    @And("user click on search button")
    public void click_on_search_button() {
        searchPage.advanceBtn();
    }

}
