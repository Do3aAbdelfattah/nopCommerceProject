package steps;

import Pages.P03_homePage;
import Pages.P02_login;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

import static base.TestBase.driver;

public class D02_loginStepDef {
    P03_homePage HomePageObject = new P03_homePage(driver);
    P02_login loginPageObject = new P02_login(driver);

    @When("user go to login page")
    public void user_go_to_login_page() {
        Assert.assertEquals(driver.getCurrentUrl(),"https://demo.nopcommerce.com/");
        HomePageObject.clickOnLoginButton();
    }
    @And("user login with {string} and {string}")
    public void userLoginWithAnd(String arg0, String arg1) {
        loginPageObject.enterEmail(arg0);
        loginPageObject.enterPassword(arg1);
    }

    @And("user press on login button")
    public void user_press_on_login_button() {
        loginPageObject.clickOnLoginButton();
    }
    @Then("user login to the system successfully")
    public void user_login_to_the_system_successfully() {
        Assert.assertTrue(driver.findElement(By.className("ico-account")).isDisplayed());
    }

    @Then("user could not login to the system")
    public void userCouldNotLoginToTheSystem() {
        Assert.assertTrue(driver.findElement(By.className("message-error")).getText().contains("Login was unsuccessful"));
    }


}
