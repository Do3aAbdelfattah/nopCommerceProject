package steps;

import Pages.P03_homePage;
import Pages.P01_register;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

import static base.TestBase.driver;

public class D01_registerStepDef {

    P03_homePage HomePageObject = new P03_homePage(driver);
    P01_register registerPageObject = new P01_register(driver);

    @Given("user goes to register page")
    public void user_goes_to_register_page() {
        HomePageObject.clickOnRegisterButton();
    }
    @When("user selects gender type")
    public void user_selects_gender_type() {
        registerPageObject.SelectGenderType();
    }
    @And("user enters first name {string} and last name {string}")
    public void user_enters_first_name_and_last_name(String string, String string2) {
        registerPageObject.enterFirstName(string);
        registerPageObject.enterLastName(string2);
    }
    @And("user enters date of birth")
    public void user_enters_date_of_birth() {
        registerPageObject.selectDay();
        registerPageObject.selectMonth();
        registerPageObject.SelectYear();
    }
    @And("user enters email field {string}")
    public void user_enters_email_field(String string) {
        registerPageObject.enterEmail(string);
    }
    @And("user fills Password fields {string} {string}")
    public void user_fills_password_fields(String string, String string2) {
        registerPageObject.enterPassword(string);
        registerPageObject.enterConfirmPassword(string2);

    }
    @And("user clicks on register button")
    public void user_clicks_on_register_button() {
        registerPageObject.clickOnRegisterButton();

    }
    @Then("success message is displayed")
    public void success_message_is_displayed() {
        Assert.assertEquals(driver.findElement(By.className("result")).getText(),"Your registration completed");

    }
}
