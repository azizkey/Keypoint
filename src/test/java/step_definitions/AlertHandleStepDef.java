package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.AlertHandlePage;
import utilities.Driver;


public class AlertHandleStepDef {
    AlertHandlePage page = new AlertHandlePage();

    @Given("user goes to {string} page")
    public void userGoesToPage(String url) {
        Driver.get().get(url);
        System.out.println(Driver.get().getCurrentUrl());
    }

    @And("click Click Me Button to see alert button")
    public void clickClickMeButtonToSeeAlertButton() {
        page.clickMe.click();
    }

    @Then("click alert ok button to hadle alert")
    public void clickAlertOkButtonToHadleAlert() {
        WebDriverWait wait = new WebDriverWait(Driver.get(), 15);
        wait.until(ExpectedConditions.alertIsPresent());
        Driver.get().switchTo().alert().accept();
    }

    @And("user clicks second alert box")
    public void userClicksSecondAlertBox() {
        page.secondAlert5.click();
    }

    @And("user clicks third alert box")
    public void userClicksThirdAlertBox() {
        page.thirthAlert.click();
        System.out.println("click 3.");
    }

    @Then("confirm the alert")
    public void confirmTheAlert() {
        Alert confirmationAlert = Driver.get().switchTo().alert();
        String alertText = confirmationAlert.getText();
        System.out.println("Alert text is " + alertText);
        confirmationAlert.accept();
    }

    @And("user clicks prompt button alert box")
    public void userClicksPromptButtonAlertBox() {
        page.promptButton.click();
    }

    @And("user enters input into JS alert box")
    public void userEntersInputIntoJSAlertBox() {
        Alert promptAlert = Driver.get().switchTo().alert();
        promptAlert.sendKeys("aziz");
        promptAlert.accept();
    }

    @Then("verify the alert input")
    public void verifyTheAlertInput() {
        String actualInput = page.promptResult.getText();
        System.out.println(actualInput);
        String expectedInput = "aziz";
        Assert.assertTrue(actualInput.contains(expectedInput));
    }


}
