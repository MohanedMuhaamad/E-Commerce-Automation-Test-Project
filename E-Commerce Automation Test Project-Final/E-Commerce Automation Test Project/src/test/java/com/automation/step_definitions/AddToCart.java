//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.automation.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import com.automation.pages.Cart;

public class AddToCart {
    Cart cart;

    public AddToCart() {
        this.cart = Base.pagebase.cartPage();
    }

    @Given("user can select a product")
    public void select_a_product() {
        Base.driver.navigate().to("https://demo.nopcommerce.com/apple-macbook-pro-13-inch");
    }

    @When("user can add product to shipping cart")
    public void add_product_to_cart() {
        this.cart.addProduct();
    }

    @And("product added to cart successfully")
    public void product_added_to_cart_successfully() {
        String expectedResult = "The product has been added to your shopping cart";
        String actualResult = this.cart.addedSuccessfully();
        Assert.assertTrue(actualResult.contains(expectedResult), "confirm message");
    }

    @Given("user open shopping cart")
    public void open_shopping_cart() {
        this.cart.open();
    }

    @When("User can change product quantity in shipping cart")
    public void change_product_quantity() {
        this.cart.changeQuantity();
    }

    @Then("User can delete product from shipping cart")
    public void delete_product() {
        this.cart.delete();
        String txt = "Your Shopping Cart is empty!";
        Assert.assertTrue(this.cart.assertT(txt), "assertion error");
    }
}
