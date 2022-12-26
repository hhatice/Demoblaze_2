package com.demoblaze.pages;

import com.demoblaze.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(id = "login2")
    public WebElement loginHomePage_loc;

    @FindBy(xpath = "(//a[@class='nav-link'])[1]") //  //a[text()='Home ']
    public WebElement homeLink_loc;

    @FindBy(xpath = "//a[text()='Cart']")
    public WebElement Cart_loc;

}
