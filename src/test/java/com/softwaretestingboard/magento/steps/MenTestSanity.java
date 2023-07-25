package com.softwaretestingboard.magento.steps;

import com.softwaretestingboard.magento.pages.MenPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class MenTestSanity {



    @When("I Mouse Hover on Men Menu")
    public void iMouseHoverOnMenMenu() {
        new MenPage().setMen();

    }

    @And("I Mouse Hover on Bottoms")
    public void iMouseHoverOnBottoms() {
        new MenPage().setBottom();
    }

    @And("I Click on Pants")
    public void iClickOnPants() {
        new MenPage().setPants();
    }

    @And("I Mouse Hover on product name ‘Cronus Yoga Pant’")
    public void iMouseHoverOnProductNameCronusYogaPant() {
        new MenPage().setYogaPant();
    }

    @And("I click on size {int}.")
    public void iClickOnSize(int arg0) {
        new MenPage().setSize();
    }

    @And("I click on colour Black")
    public void iClickOnColourBlack() {
        new MenPage(). setBlackColour();
    }

    @And("I click on ‘Add To Cart’ Button")
    public void iClickOnAddToCartButton() {
        new MenPage().clickOnAddToCart();
    }

    @And("I should Verify the text ‘You added Cronus Yoga Pant to your shopping cart.’")
    public void iShouldVerifyTheTextYouAddedCronusYogaPantToYourShoppingCart() {

        new MenPage(). verifyMessage();
    }

    @And("I Click on ‘shopping cart’ Link into message")
    public void iClickOnShoppingCartLinkIntoMessage() {
        new MenPage().clickOnShoppingCart();
    }


    @And("I Verify the text {string}")
    public void iVerifyTheText(String shoppingCart ) {
        Assert.assertEquals(new MenPage().verifyMessage1(),shoppingCart,"Shopping Cart");
    }

    @And("I Verify the product name {string}")
    public void iVerifyTheProductName(String name) {
        Assert.assertEquals(new MenPage().verifyMessage2(),name,"Cronus Yoga Pant");
    }

    @And("I Verify the product size {string}")
    public void iVerifyTheProductSize(String size) {
        Assert.assertEquals(new MenPage().verifyMessage3(),size,"32");
    }

    @And("I Verify the product colour {string}")
    public void iVerifyTheProductColour(String colour) {
        Assert.assertEquals(new MenPage().verifyMessage4(),colour,"Black" );
    }
}
