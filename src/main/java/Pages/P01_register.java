package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P01_register extends PageBase{
    public P01_register(WebDriver driver) {
        super(driver);
    }
    By GenderTypeMale = By.id("gender-male");
    By FirstName = By.id("FirstName");
    By LastName = By.id("LastName");
    By DayDropdown = By.name("DateOfBirthDay");
    By MonthDropdown = By.name("DateOfBirthMonth");
    By YearDropDown = By.name("DateOfBirthYear");
    By EmailField = By.id("Email");
    By Password = By.id("Password");
    By ConfirmPassword = By.id("ConfirmPassword");
    By RegisterButton = By.id("register-button");

    public void SelectGenderType()
    {
        clickOnElement(GenderTypeMale);
    }
    public void enterFirstName(String text)
    {
        enterText(FirstName,text);
    }
    public void enterLastName(String text)
    {
        enterText(LastName,text);
    }
    public void selectDay()
    {
        selectFromDropDownListByText(DayDropdown,"23");
    }
    public void selectMonth()
    {
        selectFromDropDownListByText(MonthDropdown,"October");
    }
    public void SelectYear()
    {
        selectFromDropDownListByText(YearDropDown,"1990");
    }
    public void enterEmail(String text)
    {
        enterText(EmailField, text);
    }
    public void enterPassword(String text)
    {
        enterText(Password,text);
    }
    public void enterConfirmPassword(String text)
    {
        enterText(ConfirmPassword,text);
    }
    public void clickOnRegisterButton()
    {
        clickOnElement(RegisterButton);
    }
}
