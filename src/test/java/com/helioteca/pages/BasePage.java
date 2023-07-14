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

    /**
     * navigates user to the given Module page by clicking on the relevant module icon
     * @param moduleName
     */
    public void navigateToModule(String moduleName){
        String editedModuleName = moduleName.substring(0,1).toUpperCase()+moduleName.substring(1).toLowerCase();
        String locator = "//ul[@id='appmenu']//a[@aria-label='"+editedModuleName+"']//*[name()='svg']//*[name()='image' and contains(@class,'app-icon')]";

        WebElement module = Driver.getDriver().findElement(By.xpath(locator));
        module.click();
    }


    @FindBy(xpath = "//span[@aria-label='Magnify icon']//*[name()='svg']")
    public WebElement searchIcon;

    @FindBy(xpath = "//img[@title='Notifications']")
    public WebElement notificationsIcon;

    @FindBy(xpath = "//div[@class='icon-contacts menutoggle']")
    public WebElement contactsIcon;

    @FindBy(xpath = "//div[@class='avatardiv avatardiv-shown']//img")
    public WebElement userIcon;


}
