package com.softwaretestingboard.magento.steps;

import com.softwaretestingboard.magento.pages.GearPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class GearTestRegression {

    private String qty;

    @When("I Mouse Hover on Gear Menu")
    public void iMouseHoverOnGearMenu() {
        new GearPage().setGear();
    }

    @And("I Click on Bags")
    public void iClickOnBags() {
        new GearPage().setBag();
    }

    @And("I Click on Product Name ‘Overnight Duffle’")
    public void iClickOnProductNameOvernightDuffle() {
        new GearPage().clickOnProduct();
    }

    @And("I Verify the text ‘Overnight Duffle’")
    public void iVerifyTheTextOvernightDuffle(String text)
    {
        Assert.assertEquals(new GearPage().getText(),text,"Overnight Duffle");
    }


    @And("I Change Qty {string}")
    public void iChangeQty(String qty1) {
        new GearPage().setProductQty( qty1);
    }


    @And("I Click on ‘Add to Cart’ Button")
    public void iClickOnAddToCartButton() {
        new GearPage().clickOnAddToCart();
    }

    @And("I Verify the texts {string}")
    public void iVerifyTheTexts(String text1) {
        Assert.assertEquals(new GearPage().getText1(),text1,"You added Overnight Duffle to your shopping cart.");
    }

    @And("I click on ‘shopping cart’ Link into message")
    public void iClickOnShoppingCartLinkIntoMessage() {
      new GearPage().clickOnShoppingCart();
    }



    @And("I Verify the product price {string}")
    public void iVerifyTheProductPrice(String price) {
        Assert.assertEquals(new GearPage(). veirfyProductPrice(),price,"$135.00");
    }

    @And("I change quantity {string}")
    public void iChangeQuantity(String qty2) {
        new GearPage().changeQty( qty2);
    }



    @And("I set Update Cart")
    public void iSetUpdateCart() {
        new GearPage().setUpdateCart();
    }

    @And("I verify ProductPrice")
    public void iVerifyProductPrice() {
        new GearPage().verifyProductPrice();
    }


}
