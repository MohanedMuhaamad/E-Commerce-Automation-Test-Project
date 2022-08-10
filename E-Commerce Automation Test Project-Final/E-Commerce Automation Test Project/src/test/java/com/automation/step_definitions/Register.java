package com.automation.step_definitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import com.automation.pages.Registration;

public class Register {
   //SoftAssert soft;
   static Faker faker = new Faker();
   public
   static String email = faker.name().firstName().toLowerCase()+"@domain.com" ;
   String pass = "P@ssw0rd";
   Registration registrationPage = Base.pagebase.registrationPage();

   @Given("user go to register page")
   public void go_to_register_page()  {

      registrationPage.go();
}

   @When("user enter a valid data")
   public void enter_a_valid_data() throws InterruptedException {
      registrationPage.fName(faker.name().firstName());
      registrationPage.lName(faker.name().lastName());
      registrationPage.email(email);
      registrationPage.password(pass);
      registrationPage.confirmPassword(pass);

   }

   @And("user press on register button")
   public void register_button()
   {
      registrationPage.btn();
   }

   @Then("user register to the system successfully")
   public void success_register()
   {
      String expectedResult = "Your registration completed";
      String actualResult = registrationPage.success();
      Assert.assertTrue(actualResult.contains(expectedResult),"confirm message");

   }
   @And("user logout")
   public void logout()
   {
      registrationPage.logout();
   }

}
