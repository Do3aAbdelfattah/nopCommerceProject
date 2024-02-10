package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P02_login extends PageBase{
    public P02_login(WebDriver driver) {
        super(driver);
    }
    By EmailField = By.id("Email");
    By PasswordField = By.id("Password");
    By LoginButton = By.className("login-button");

    public void enterEmail(String text)
    {
        enterText(EmailField,text);
    }
    public void enterPassword(String text)
    {
        enterText(PasswordField,text);
    }
    public void clickOnLoginButton()
    {
        clickOnElement(LoginButton);
    }
}
