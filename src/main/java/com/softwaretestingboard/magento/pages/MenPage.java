package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenPage extends Utility
{
    private static final Logger log = LogManager.getLogger(MenPage.class.getName());

    public MenPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//ul[@id='ui-id-2']//span[text()='Men']")
    WebElement men;

    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-18']")
    WebElement bottom;

    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-23']//span[contains(text(),'Pants')]")
    WebElement pants;

    @CacheLookup
    @FindBy(xpath = "//body/div[1]/main[1]/div[3]/div[1]/div[3]/ol[1]/li[1]/div[1]/a[1]/span[1]/span[1]/img[1]")
    WebElement yogaPant;

    @CacheLookup
    @FindBy(xpath = "//div[@id='option-label-size-143-item-175']")
    WebElement size;

    @CacheLookup
    @FindBy(xpath = "//div[@id='option-label-color-93-item-49']")
    WebElement blackColour;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Add to Cart')]")
    WebElement addToCart;

    @CacheLookup
    @FindBy(xpath = "//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
    WebElement message;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='shopping cart']")
    WebElement shoppingCart;

    @CacheLookup
    @FindBy(xpath = "//span[@class='base']")
    WebElement message1;

    @CacheLookup
    @FindBy(xpath = "//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']")
    WebElement productName;

    @CacheLookup
    @FindBy(xpath = "//dd[contains(text(),'32')]")
    WebElement productSize;

    @CacheLookup
    @FindBy(xpath = "//dd[contains(text(),'Black')]")
    WebElement productColour;


    //By men = By.xpath("//ul[@id='ui-id-2']//span[text()='Men']");
    //By bottom = By.xpath("//a[@id='ui-id-18']");
    // By pants = By.xpath("//a[@id='ui-id-23']//span[contains(text(),'Pants')]");
    // By yogaPant = By.xpath("//body/div[1]/main[1]/div[3]/div[1]/div[3]/ol[1]/li[1]/div[1]/a[1]/span[1]/span[1]/img[1]");
    //By size = By.cssSelector("#option-label-size-143-item-175");
    // By blackColour = By.xpath("//div[@id='option-label-color-93-item-49']");
    //  By addToCart = By.xpath("//span[contains(text(),'Add to Cart')]");
    //  By message = By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");
    // By shoppingCart = By.xpath("//a[normalize-space()='shopping cart']");
    //By message1 = By.xpath("//span[@class='base']");
    // By productName = By.xpath("//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']");
    //By productSize = By.xpath("//dd[contains(text(),'32')]");
    //By productColour = By.xpath("//dd[contains(text(),'Black')]");


    public void setMen()
    {
        mouseHoverToElement(men);
        log.info("mouse hover : " + men.toString());

    }
    public void setBottom()
    {
        mouseHoverToElement(bottom);
        log.info("mouse hover : " + bottom.toString());

    }
    public void setPants()
    {
        clickOnElement(pants);
        log.info("click on element : " + pants.toString());

    }
    public void setYogaPant()
    {
        mouseHoverToElementAndClick(yogaPant);
        log.info("mouse hover : " + yogaPant.toString());
    }
    public void setSize()
    {
        clickOnElement(size);
        log.info("click on element : " + size.toString());

    }

    public void setBlackColour()
    {
        clickOnElement(blackColour);
        log.info("click on element : " + blackColour.toString());

    }

    public void clickOnAddToCart()
    {
        clickOnElement(addToCart);
        log.info("click on element : " + addToCart.toString());

    }
    public String verifyMessage()
    {

        log.info("get text : " + message.toString());
       return getTextFromElement(message);
    }
    public void clickOnShoppingCart()
    {
        clickOnElement(shoppingCart);
        log.info("click on element : " + shoppingCart.toString());

    }
    public String verifyMessage1()
    {
        log.info("get text : " + message1.toString());
        return getTextFromElement(message1);
    }
    public String verifyMessage2()
    {
        log.info("get text : " + productName.toString());
       return getTextFromElement(productName);
    }
    public String  verifyMessage3()
    {
        log.info("get text : " + productSize.toString());
        return getTextFromElement(productSize);
    }
    public String  verifyMessage4()
    {
        log.info("get text : " + productColour.toString());
      return   getTextFromElement(productColour);
    }

}

