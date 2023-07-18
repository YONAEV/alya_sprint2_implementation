package com.helioteca.pages;

import com.helioteca.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
   public SearchPage(){
       PageFactory.initElements(Driver.getDriver(),this);
   }


    @FindBy(xpath = "//span[@aria-label='Magnify icon']")
    public WebElement MagnifyIcon;

   @FindBy(xpath = "//input[@type='search']")
    public WebElement searchBox;








}
