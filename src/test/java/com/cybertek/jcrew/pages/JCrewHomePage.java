package com.cybertek.jcrew.pages;

import com.cybertek.jcrew.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;

public class JCrewHomePage {

    public JCrewHomePage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }
    //@FindBy(xpath = "//button[@class='nc-mobile-nav__button icon-btn icon-btn--large hamburger icon-btn--hamburger']")
    @FindBy(xpath = "//a[@name='&lpos=nav_topnav>home>>>women']")
    public WebElement womenButton;

   // @FindBy(xpath = "//a[@name='&lpos=nav_topnav>home>>women>sweaters']")
   // public static WebElement sweatersButton;

    @FindBy(xpath = "(//a[@class='product-tile__link'])[1]")
    public WebElement itemButton;

    @FindBy(xpath = "//img[@src='https://www.jcrew.com/s7-img-facade/AX561_BL8133_sw?$pdp_sw20$']")
    public WebElement colorButton;

    @FindBy(xpath = "//div[@aria-label='Medium']")
    //@FindBy(xpath = "//div[@class='js-product__size sizes-list__item sizes-list__item-medium btn--medium']")
    public WebElement sizeButton;

    @FindBy(xpath="//select[@id='product__quantity-selector']")
    public  WebElement quantityDropdown;

    @FindBy(xpath = "//button[@id='btn__add-to-bag-wide']")
    public WebElement addToBagButton;

    @FindBy(xpath = "//li[@class='nc-nav__menu-tab nc-nav__bag nc-nav__list-item']")
    public WebElement shoppingBagSign;

    @FindBy(xpath = "//button[@class='close_button-8664-button close_button-8664-button-d2 bluecoreCloseButton']")
    public WebElement popUpWindow;
    //@FindBy(linkText = "Women")
   // public WebElement womenButton;

   // driver.findElement(By.linkText("")); //--> this line will return me the TESLA link
    //@FindBy(linkText ="sweaters" )
   // public WebDriver sweatersButton;

}
