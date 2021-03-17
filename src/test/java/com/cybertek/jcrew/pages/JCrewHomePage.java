package com.cybertek.jcrew.pages;

import com.cybertek.jcrew.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JCrewHomePage {

    public JCrewHomePage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }
    //@FindBy(xpath = "//button[@class='nc-mobile-nav__button icon-btn icon-btn--large hamburger icon-btn--hamburger']")
    @FindBy(xpath = "//a[@name='&lpos=nav_topnav>home>>>women']")
    public WebElement womenButton;

    @FindBy(xpath = "//a[@name='&lpos=nav_topnav>genderLanding>>women>sweaters']")
    public WebElement sweatersButton;
}
