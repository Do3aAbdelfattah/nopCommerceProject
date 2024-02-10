package steps;

import Pages.P03_homePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

import static base.TestBase.driver;

public class D08_WishlistStepDef {
    P03_homePage homePageObject = new P03_homePage(driver);

    @When("user clicks on Add-to-wishlist icon on product {string}")
    public void user_clicks_on_add_to_wishlist_icon_on_product(String string) {
        homePageObject.clickOnAddToWishlistButton(string);
    }

    @Then("success message {string} appears with green background color")
    public void success_message_appears_with_green_background_color(String string) {
        WebElement successMessage = homePageObject.getSuccessMessage();
        Assert.assertTrue(successMessage.isDisplayed());

        String BackgroundColor = homePageObject.getBackgroundColor();
        Assert.assertEquals(BackgroundColor,"#00FF00");
    }

    @And("user clicks on Wishlist Tab on the top of the page")
    public void userClicksOnWishlistTabOnTheTopOfThePage() {
        homePageObject.clickOnWishlistButton();
    }

    @Then("user gets the added product in wishlist page")
    public void userGetsTheAddedProductInWishlistPage() {
        String QtyValue = homePageObject.getQtyValue();
        int QtyIntValue = Integer.parseInt(QtyValue);
        Assert.assertTrue(QtyIntValue > 0);
    }
}
