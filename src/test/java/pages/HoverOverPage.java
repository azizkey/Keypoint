package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HoverOverPage extends BasePage{

    @FindBy(css = ".card:nth-child(4) svg")
    public WebElement widgetButton;

    @FindBy(css = ".show #item-6")
    public WebElement toolTipsButton;

    @FindBy(css = "#toolTipButton")
    public WebElement hoverMeToSeeButton;


}
