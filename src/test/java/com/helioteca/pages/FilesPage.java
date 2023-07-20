package com.helioteca.pages;

import com.helioteca.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FilesPage extends BasePage{

@FindBy(xpath = "//a[@class='button new']")
    public WebElement addButton;
@FindBy(xpath = "//span[@class='info']/span")
public List<WebElement> totalFileInfo;
@FindBy(xpath = "//input[@type='file']")//label[@class='menuitem']")
    public WebElement uploadFile;
@FindBy(xpath = "//a[@data-templatename='New folder']")
    public WebElement newFolder;
@FindBy(xpath = "//span[.='New text document']")
    public WebElement nextTextDocument;
@FindBy(partialLinkText = "Files")
    public WebElement filesBtn;
@FindBy(xpath = "//a[@class='name']") //table[@class='list-container has-controls']//tbody//a[@class='name']//span[@class='nametext'] ")
    public List<WebElement> listOfFiles;
@FindBy(xpath = "//input[contains(@id, 'input-folder')]")
    public WebElement folderNameField;
    @FindBy(xpath = "//input[@class='icon-confirm']")
    public WebElement folderNameArrowBtn;

  @FindBy(xpath = "//a[@class='action action-menu permanent']")
    public WebElement deleteBtn;
  @FindBy(xpath = "(//table[@class='list-container has-controls']//tbody//a[@class='name']//span[.='Talk'])[1]/following-sibling::span[2]//span[@class='hidden-visually']")
    public WebElement threeDot;

    public String threeDotLocator(String fileName){
        return "(//table[@class='list-container has-controls']//tbody//a[@class='name']//span[.='"+fileName+"'])[1]/following-sibling::span[2]";
    }

    public static int string_SumOfAllDigits(String str){
        int sum=0;
        for (int i = 0; i < str.length();i++) {
            if(str.charAt(i)>='0'&&str.charAt(i)<='9'){  //verify if character under index i is digit
                int j=i+1; String digit=""+str.charAt(i);  //helpful temporary variables: j - iterator for while loop, digit is a string for a number from our original string
                while(str.length()-1>j&&str.charAt(j)>='0'&&str.charAt(j)<='9') {//verifying if next character is also digit and making sure not to go outside of sting length
                    digit += str.charAt(j);//adding if next character is a digit to our number to make n-th digit
                    j++;i++;
                }

                sum+=Integer.parseInt(digit);//finding numeric value of our string

            }
        }
        return sum;
    }

}
