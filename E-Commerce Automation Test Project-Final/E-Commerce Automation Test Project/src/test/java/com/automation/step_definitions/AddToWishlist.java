package com.automation.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import com.automation.pages.Wishlist;

import java.util.List;
import java.util.Random;

public class AddToWishlist {
    Wishlist wishlist = Base.pagebase.wishlistPage();

    @Given("user could select a product")
        public void select_a_product(){

        List<WebElement> productElem = wishlist.selectProduct();
        int maxProducts = productElem.size();
        Random random = new Random();
        int randomProduct = random.nextInt(maxProducts);
        productElem.get(randomProduct).click();
 }

    @When("user can add product to Wishlist")
    public void add_product_to_Wishlist() {
        wishlist.btn();
    }

    @Then("product added to Wishlist successfully")
    public void product_added_to_Wishlist_successfully()
    {
        String expectedResult = "The product has been added to your wishlist";
        String actualResult = wishlist.addProductSuccessfully();
        Assert.assertTrue(actualResult.contains(expectedResult),"confirm message");
    }

}
