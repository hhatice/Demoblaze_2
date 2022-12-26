package com.demoblaze.step_definitions;

import com.demoblaze.pages.CartPage;
import com.demoblaze.pages.ProductPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Purchase_stepDefs {
    ProductPage productPage=new ProductPage();
    CartPage cartPage=new CartPage();
    @When("The user adds {string} to cart from {string}")
    public void the_user_adds_to_cart_from(String product, String  category) {
        productPage.addproduct_mtd(product, category);
    }
    @When("The user removs {string} from cart")
    public void the_user_removs_from_cart(String product) {
        cartPage.removeProduct_mtd(product);
    }
    @When("The user places order and capture and log amount")
    public void the_user_places_order_and_capture_and_log_amount() {
        cartPage.finishPurchase_logAmount_mtd();
    }
    @Then("The user verifies purchase amount equals {int}")
    public void the_user_verifies_purchase_amount_equals(Integer expectedAmount) {
        cartPage.verifyPurchaseAmount_mtd(expectedAmount);
    }

}
