package com.helioteca.step_definitions;

import com.helioteca.pages.DeckPage;
import com.helioteca.utilities.BrowserUtils;
import com.helioteca.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class DeckStepDefs {

    DeckPage deckPage = new DeckPage();

    @And("the user navigates to {string} module page")
    public void userNavigatesToModulePage(String moduleName) {
        deckPage.navigateToModule(moduleName);
    }

    @When("the user clicks on deck menu button")
    public void theUserClicksOnDeckMenuButton() {
        deckPage.deckMenuButton.click();
    }

    @And("the user clicks on Add board button")
    public void theUserClicksOnAddBoardButton() {
        deckPage.addBoardButton.click();
    }

    @And("the user types in {string} in the Board name text field")
    public void theUserTypesInInTheBoardNameTextField(String text) {
        deckPage.BoardNameTextField.sendKeys(text);
    }

    @And("the user clicks on Submit Arrow Button in Board Menu")
    public void theUserClicksOnSubmitArrowButton() {
        deckPage.submitArrowButtonBoard.click();
    }

    @Then("newly created board {string} should be displayed under All boards")
    public void newlyCreatedBoardShouldBeDisplayedUnderAllBoards(String arg0) {
        Assert.assertTrue(deckPage.newlyCreatedBoard(arg0).isDisplayed());
    }


    @And("user clicks on board with a name {string}")
    public void userClicksOnBoardWithAName(String arg0) {
        deckPage.newlyCreatedBoard(arg0).click();
    }

    @And("user clicks on Add list button")
    public void userClicksOnAddListButton() {
        deckPage.addListButtonPlus.click();
    }

    @And("user types {string} in text field")
    public void userTypesInTextField(String arg0) {
        deckPage.listNameTextField.sendKeys(arg0);
        BrowserUtils.sleep(4);
    }

    @Then("user can see newly created list {string}")
    public void userCanSeeNewlyCreatedList(String arg0) {
        Assert.assertTrue(deckPage.newlyCreatedList(arg0).getText().trim().equals(arg0));
    }

    @And("user clicks on Add card button")
    public void userClicksOnAddCardButton() {
        deckPage.addCardButton.click();
    }

    @And("user types {string} in Card Name text field")
    public void userTypesInCardNameTextField(String arg0) {
        deckPage.cardNameTextField.sendKeys(arg0);
    }

    @And("user clicks submit arrow button on Card Menu")
    public void userClicksSubmitArrowButton() {
        deckPage.submitArrowButtonCard.click();
    }

    @Then("user can see {string} field on the left side")
    public void userCanSeeFieldOnTheLeftSide(String arg0) {
        Assert.assertTrue(deckPage.newlyCreatedCard.getText().equals(arg0));
    }

    @Then("user can see Details of New Card on the right side")
    public void userCanSeeDetailsOfNewCardOnTheRightSide() {
        Assert.assertTrue(deckPage.cardDetailsRightSide.isDisplayed());
    }

    @And("user clicks on the three dots menu")
    public void userClicksOnTheThreeDotsMenu() {
        deckPage.threeDotsCard.click();
    }

    @And("user clicks on Assign to me option")
    public void userClicksOnAssignToMeOption() {
        deckPage.assignToMeOption.click();
    }

    @Then("user profile icon should be displayed near the three dots icon")
    public void userProfileIconShouldBeDisplayedNearTheThreeDotsIcon() {
        Assert.assertTrue(deckPage.userProfileIconAssignToMe.isDisplayed());
    }


    @And("user clicks on addListButtonArrow")
    public void userClicksOnAddListButtonArrow() {
        BrowserUtils.waitForClickablility(deckPage.addListButtonArrow, 10);
        deckPage.addListButtonArrow.click();
    }



}