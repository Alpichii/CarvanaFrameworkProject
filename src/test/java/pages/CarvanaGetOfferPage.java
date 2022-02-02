package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CarvanaGetOfferPage {
    public CarvanaGetOfferPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='ErrorMessageContainer-oo6j68-8 bEWysd']")
    public WebElement errorMessage;
}