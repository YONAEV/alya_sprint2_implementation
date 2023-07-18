package com.helioteca.pages;

import com.helioteca.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeckPage extends BasePage {

    @FindBy(xpath = "//a[@class='app-navigation-toggle']")
    public WebElement deckMenuButton;

    @FindBy(xpath = "//div[@class='app-navigation-entry-icon icon-add']")
    public WebElement addBoardButton;

    @FindBy(xpath = " //input[@placeholder='Board name']")
    public WebElement BoardNameTextField;

    @FindBy(xpath = "//input[@class='icon-confirm']")
    public WebElement submitArrowButtonBoard;

    @FindBy(xpath = "//input[@class='icon-confirm']")
    public WebElement submitArrowButtonCard;

    public WebElement newlyCreatedBoard(String name){
        return Driver.getDriver().findElement(By.xpath("(//span[@title='"+name+"'])[last()]"));
    }
    @FindBy(xpath = "//button[@class='action-item action-item--single icon-add undefined undefined has-tooltip']")
    public WebElement addListButtonPlus;

    @FindBy(xpath = "//div[@id='stack-add']//input[@type='submit']")
    public WebElement addListButtonArrow;

    @FindBy(xpath = "//div[@id='stack-add']//input[@id='new-stack-input-main']")
    public WebElement listNameTextField;



    public WebElement newlyCreatedList(String name){
        return Driver.getDriver().findElement(By.xpath("//h3[text()[normalize-space() ='"+name+"']]"));
    }

    @FindBy(xpath = "/html[1]/body[1]/div[3]/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/button[1]")
    public WebElement addCardButton;

    @FindBy(xpath = "//input[@id='new-stack-input-main']")
    public WebElement cardNameTextField;


    @FindBy(xpath = "//div[@class='card-upper']//h3//span")
    public WebElement newlyCreatedCard;

    @FindBy(xpath = "//span[@class='app-sidebar-tabs__tab-icon icon-home']")
    public WebElement cardDetailsRightSide;

    @FindBy(xpath = "//div[@class='dragover']/..//button")
    public WebElement threeDotsCard;

    @FindBy(xpath = "(//span[@class='action-button__text'])[5]")
    public WebElement assignToMeOption;

    @FindBy(xpath = "/html[1]/body[1]/div[3]/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/img[1]")
    public WebElement userProfileIconAssignToMe;

}
