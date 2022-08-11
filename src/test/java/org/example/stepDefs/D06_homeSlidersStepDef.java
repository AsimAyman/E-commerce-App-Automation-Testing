package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class D06_homeSlidersStepDef {
    P03_homePage p03_homePage = new P03_homePage();
    WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(10));
    SoftAssert softAssert = new SoftAssert();
    @When("click so user could navigate successfully")
    public void clickFristSlider(){
     p03_homePage.slider.click();
    }
    @Then("user could navigate to Nokia url successfully")
    public void assertion1(){
        softAssert.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/nokia-lumia-1020","nokia slides");
        softAssert.assertAll();

    }
    @Then("user could navigate to Iphone url successfully")
    public void assertion2(){
        softAssert.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/iphone-6","Iphone slides");
        softAssert.assertAll();

    }

    @Given("user wait the second slider is displayed")
    public void userWaitTheSecondSliderIsDisplayed() throws InterruptedException {
       Thread.sleep(5000);
    }

}
