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

    @FindBy(xpath = "//a[@name='&lpos=nav_topnav>home>>>women']")
    public WebElement womenButton;

    @FindBy(xpath = "//a[@name='&lpos=nav_topnav>home>>women>sweaters']")
    public static WebElement sweatersButton;


}
