package steps;

import Pages.P03_homePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

import static base.TestBase.driver;

public class D06_homeSlidersStepDef {

    P03_homePage homePageObject = new P03_homePage(driver);

    @When("user clicks on first slider")
    public void user_clicks_on_first_slider() {
        homePageObject.clickOnFirstSlider();
    }
    @Then("user is redirected to the first slider's URL")
    public void user_is_redirected_to_the_first_slider_s_url() {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe("https://demo.nopcommerce.com/nokia-lumia-1020"));
    }

    @When("user clicks on second slider")
    public void user_clicks_on_second_slider() {
        homePageObject.clickOnSecondSlider();

    }
    @Then("user is redirected to the second slider's URL")
    public void user_is_redirected_to_the_second_slider_s_url() {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe("https://demo.nopcommerce.com/iphone-6"));
    }
}
