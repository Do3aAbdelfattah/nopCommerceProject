package steps;

import Pages.P03_homePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

import static base.TestBase.driver;

public class D03_currenciesStepDef {
    P03_homePage homePageObject = new P03_homePage(driver);

    @When("user Select Euro currency from the dropdown list in home page")
    public void user_select_euro_currency_from_the_dropdown_list_in_home_page() {
        homePageObject.selectEuroCurrency();
    }

    @Then("Euro Symbol \\(€) is shown on the four products displayed in Home page")
    public void euroSymbol€IsShownOnTheFourProductsDisplayedInHomePage() {
        List<WebElement> PricesList = homePageObject.getPricesList();
        String PriceText;
        for (int i=0; i<PricesList.size(); i++)
        {
            PriceText= PricesList.get(i).getText();
            System.out.println(PriceText);
            Assert.assertTrue(PriceText.contains("€"));
        }
    }
}
