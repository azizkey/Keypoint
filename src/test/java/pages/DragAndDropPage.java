package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DragAndDropPage extends BasePage {

    @FindBy(css = "#draggable")
    public WebElement dragElement;

    @FindBy(css = "#droppable")
    public WebElement toElement;
}
