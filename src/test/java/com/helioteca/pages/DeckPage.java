package com.helioteca.pages;

import com.helioteca.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DeckPage extends BasePage {

    @FindBy(css = "a[class='app-navigation-toggle']")
    public WebElement deckMenuButton;

    @FindBy(css = "div[class='app-navigation-entry-icon icon-add']")
    public WebElement addBoardButton;

    @FindBy(css = "input[placeholder='Board name']")
    public WebElement BoardNameTextField;

    @FindBy(css = "input[class='icon-confirm']")
    public WebElement submitArrowButtonBoard;

    @FindBy(css = "input[class='icon-confirm']")
    public WebElement submitArrowButtonCard;

    /**
     * returns WebElement of last created board
     * @param boardName
     * @return
     */
    public WebElement getNewlyCreatedBoard(String boardName){
        return Driver.getDriver().findElement(By.xpath("(//span[@title='"+boardName+"'])[last()]"));
    }
    @FindBy(css = "button[class='action-item action-item--single icon-add undefined undefined has-tooltip']")
    public WebElement addListButtonPlus;

    @FindBy(css = "div[id='stack-add'] input[type='submit']")
    public WebElement addListButtonArrow;

    @FindBy(css = "div[id='stack-add'] input[id='new-stack-input-main']")
    public WebElement listNameTextField;

    /**
     * returns WebElement of newly created list
     * @param listName
     * @return WebElement
     */
    public WebElement getNewlyCreatedList(String listName){
        return Driver.getDriver().findElement(By.xpath("(//h3[text()[normalize-space() ='"+listName+"']])[last()]"));
    }

    //@FindBy(xpath = "(//button[@class='action-item action-item--single icon-add undefined undefined has-tooltip'])[2]")
    @FindBy(css = "div[class='stack__header'] button[rel='noreferrer noopener']")
    public WebElement addCardPlusButton;

    @FindBy(css = "input[id='new-stack-input-main']")
    public WebElement cardNameTextField;

    //first created card
    //@FindBy(css = "div[class='card-upper']>h3>span")
    //last created card
    @FindBy(xpath = "(//div[@class='card-upper']//h3//span)[last()]")
    public WebElement newlyCreatedCard;

    @FindBy(css = "span[class='app-sidebar-tabs__tab-icon icon-home']")
    public WebElement cardDetailsRightSide;

    @FindBy(xpath = "//div[@class='dragover']/..//button")
    public WebElement threeDotsCard;

    //@FindBy(xpath = "(//span[@class='action-button__text'])[5]")
    @FindBy(xpath = "//li[@class='action active']//button[@class='action-button focusable']")
    public WebElement assignToMeOption;

    @FindBy(css = "div[class='avatardiv popovermenu-wrapper has-tooltip']")
    public WebElement userProfileIconAssignToMe;
}
