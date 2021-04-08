package com.cybertek.jcrew.step_definitions;

//import com.cybertek.jcrew.pages.ClickingTheSweaterButton;
import com.cybertek.jcrew.pages.*;
import com.cybertek.jcrew.utilities.ConfigurationReader;
import com.cybertek.jcrew.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AddingItem_StepDefinitions {

    JCrewHomePage jcrewHomePage = new JCrewHomePage();
    ChooseTheItem chooseTheItem = new ChooseTheItem();

    CheckTheShoppingBag checkTheShoppingBag = new CheckTheShoppingBag();
    ClosePopUpWindow closePopUpWindow = new ClosePopUpWindow();


    @Given("User is on the home page")
    public void user_is_on_the_home_page() {
        String url = ConfigurationReader.getProperty("JCrewUrl");
        Driver.getDriver().get(url);
    }


    @When("User clicks on the Woman")
    public void user_clicks_on_the_woman() {
        Actions builder = new Actions(Driver.getDriver());
        builder.moveToElement(jcrewHomePage.womenButton).perform();

    }

    @When("User  chooses Sweaters")
    public void user_chooses_sweaters() {


        JCrewHomePage.sweatersButton.click(); }

    @When("User chooses an item")
    public void user_chooses_an_item() {
    ChooseTheItem.itemButton.click();
    }

    @When("User chooses color of item")
    public void user_chooses_color_of_item() {
        chooseTheItem.colorButton.click();

    }

    @When("User chooses the size of item")
    public void user_chooses_the_size_of_item() {
        chooseTheItem.sizeButton.click();
    }

    @When("User chooses the quantity of item")
    public void user_chooses_the_quantity_of_item() {
        chooseTheItem.quantityDropdown.click();
        Select quantityDropdown = new Select(chooseTheItem.quantityDropdown);
        quantityDropdown.selectByValue("2");


    }

    @Then("User clicks Add To Bag button")
    public void user_clicks_add_to_bag_button() {
        chooseTheItem.addToBagButton.click();

    }

    @Then("User clicks keep shopping on Popup Window")
    public void userClicksKeepShoppingOnPopupWindow() throws InterruptedException {
        Thread.sleep(5000);
        try{
            closePopUpWindow.popUpWindow.click();
        }catch (Exception e ){
            e.printStackTrace();
        }

    }

        @Then("User clicks on Shopping Bag sign")
        public void user_clicks_on_shopping_bag_sign () {
            checkTheShoppingBag.shoppingBagSign.click();
            Assert.assertTrue(checkTheShoppingBag.shoppingBag.isDisplayed());



        }

    }


