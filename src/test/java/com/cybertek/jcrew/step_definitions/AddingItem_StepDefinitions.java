package com.cybertek.jcrew.step_definitions;

//import com.cybertek.jcrew.pages.ClickingTheSweaterButton;
import com.cybertek.jcrew.pages.JCrewHomePage;
import com.cybertek.jcrew.pages.SweaterButton;
import com.cybertek.jcrew.utilities.BrowserUtils;
import com.cybertek.jcrew.utilities.ConfigurationReader;
import com.cybertek.jcrew.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import sun.jvm.hotspot.utilities.soql.JSJavaScriptEngine;

import javax.security.auth.login.Configuration;
import javax.swing.*;
import java.util.List;

public class AddingItem_StepDefinitions {
    JCrewHomePage jcrewHomePage = new JCrewHomePage();
    SweaterButton sweaterButton = new SweaterButton();
    // DropdownsPage dropdownsPage = new DropdownsPage();

    //Select quantityDropdown = new Select(JCrewHomePage.quantityDropdown);

    @Given("User is on the home page")
    public void user_is_on_the_home_page() {
        String url = ConfigurationReader.getProperty("JCrewUrl");
        Driver.getDriver().get(url);
    }

    /*
        @When("User clicks on the menu")
        public void user_clicks_on_the_menu() {
        jcrewHomePage.menuButton.click();
        }

     */
    @When("User clicks on the Woman")
    public void user_clicks_on_the_woman() {
        Actions builder = new Actions(Driver.getDriver());
        //action.moveToElement(jcrewHomePage.womenButton);
        builder.moveToElement(jcrewHomePage.womenButton).perform();

//jcrewHomePage.womenButton.click();
    }

    @When("User  chooses Sweaters")
    public void user_chooses_sweaters() {

        //Actions builder = new Actions(Driver.getDriver());
        //builder.click(jcrewHomePage.sweatersButton).perform();
        SweaterButton.sweatersButton.click(); }

    @When("User chooses an item")
    public void user_chooses_an_item() {
        jcrewHomePage.itemButton.click();
    }

    @When("User chooses color of item")
    public void user_chooses_color_of_item() {
        jcrewHomePage.colorButton.click();
    }

    @When("User chooses the size of item")
    public void user_chooses_the_size_of_item() {
        jcrewHomePage.sizeButton.click();
    }

    @When("User chooses the quantity of item")
    public void user_chooses_the_quantity_of_item() {
        jcrewHomePage.quantityDropdown.click();
        Select quantityDropdown = new Select(jcrewHomePage.quantityDropdown);
        quantityDropdown.selectByValue("2");

        //List<String> actualTexts = BrowserUtils.getElementsText(quantityDropdown.getOptions());
        //Assert.assertTrue(expectedList.equals(actualTexts));

    }

    @Then("User clicks Add To Bag button")
    public void user_clicks_add_to_bag_button() {
        jcrewHomePage.addToBagButton.click();

    }

    @Then("User clicks keep shopping on Popup Window")
    public void userClicksKeepShoppingOnPopupWindow() throws InterruptedException {
        Thread.sleep(3000);
        jcrewHomePage.popUpWindow.click();


        //Thread.sleep(3000);
    }

        @Then("User clicks on Shopping Bag sign")
        public void user_clicks_on_shopping_bag_sign () {
            jcrewHomePage.shoppingBagSign.click();
            //Assert.assertTrue(expectedList.equals(actualTexts));



        }

    }


