package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.ArrayList;


public class D07_followUsStepDef {
    String currentUrl;
    P03_homePage p03_homePage =new P03_homePage();
    @When("user click on facebook Icon")
    public void userClickOnFacebookIcon() {
        p03_homePage.facebookbtn.click();
    }



    @And("close  the second tap")
    public void closeTheSecondTap() throws InterruptedException {
        Thread.sleep(3000);
        ArrayList<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(tabs.get(1));
        currentUrl = Hooks.driver.getCurrentUrl();
        Hooks.driver.close();
        Thread.sleep(3000);
    }

    @Then("The browser open a new tap with url: {string}")
    public void theBrowserOpenANewTapWithUrl(String arg0) {

        Assert.assertEquals(currentUrl,arg0);

    }

    @When("user click on twitter Icon")
    public void userClickOnTwitterIcon() {
        p03_homePage.twitterbtn.click();
    }

    @When("user click on rss Icon")
    public void userClickOnRssIcon() {
        p03_homePage.rssbtn.click();
    }

    @When("user click on youtube Icon")
    public void userClickOnYoutubeIcon() {
        p03_homePage.youtubebtn.click();
    }


}
