package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.testng.asserts.SoftAssert;

public class D08_WishlistStepDef {
   P03_homePage p03_homePage =new P03_homePage();
    @When("user click on hart icon on from the product")
    public void userClickOnHartIconOnFromTheProduct() {
    p03_homePage.hartBtn.click();
    }

    @Then("wishlist banner is displayed and in green color")
    public void wishlistBannerIsDisplayedAndInGreenColor() {
     SoftAssert softAssert = new SoftAssert();
     softAssert.assertTrue(p03_homePage.wishListbanner.isDisplayed());
     softAssert.assertEquals(p03_homePage.wishListbanner.getCssValue("color"),"rgba(255, 255, 255, 1)");
     softAssert.assertAll();
    }

 @And("click on wishlist")
 public void clickOnWishlist() {
     p03_homePage.wishListBtn.click();
 }

 @Then("the wish list value and verify it's bigger than zero")
 public void theWishListValueAndVerifyItSBiggerThan() {
         int value = Integer.parseInt( p03_homePage.qty.getAttribute("value"));
         SoftAssert softAssert =new SoftAssert();
         softAssert.assertTrue(value>0);
         softAssert.assertAll();
    }
}
