package com.cybertek.jcrew.pages;

import com.cybertek.jcrew.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChooseTheItem {
    public ChooseTheItem() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "(//a[@class='product-tile__link'])[1]")
        public static WebElement itemButton;

    @FindBy(xpath = "//div[@aria-label='Medium']")
    public WebElement sizeButton;

    @FindBy(xpath = "//img[@src='https://www.jcrew.com/s7-img-facade/AX561_BL8133_sw?$pdp_sw20$']")
    public WebElement colorButton;

    @FindBy(xpath="//select[@id='product__quantity-selector']")
    public WebElement quantityDropdown;

    @FindBy(xpath = "//button[@id='btn__add-to-bag-wide']")
    public WebElement addToBagButton;
}
