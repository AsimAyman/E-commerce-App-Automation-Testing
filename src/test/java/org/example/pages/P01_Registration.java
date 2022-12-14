package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P01_Registration {
    public P01_Registration(){
        PageFactory.initElements(Hooks.driver,this);
    }
    @FindBy(className = "ico-register")
    public WebElement registerBtn;
    @FindBy(id = "gender-male")
    public WebElement genderCheck;
    @FindBy(id = "FirstName")
    public  WebElement firstName;
    @FindBy(id = "LastName")
    public WebElement lastName;
    @FindBy(id="Email")
    public WebElement email;
    @FindBy(name = "DateOfBirthDay")
    public WebElement day;
    @FindBy(name ="DateOfBirthMonth")
    public  WebElement month;
    @FindBy(name ="DateOfBirthYear")
    public  WebElement year;
    @FindBy(id="Password")
    public  WebElement password;
    @FindBy(id = "ConfirmPassword")
    public WebElement confirmPassword;
    @FindBy(id="register-button")
    public WebElement register;
    @FindBy(className = "result")
    public WebElement banner;
}
