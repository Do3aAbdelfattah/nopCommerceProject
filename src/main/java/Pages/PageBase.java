package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PageBase {
    WebDriver driver;
    public PageBase (WebDriver driver)
    {
        this.driver = driver;
    }
    public void clickOnElement(By elementLocator)
    {
        waitUntilElementPrecense(elementLocator);
        scrollToElementView(elementLocator);
        driver.findElement(elementLocator).click();
    }
    public void enterText(By elementLocator, String text)
    {
        waitUntilElementPrecense(elementLocator);
        scrollToElementView(elementLocator);
        driver.findElement(elementLocator).sendKeys(text);
    }
    public void selectFromDropDownListByText(By dropdownLocator, String text)
    {
        Select select = new Select(driver.findElement(dropdownLocator));
        select.selectByVisibleText(text);
    }
    public void clickOnSlider(By elementLocator)
    {
        waitUntilElementPrecense(elementLocator);
        scrollToElementView(elementLocator);
        WebElement elementToClick = driver.findElement(elementLocator);
        forceClick(driver, elementToClick);
    }
    public static void forceClick(WebDriver driver, WebElement element) {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].click();", element);
    }
    public void waitUntilElementPrecense(By elementLocator)
    {
        new WebDriverWait(driver, Duration.ofSeconds(20))
                .until(ExpectedConditions.presenceOfElementLocated(elementLocator));
    }
    public void waitUntilElementInvisible(WebElement elementLocator)
    {
        new WebDriverWait(driver, Duration.ofSeconds(20))
                .until(ExpectedConditions.invisibilityOf(elementLocator));
    }
    public void scrollToElementView(By elementLocator)
    {
        WebElement element = driver.findElement(elementLocator);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }
    public void waitUntilNewTabToOpen()
    {
        (new WebDriverWait(driver, Duration.ofSeconds(2))).until(ExpectedConditions.numberOfWindowsToBe(2));
    }
}
