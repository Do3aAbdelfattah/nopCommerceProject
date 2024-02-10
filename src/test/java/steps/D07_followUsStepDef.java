package steps;

import Pages.P03_homePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import static base.TestBase.driver;

public class D07_followUsStepDef {
    P03_homePage HomePageObject = new P03_homePage(driver);
    String homePageTab;
    @When("user is in home page")
    public void userIsInHomePage() {
        homePageTab = driver.getWindowHandle();
    }

    @When("user clicks on facebook follow up icon")
    public void user_clicks_on_facebook_follow_up_icon() {
        HomePageObject.clickOnFacebookIcon();
    }

    @When("user clicks on twitter follow up icon")
    public void user_clicks_on_twitter_follow_up_icon() {
        HomePageObject.clickOnTwitterIcon();
    }

    @When("user clicks on rss follow up icon")
    public void user_clicks_on_rss_follow_up_icon() {
        HomePageObject.clickOnRssIcon();
    }

    @When("user clicks on youtube follow up icon")
    public void user_clicks_on_youtube_follow_up_icon() {
        HomePageObject.clickOnYoutubeIcon();
    }
    @Then("{string} is opened in new tab")
    public void isOpenedInNewTab(String arg0) {
        String newTabURL = HomePageObject.switchToNewTab(homePageTab);
        Assert.assertEquals(newTabURL,arg0);
        driver.close();
    }

}
