package com.helioteca.pages;

import com.helioteca.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage extends BasePage{
   public SearchPage(){
       PageFactory.initElements(Driver.getDriver(),this);
   }




   @FindBy(xpath = "//input[@type='search']")
    public WebElement searchBox;


   //
public   WebElement clickOnFile(String name){
   return Driver.getDriver().findElement(By.xpath("(//h3[@title='"+name+"'])[2]"));

}


    public  WebElement textOfFile (String fileName){
         return Driver.getDriver().findElement(By.xpath("(//h2[text()[normalize-space() ='"+fileName+"']])[last()]"));

    }


    @FindBy(xpath = "//div[@class='logo logo-icon']")
    public WebElement logoIconButton;






}
