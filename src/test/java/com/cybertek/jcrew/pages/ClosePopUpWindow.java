package com.cybertek.jcrew.pages;

import com.cybertek.jcrew.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClosePopUpWindow {
 public ClosePopUpWindow(){
     PageFactory.initElements(Driver.getDriver(),this);

 }
    @FindBy(xpath = "//button[@class='close_button-8664-button close_button-8664-button-d2 bluecoreCloseButton']")
    public WebElement popUpWindow;
}
