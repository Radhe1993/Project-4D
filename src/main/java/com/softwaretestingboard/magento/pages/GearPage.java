package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GearPage extends Utility {

    private static final Logger log = LogManager.getLogger(GearPage.class.getName());

    public GearPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-6']//span[@class='ui-menu-icon ui-icon ui-icon-carat-1-e']")
    WebElement gear;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Bags']")
    WebElement bag;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Overnight Duffle']")
    WebElement product;

    @CacheLookup
    @FindBy(xpath = "//span[@class='base']")
    WebElement text;

    @CacheLookup
    @FindBy(xpath = "//input[@id='qty']")
    WebElement qty;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Add to Cart')]")
    WebElement addToCart;

    @CacheLookup
    @FindBy(xpath = "//body/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]")
    WebElement text1;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='shopping cart']")
    WebElement shoppingCart;


    @CacheLookup
    @FindBy(xpath = "/html[1]/body[1]/div[1]/main[1]/div[3]/div[1]/div[2]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/div[1]/label[1]/input[1]")
    WebElement productQty;

    @CacheLookup
    @FindBy(xpath = "//tbody/tr[1]/td[4]/span[1]/span[1]/span[1]")
    WebElement productPrice;

    @CacheLookup
    @FindBy(xpath = "(//input[@class='input-text qty'])[1]")
    WebElement changeQty;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Update Shopping Cart')]")
    WebElement updateCart;

    @CacheLookup
    @FindBy(xpath = "//tbody/tr[1]/td[4]/span[1]/span[1]/span[1]")
    WebElement newPrice;

    //By gear = By.xpath("//a[@id='ui-id-6']//span[@class='ui-menu-icon ui-icon ui-icon-carat-1-e']");
    // By bag = By.xpath("//span[normalize-space()='Bags']");
    // By product = By.xpath("//a[normalize-space()='Overnight Duffle']");
    //By text = By.xpath("//span[@class='base']");
    // By qty = By.xpath("//input[@id='qty']");
    // By addToCart = By.xpath("//button[@id='product-addtocart-button']");
    // By text1 = By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");
    // By shoppingCart = By.xpath("//a[normalize-space()='shopping cart']");
    //By productName = By.xpath("//body[1]/div[1]/main[1]/div[3]/div[1]/div[2]/form[1]/div[1]/table[1]/tbody[2]/tr[1]/td[1]/div[1]/strong[1]/a[1]");
    // By productQty = By.xpath("//input[@title='Qty']");
    // By productPrice = By.xpath("//span[@class='cart-price']//span)[2]");
    // By changeQty = By.xpath("(//input[@class='input-text qty'])[1]");
    // By updateCart = By.xpath("//span[contains(text(),'Update Shopping Cart')]");
    //By newPrice = By.xpath("//span[@class='cart-price']//span)[2]");

    //userShouldAddProductSuccessFullyTo ShoppingCart

    public void setGear() {
        //* Mouse Hover on Gear Menu
        mouseHoverToElement(gear);
        log.info("mouse hover : " + gear.toString());

    }

    public void setBag() {
        //* Click on Bags
        clickOnElement(bag);
        log.info("click on element : " + bag.toString());

    }

    public void clickOnProduct() {
        //* Click on Product Name ‘Overnight Duffle
        clickOnElement(product);
        log.info("click on element : " + product.toString());

    }

    public String getText() {
        //* Verify the text ‘Overnight Duffle
        log.info("click on element : " + text.toString());
        return getTextFromElement(text);

    }

    public void setProductQty(String qty1) {
        //* Change Qty 3

        remove(qty);
        sendTextToElement(qty, qty1);
        log.info("Send Text : " + qty.toString());

    }

    public void clickOnAddToCart() {
        //* Click on ‘Add to Cart’ Button
        clickOnElement(addToCart);
        log.info("click on element : " + addToCart.toString());

    }

    public String  getText1() {
        //* Verify the text
        log.info("get Text : " + text1.toString());
       return getTextFromElement(text1);
    }

    public void clickOnShoppingCart() {
        //* Click on ‘shopping cart’ Link into
        clickOnElement(shoppingCart);
        log.info("click on element : " + shoppingCart.toString());


    }

    public String  verifyProductQty() {
        //* Verify the Qty is ‘3’
        log.info("get text : " + productQty.toString());
        return  getTextFromElement(productQty);
    }

    public String  veirfyProductPrice() {
        //* Verify the product price ‘$135.00’
        log.info("get text : " + productPrice.toString());
       return  getTextFromElement(productPrice);
    }

    public void changeQty(String qty2) {
        //Change Qty to ‘5’
        log.info("change qty : " + changeQty.toString());
        remove(changeQty);
        sendTextToElement(changeQty, qty2);


    }

    public void setUpdateCart() {
        //Click on ‘Update Shopping Cart’ button
        clickOnElement(updateCart);
        log.info("click on element : " +updateCart.toString());

    }

    public String verifyProductPrice() {
        //Verify the product price ‘$225.00’
        log.info("get text : " + newPrice.toString());
       return getTextFromElement(newPrice);

    }
}
