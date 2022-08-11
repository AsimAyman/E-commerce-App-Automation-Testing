package org.example.stepDefs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_Registration;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

import java.io.IOException;

public class D01_RegisterStepDef {

    P01_Registration p01_registration=new P01_Registration();
    @Given("navigate to registration page")
    public void navigateToRegisterPage(){
        p01_registration.registerBtn.click();
    }
    @When("user select gender type")
    public void selectGenderType(){
         p01_registration.genderCheck.click();
    }
    @And("^user enter first name (.*) and last name (.*)$")
    public void enterFirstLastname(String firstName,String lastName) throws IOException {



       p01_registration.firstName.sendKeys(firstName);



        p01_registration.lastName.sendKeys(lastName);
   }
   @And("user enter date of birth")
   public void enterBirthDay(){
       Select selectDay =new Select(p01_registration.day);
       selectDay.selectByIndex(28);
       Select selectMonth =new Select(p01_registration.month);
       selectMonth.selectByIndex(7);
       Select selectYear =new Select(p01_registration.year);
       selectYear.selectByIndex(7);

   }
   @And("user enter email field")
    public void enterEmail() throws IOException {
       Faker faker = new Faker();
       String email = faker.internet().safeEmailAddress();
       p01_registration.email.sendKeys(email);
       configReader.set("email",email);
   }
   @And("^user fills Password fields (.*) (.*)$")
    public void fillPasswords(String password,String confirm){
     p01_registration.password.sendKeys(password);
     p01_registration.confirmPassword.sendKeys(confirm);

   }
   @And("user clicks on register button")
    public void clickRegister(){
          p01_registration.register.click();
   }
   @Then("success message is displayed")
    public void validate(){
       SoftAssert softAssert = new SoftAssert();
       softAssert.assertTrue(p01_registration.banner.getText().contains("Your registration completed"));
       softAssert.assertEquals(p01_registration.banner.getCssValue("color"),"rgba(76, 177, 124, 1)","color does not match");
       softAssert.assertAll();
   }

}
