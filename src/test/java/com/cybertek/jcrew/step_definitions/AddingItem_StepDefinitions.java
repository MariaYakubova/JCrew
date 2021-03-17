package com.cybertek.jcrew.step_definitions;

import com.cybertek.jcrew.pages.JCrewHomePage;
import com.cybertek.jcrew.utilities.ConfigurationReader;
import com.cybertek.jcrew.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import javax.security.auth.login.Configuration;
import javax.swing.*;

public class AddingItem_StepDefinitions {
JCrewHomePage jcrewHomePage = new JCrewHomePage();

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
        Actions action = new Actions(Driver.getDriver());
        action.moveToElement(jcrewHomePage.womenButton);
//jcrewHomePage.womenButton.click();
    }
    @When("User  chooses Sweaters")
    public void user_chooses_sweaters() {
        Actions action = new Actions(Driver.getDriver());
        action.click(jcrewHomePage.sweatersButton);
        //jcrewHomePage.sweatersButton.click();
    }
    @When("User chooses an item")
    public void user_chooses_an_item() {

    }
    @When("User chooses color of item")
    public void user_chooses_color_of_item() {

    }
    @When("User chooses the size of item")
    public void user_chooses_the_size_of_item() {

    }
    @When("User chooses the quantity of item")
    public void user_chooses_the_quantity_of_item() {

    }
    @Then("User clicks Add To Bag button")
    public void user_clicks_add_to_bag_button() {

    }
    @Then("User clicks on Shopping Bag sign")
    public void user_clicks_on_shopping_bag_sign() {

    }

}
