package Pages;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P03_homePage extends PageBase{
    public P03_homePage(WebDriver driver) {
        super(driver);
    }
    By RegisterButton = By.className("ico-register");
    By LoginButton = By.className("ico-login");
    By currenciesDropdown = By.id("customerCurrency");
    By Prices = By.className("actual-price");
    By firstSlider = By.xpath("//img[@src='https://demo.nopcommerce.com/images/thumbs/0000088_banner_01.webp']");
    By secondSlider = By.xpath("//img[@src='https://demo.nopcommerce.com/images/thumbs/0000089_banner_02.webp']");
    By facebookIcon = By.className("facebook");
    By twitterIcon = By.className("twitter");
    By rssIcon = By.className("rss");
    By youtubeIcon = By.className("youtube");
    By addToWishlistButton = By.xpath("//button[@title='Add to wishlist']");
    Map<String,Integer> ProductsList = new HashMap<>();
    By successMessage = By.className("content");
    By wishlistButton = By.className("ico-wishlist");
    By Qty = By.className("qty-input");

    public void clickOnRegisterButton()
    {
        clickOnElement(RegisterButton);
    }
    public void clickOnLoginButton()
    {
        clickOnElement(LoginButton);
    }
    public void selectEuroCurrency()
    {
        selectFromDropDownListByText(currenciesDropdown,"Euro");
    }
    public List<WebElement> getPricesList()
    {
        return driver.findElements(Prices);
    }
    public void clickOnFirstSlider()
    {
        clickOnSlider(firstSlider);
    }
    public void clickOnSecondSlider()
    {
        clickOnSlider(secondSlider);
    }
    public void clickOnFacebookIcon()
    {
        clickOnElement(facebookIcon);
    }
    public void clickOnTwitterIcon()
    {
        clickOnElement(twitterIcon);
    }
    public void clickOnRssIcon()
    {
        clickOnElement(rssIcon);
    }
    public void clickOnYoutubeIcon()
    {
        clickOnElement(youtubeIcon);
    }
    public String switchToNewTab(String mainTab)
    {
        waitUntilNewTabToOpen();
        for (String tab : driver.getWindowHandles()) {
            if (!tab.equals(mainTab)) {
                driver.switchTo().window(tab);
                break;
            }
        }
        return driver.getCurrentUrl();
    }
    public void clickOnAddToWishlistButton(String productName)
    {
        ProductsList.put("Build your own computer",0);
        ProductsList.put("Apple MacBook Pro 13-inch",1);
        ProductsList.put("HTC One M8 Android L 5.0 Lollipop",2);
        ProductsList.put("$25 Virtual Gift Card",3);
        int productIndex = ProductsList.get(productName);

        List<WebElement> AddToWishListIcons = driver.findElements(addToWishlistButton);
        AddToWishListIcons.get(productIndex).click();
    }
    public WebElement getSuccessMessage()
    {
        waitUntilElementPrecense(successMessage);
        return driver.findElement(successMessage);
    }
    public String getBackgroundColor()
    {
        waitUntilElementPrecense(successMessage);
        String backgroundColor = driver.findElement(successMessage).getCssValue("background-color");
        String[] rgb = backgroundColor.replace("rgba(", "").replace(")", "").split(",");
        int r = Integer.parseInt(rgb[0].trim());
        int g = Integer.parseInt(rgb[1].trim());
        int b = Integer.parseInt(rgb[2].trim());
        return String.format("#%02x%02x%02x", r, g, b);
    }
    public void clickOnWishlistButton()
    {
        waitUntilElementPrecense(successMessage);
        WebElement successMessageElement = driver.findElement(successMessage);
        waitUntilElementInvisible(successMessageElement);
        clickOnElement(wishlistButton);
    }
    public String getQtyValue()
    {
        waitUntilElementPrecense(Qty);
        return driver.findElement(Qty).getAttribute("value");
    }
}
