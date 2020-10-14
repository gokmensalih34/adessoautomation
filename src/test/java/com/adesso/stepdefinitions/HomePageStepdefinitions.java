package com.adesso.stepdefinitions;

import com.adesso.pages.Automobil;
import com.adesso.pages.BasePage;
import com.adesso.pages.HomePage;
import com.adesso.utilities.BrowserUtils;
import com.adesso.utilities.ConfigurationReader;
import com.adesso.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class HomePageStepdefinitions {

    @Given("the user access adesso homepage")
    public void the_user_access_adesso_homepage() {

        Driver.get().get(ConfigurationReader.get("url_adesso"));
        Driver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Then("the page title is {string}")
    public void the_page_title_is(String expectedTitel) {

        String actualTitel = Driver.get().getTitle();
        System.out.println(actualTitel);

        Assert.assertEquals(actualTitel,expectedTitel);

    }

    @Then("the logo is displayed")
    public void the_logo_is_displayed() {

        System.out.println("Logo = " + new HomePage().adussoLogo.getText());
        Assert.assertTrue(new HomePage().adussoLogo.isDisplayed());

    }

    @When("the user clicks {string}")
    public void the_user_clicks(String clickedTab) {

        if(clickedTab.equals("entdecken")){
            new HomePage().entdecken.click();
        }

        if(clickedTab.equals("Automobil")){

            BrowserUtils.waitFor(1);
            new HomePage().entdecken.click();
            BrowserUtils.waitFor(1);
            new HomePage().branchen.click();
            BrowserUtils.waitFor(1);
            new HomePage().automobil.click();
        }


    }

//    @Then("the user can see the following")
//    public void the_user_can_see_the_following(List<String> expectedAdussoEntdeckenElements) {
//
//        BrowserUtils.waitFor(1);
//        List<String> actualAdussoEntdeckenElements = BrowserUtils.getElementsText(new HomePage().adessoEntdecken);
//
//        System.out.println(actualAdussoEntdeckenElements);
//
//        Assert.assertEquals(actualAdussoEntdeckenElements, expectedAdussoEntdeckenElements);
//    }

    @Then("the user can see the following under {string}")
    public void the_user_can_see_the_following_under(String enteredTab, List<String> expectedWebElements) {

        if (enteredTab.equals("entdecken")) {
            BrowserUtils.waitFor(1);
            List<String> actualAdussoEntdeckenElements = BrowserUtils.getElementsText(new HomePage().adessoEntdecken);

            System.out.println(actualAdussoEntdeckenElements);

            Assert.assertEquals(actualAdussoEntdeckenElements, expectedWebElements);
        }

        if (enteredTab.equals("Automobil")) {

            BrowserUtils.waitFor(1);
            List<String> actualAutoElements = BrowserUtils.getElementsText(new Automobil().automobilTabList);
            BrowserUtils.waitFor(1);

            System.out.println(actualAutoElements);


            Assert.assertEquals(actualAutoElements, expectedWebElements);
        }
    }



}
