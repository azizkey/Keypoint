package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import pages.HoverOverPage;
import utilities.BrowserUtils;
import utilities.Driver;


public class HoverOverStepDef extends HoverOverPage {
    HoverOverPage page = new HoverOverPage();

    @And("user clicks Widgets on the page")
    public void userClicksWidgetsOnThePage() {
        page.widgetButton.click();
    }

    @And("user clicks Tool tips under the Widgets menu")
    public void userClicksToolTipsUnderTheWidgetsMenu() {
        Driver.get().findElement(By.cssSelector("#close-fixedban")).click();
        BrowserUtils.scrollToElement(page.toolTipsButton);
        page.toolTipsButton.click();
    }

    @When("the user hover over to Hover me to see")
    public void theUserHoverOverToHoverMeToSee() {
        Actions actions = new Actions(Driver.get());
        actions.moveToElement(page.hoverMeToSeeButton);
        String actualText = page.hoverMeToSeeButton.getText();
        System.out.println("actualText = " + actualText);
        String expectedText = "Hover me to see";
        System.out.println("expectedText = " + expectedText);
        Assert.assertEquals(actualText, expectedText);
    }

    @Then("user should see You hovered over the Button text and verify the text")
    public void userShouldSeeYouHoveredOverTheButtonTextAndVerifyTheText() throws InterruptedException {
        Actions action = new Actions(Driver.get());
        action.moveToElement(page.toolTipTexField).perform();
        Thread.sleep(3000);
        System.out.println(page.popUp.getText());
    }
}


