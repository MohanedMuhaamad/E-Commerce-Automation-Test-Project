package com.automation.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import com.automation.pages.TagsPage;

import java.util.List;
import java.util.Random;

public class SelectTags {
    TagsPage tags = Base.pagebase.tagsPage();

    @Given("user navigate to tags page")
    public void tags_page(){
        Base.driver.navigate().to("https://demo.nopcommerce.com/producttag/all");
    }

    @Then("select random tags")
    public void select_tags(){

        List<WebElement> productElems = tags.select() ;
        int maxProducts = productElems.size();
        Random random = new Random();
        int randomProduct = random.nextInt(maxProducts);
        productElems.get(randomProduct).click();
    }
}