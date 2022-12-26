package com.demoblaze.pages;

import com.demoblaze.utilities.BrowserUtils;
import com.demoblaze.utilities.ConfigurationReader;
import com.demoblaze.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(id = "loginusername")
    public WebElement username_loc;
    @FindBy(id = "loginpassword")
    public WebElement password_loc;
    @FindBy(css = "[onclick='logIn()']")
    public WebElement loginBtn_loc;


    public void login_mtd(){
       String username = ConfigurationReader.get("username");
       String password = ConfigurationReader.get("password");
       loginHomePage_loc.click();
       username_loc.sendKeys(username);
       password_loc.sendKeys(password);
       loginBtn_loc.click();
       BrowserUtils.waitFor(2);
    }

    public void login_mtd(String username, String password){
        loginHomePage_loc.click();
        username_loc.sendKeys(username);
        password_loc.sendKeys(password);
        loginBtn_loc.click();
        BrowserUtils.waitFor(2);
    }

    public void verifyNegativeLoginMessage(String expectedMessage){
        Alert alert= Driver.get().switchTo().alert();
        String actualMessage = alert.getText();

        Assert.assertEquals("negative login Message does NOT match",expectedMessage,actualMessage);
        System.out.println("expectedMessage = " + expectedMessage);
        System.out.println("actualMessage = " + actualMessage);
    }

}
