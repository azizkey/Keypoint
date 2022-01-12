package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AlertHandlePage extends BasePage {


    @FindBy(xpath = "/html//button[@id='alertButton']")
    public WebElement clickMe;

    @FindBy(css = "button#timerAlertButton")
    public WebElement secondAlert5;

    @FindBy(css = "button#confirmButton")
    public WebElement thirthAlert;

    @FindBy(css = "button#promtButton")
    public WebElement promptButton;

    @FindBy(css = "span#promptResult")
    public WebElement promptResult;


}
