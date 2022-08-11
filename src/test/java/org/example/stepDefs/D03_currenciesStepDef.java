package org.example.stepDefs;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class D03_currenciesStepDef {
    P03_homePage p03_homePage = new P03_homePage();
    @When("Select Euro currency from the dropdown")
    public void SelectCurrency(){
        Select  select =new Select(p03_homePage.currencydd);
        select.selectByIndex(1);
    }



    @Then("verify that the variable contains €")
    public void verifyThatTheVariableContains€() {
        boolean isEuro =true;
            for (int i =0;i<p03_homePage.products.size();i++) {
                if(!p03_homePage.products.get(i).getText().contains("€")){
                    isEuro =false;
                    break;
                }
                SoftAssert softAssert = new SoftAssert();
                softAssert.assertTrue(isEuro);
                softAssert.assertAll();
            }
    }
}
