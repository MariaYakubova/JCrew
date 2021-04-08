package com.cybertek.jcrew.pages;

import com.cybertek.jcrew.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckTheShoppingBag {
    public CheckTheShoppingBag(){

        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath = "//li[@class='nc-nav__menu-tab nc-nav__bag nc-nav__list-item']")
    public WebElement shoppingBagSign;

    @FindBy(xpath = "//img[@alt='Short-sleeve sweater in textured stripe']")
    public WebElement shoppingBag;

}
