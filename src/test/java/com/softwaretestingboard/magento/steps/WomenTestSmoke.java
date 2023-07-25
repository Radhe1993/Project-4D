package com.softwaretestingboard.magento.steps;

import com.softwaretestingboard.magento.pages.WomenPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class WomenTestSmoke {

    @Given("I am on home page")
    public void iAmOnHomePage() {

    }

    @When("I Mouse Hover on Women Menu")
    public void iMouseHoverOnWomenMenu() {
        new WomenPage().setWomen ();
    }

    @And("I Mouse Hover on Tops")
    public void iMouseHoverOnTops() {
        new WomenPage().setTop ();
    }

    @And("I Click on Jackets")
    public void iClickOnJackets() {
        new WomenPage().clickOnJacket ();
    }

    @And("I Select Sort By filter “Product Name”")
    public void iSelectSortByFilterProductName() {
        new WomenPage().selectProductName ();
    }

    @And("I Verify the products name display inalphabetical order")
    public void iVerifyTheProductsNameDisplayInalphabeticalOrder()
    {
        new WomenPage().setJacketsNameListAfter ();

    }

    @And("I  Select Sort By filter “Price”")
    public void iSelectSortByFilterPrice()
    {
       new WomenPage().selectProductPrice ();
    }

    @And("I  Verify the products price display in Low to High")
    public void iVerifyTheProductsPriceDisplayInLowToHigh()
    {
       new WomenPage(). setJacketsPriceListAfter ();
    }
}
