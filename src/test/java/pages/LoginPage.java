package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(id = "user-name")
    public WebElement userNameInput;

    @FindBy(id = "password")
    public WebElement passwordInput;

    @FindBy(id = "login-button")
    public WebElement loginButton;

    @FindBy(css = "span.title")
    public WebElement productsTitle;


    @FindBy(id = " logout_sidebar_link")
    public WebElement logOutSidebarLink;


    @FindBy(css = "h3")
    public WebElement errorMessage;


}
