package com.helioteca.step_definitions;

import com.helioteca.pages.LoginPage;
import com.helioteca.pages.SearchPage;
import com.helioteca.pages.SidePage;
import com.helioteca.utilities.BrowserUtils;
import com.helioteca.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.ro.Si;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class SearchStepDefs {

LoginPage loginPage = new LoginPage();

SearchPage searchPage = new SearchPage();

    @Given("the user is already on the Dashboard page")
    public void the_user_is_already_on_the_dashboard_page() {

        Driver.getDriver().get("https://qa.helioteca.com/");
loginPage.login("Employee35","Employee123");

    }


    @When("the user clicks the magnifying glass icon")
    public void the_user_clicks_the_magnifying_glass_icon() {

        searchPage.MagnifyIcon.click();
    }



    @Then("the user enters {string} in the search input field inside any Module")
    public void the_user_enters_in_the_search_input_field_inside_any_module(String fileName) {
        BrowserUtils.waitFor(5);
         searchPage.searchBox.sendKeys(fileName);

        searchPage.searchBox.sendKeys(Keys.ENTER);
        BrowserUtils.waitFor(5);
    }



    // https://qa.helioteca.com/index.php/apps/files/?dir=/&fileid=22529

    //
/*
    SidePage sidePage = new SidePage();
    @Then("the user should see the {string} details side page")
    public void the_user_should_see_the_details_side_page(String nameOfFile) {

sidePage.sideOfPage.isDisplayed();
        //Assert.assertTrue(sidePage.contains(nameOfFile));


    }


 */
    }










