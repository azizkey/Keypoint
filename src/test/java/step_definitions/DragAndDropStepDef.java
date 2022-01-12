package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.Driver;

public class DragAndDropStepDef {

    @And("drag element to the drop field")
    public void dragElementToTheDropField() {
        Actions builder = new Actions(Driver.get());
        WebElement dragElement = Driver.get().findElement(By.id("draggable"));
        WebElement droppedField = Driver.get().findElement(By.id("droppable"));
        builder.dragAndDrop(dragElement, droppedField).perform();
    }

    @Then("verify that is dropped")
    public void verifyThatIsDropped() {

        WebElement droppedField = Driver.get().findElement(By.id("droppable"));

        String droppedText = droppedField.getText();
        if (droppedText.equals("Dropped!")) {
            System.out.println("PASS: Source is dropped to target as expected");
        } else {
            System.out.println("FAIL: Source couldn't be dropped to target as expected");
        }
    }
}
