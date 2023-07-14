package com.helioteca.pages;




import com.helioteca.utilities.BrowserUtils;
import com.helioteca.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public WebElement elementById(String id){
        String id1 = id.substring(0,1).toUpperCase()+id.substring(1).toLowerCase();
        String locator = "//ul[@id='appmenu']//a[@aria-label='"+id1+"']//*[name()='svg']//*[name()='image' and contains(@class,'app-icon')]";

        return Driver.getDriver().findElement(By.xpath(locator));
    }

    @FindBy(xpath = "//ul[@id='appmenu']//a[@aria-label='Files']//*[name()='svg']//*[name()='image' and contains(@class,'app-icon')]")
    public WebElement files;

    @FindBy(xpath = "//ul[@id='appmenu']//a[@aria-label='Photos']//*[name()='svg']//*[name()='image' and contains(@class,'app-icon')]")
    public WebElement photos;

    @FindBy(xpath = "//ul[@id='appmenu']//a[@aria-label='Activity']//*[name()='svg']//*[name()='image' and contains(@class,'app-icon')]")
    public WebElement activity;

    @FindBy(xpath = "//ul[@id='appmenu']//a[@aria-label='Mail']//*[name()='svg']//*[name()='image' and contains(@class,'app-icon')]")
    public WebElement mail;

    @FindBy(xpath = "//ul[@id='appmenu']//a[@aria-label='Contacts']//*[name()='svg']//*[name()='image' and contains(@class,'app-icon')]")
    public WebElement contacts;

    @FindBy(xpath = "//ul[@id='appmenu']//a[@aria-label='Calendar']//*[name()='svg']//*[name()='image' and contains(@class,'app-icon')]")
    public WebElement calendar;

    @FindBy(xpath = "//ul[@id='appmenu']//a[@aria-label='Notes']//*[name()='svg']//*[name()='image' and contains(@class,'app-icon')]")
    public WebElement notes;

    @FindBy(xpath = "//ul[@id='appmenu']//a[@aria-label='Deck']//*[name()='svg']//*[name()='image' and contains(@class,'app-icon')]")
    public WebElement deck;

    @FindBy(xpath = "//ul[@id='appmenu']//a[@aria-label='Tasks']//*[name()='svg']//*[name()='image' and contains(@class,'app-icon')]")
    public WebElement tasks;



    @FindBy(xpath = "//span[@aria-label='Magnify icon']//*[name()='svg']")
    public WebElement searchIcon;

    @FindBy(xpath = "//img[@title='Notifications']")
    public WebElement notificationsIcon;

    @FindBy(xpath = "//div[@class='icon-contacts menutoggle']")
    public WebElement contactsIcon;

    @FindBy(xpath = "//div[@class='avatardiv avatardiv-shown']//img")
    public WebElement userIcon;


}
