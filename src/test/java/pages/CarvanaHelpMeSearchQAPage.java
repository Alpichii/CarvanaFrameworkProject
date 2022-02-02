package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CarvanaHelpMeSearchQAPage {
    public CarvanaHelpMeSearchQAPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

        @FindBy(xpath = "//div[@data-qa='headline']")
        public WebElement header;

        @FindBy(xpath = "//div[@data-qa='sub-heading']")
        public WebElement subHeader;
}
