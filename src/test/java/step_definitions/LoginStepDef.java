package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.LoginPage;
import utilities.Driver;

public class LoginStepDef {

    WebDriver driver = Driver.get();
    LoginPage page = new LoginPage();
    WebDriverWait wait = new WebDriverWait(driver, 10);


    @Given("the user goes to {string} page")
    public void theUserGoesToPage(String url) {
        driver.get(url);

    }

    @When("user types {string} and {string} on the login page")
    public void userTypesAndOnTheLoginPage(String userName, String password) throws InterruptedException {

        page.userNameInput.sendKeys(userName);
        page.passwordInput.sendKeys(password);
        wait.until(ExpectedConditions.elementToBeClickable(page.loginButton));
        page.loginButton.click();
        Thread.sleep(2000);
        String actual = page.productsTitle.getText();
        String expected = "PRODUCTS";
        Assert.assertEquals(actual, expected);
    }

    @When("user NOT types {string} or {string} on the login page or using wrong username")
    public void userNOTTypesOrOnTheLoginPageOrUsingWrongUsername(String userName, String password) throws InterruptedException {
        page.userNameInput.sendKeys(userName);
        page.passwordInput.sendKeys(password);
        wait.until(ExpectedConditions.elementToBeClickable(page.loginButton));
        page.loginButton.click();
        Thread.sleep(2000);
        String actual = page.errorMessage.getText();
        String expected = "Epic sadface";
        Assert.assertTrue(actual.contains(expected));


    }
}
