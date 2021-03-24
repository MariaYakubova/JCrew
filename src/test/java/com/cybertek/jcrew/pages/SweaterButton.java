package com.cybertek.jcrew.pages;

import com.cybertek.jcrew.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SweaterButton {
    public SweaterButton(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath = "//a[@name='&lpos=nav_topnav>home>>women>sweaters']")
    public static WebElement sweatersButton;

}
