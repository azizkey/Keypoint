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

    @FindBy(id = "toolTipTextField")
    public WebElement toolTipTexField;

    @FindBy(xpath = "//div[contains(text(), 'You hovered over the text field')]")
    public WebElement popUp;




}
