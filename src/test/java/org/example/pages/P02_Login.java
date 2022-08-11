package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P02_Login {
    public P02_Login(WebDriver driver){
        PageFactory.initElements(Hooks.driver,this);
    }
    @FindBy(className = "ico-login")
    public WebElement loginBtn;
    @FindBy(name = "Email")
    public WebElement emailFl;
    @FindBy(id = "Password")
    public WebElement passwordFl;
    @FindBy(css = "div>button[type=\"submit\"]")
    public WebElement login;
    @FindBy(className = "ico-account")
    public WebElement myAccountBtn;
   @FindBy(xpath = "/html/body/div[6]/div[3]/div/div[1]/div/div[1]")
    public WebElement myAccount;
   @FindBy(className = "message-error")
    public WebElement failsText;

}
