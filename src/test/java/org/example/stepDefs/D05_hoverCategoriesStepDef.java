package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.asserts.SoftAssert;

import java.util.List;
import java.util.Random;

public class D05_hoverCategoriesStepDef {
    List<WebElement> subCategories =null;
    P03_homePage p03_homePage = new P03_homePage();
    WebElement selectedCatigory;
    Random random =new Random();
    String expectedResult;

    WebElement selectedSubCatigory;
    List<WebElement> mainCategories;
   @When("user HoverCategories on Computer random category")
    public void hover(){

       Actions action = new Actions(Hooks.driver);
        mainCategories =Hooks.driver.findElements(By.xpath("//ul[@class=\"top-menu notmobile\"]/li"));
        //selectedCatigory = mainCategories.get(random.nextInt(7));
       //  selectedCatigory = mainCategories.get(0);
  //       action.moveToElement(selectedCatigory).perform();
   }
   @And("click on subCategory")
    public void clickOnSubCategory(){
       //List<WebElement> subCategories = selectedCatigory.findElements(By.tagName("li"));
       List<WebElement> subCategories = mainCategories.get(1).findElements(By.tagName("li"));
       System.out.println(subCategories.size());
       if (subCategories.size()>0) {
           System.out.println("in sub");
           System.out.println("SSS: "+subCategories.get(1).findElement(By.tagName("a")).getText());
           System.out.println("xxx: "+ p03_homePage.sub);
           for (int i = 0; i < subCategories.size(); i++) {
               System.out.println("in sub");
               System.out.println(subCategories.get(1).getText());
           }
       }else {
           System.out.println("no sub");
           expectedResult = selectedCatigory.getText();
           System.out.println("eeee: "+expectedResult);
           selectedCatigory.click();

       }
//       if (subCategories.size()>0 && subCategories!=null){
//           selectedSubCatigory = subCategories.get(random.nextInt(subCategories.size()));
//           selectedCatigory.click();
//           expectedResult = selectedSubCatigory.getText();
//;
//       }
//
//           else {
//               selectedCatigory.click();
//               expectedResult = selectedCatigory.getText();
//
//       }
//       System.out.println("expected:  "+expectedResult);
//       System.out.println("acual:     "+selectedSubCatigory.getText());
    }
    @Then("User could navigate successfully")
    public void assertion(){
       SoftAssert softAssert = new SoftAssert();
       System.out.println(p03_homePage.pageTitle.getText()+expectedResult);
       softAssert.assertTrue(p03_homePage.pageTitle.getText().contains(expectedResult),"DDDDDDDXXXXXX");
       softAssert.assertAll();
    }
}
