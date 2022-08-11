package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.testng.Assert;

public class D04_searchStepDef {

    P03_homePage p03_homePage = new P03_homePage();
    @When("^user could search using (.*)$")
    public void search(String searchWord){
        p03_homePage.search.sendKeys(searchWord);
    }
    @And("click on search")
    public void clickSearch(){
        p03_homePage.searchBtn.click();
    }

    @Then("^search results contains the search (.*)$")
    public void searchResultsContainsTheSearchKeyword(String keyword) {
        boolean flag= true;
        for (int i =0;i<p03_homePage.results.size();i++) {
            if(p03_homePage.results.get(i).getText().toLowerCase().contains(keyword.toLowerCase())){
                flag =false;
                break;
            }
            System.out.println(p03_homePage.results.get(i).getText());
            Assert.assertTrue(flag);
        } }
}
