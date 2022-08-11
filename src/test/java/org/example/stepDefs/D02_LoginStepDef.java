package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P02_Login;
import org.testng.asserts.SoftAssert;

import java.awt.*;
import java.io.IOException;

public class D02_LoginStepDef {
    SoftAssert softAssert = new SoftAssert();
    P02_Login p02_login =new P02_Login(Hooks.driver);
    @Given("user go to login page")
    public void navigateToLogin(){
        p02_login.loginBtn.click();
    }
    @When("^user could not login with invalid (.*) and (.*)$")
    public void enterEmailAndPassword(String email,String password) throws IOException {
       // String email =  configReader.get("email");
        p02_login.emailFl.sendKeys(email);
        p02_login.passwordFl.sendKeys(password);
    }
    @And("user press on login button")
    public void clickLogin(){
       p02_login.login.click();
    }
    @Then("user login to the system successfully")
    public void validat(){
        p02_login.myAccountBtn.click();
        softAssert.assertTrue(p02_login.myAccount.isDisplayed(),"desplay");
        softAssert.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/customer/info");
        softAssert.assertAll();
    }
    @Then("user login fails")
    public void failsLogin(){
                 softAssert.assertTrue(p02_login.failsText.getText().contains("Login was unsuccessful. Please correct the errors and try again."),"Login Assertion");
                 softAssert.assertEquals(p02_login.failsText.getCssValue("color"),"rgba(228, 67, 75, 1)","Login Assertion");
                 softAssert.assertAll();
    }

    @When("user could login with valid email and password;")
    public void userCouldLoginWithValidEmailAndPassword() throws IOException {
        String email =  configReader.get("email");
        p02_login.emailFl.sendKeys(email);
        p02_login.passwordFl.sendKeys("password@");
    }
}
