package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CarvanaCarFinderPage {
    public CarvanaCarFinderPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }
    @FindBy(linkText = "https://www.carvana.com/help-me-search/")
    public WebElement carFinderPageLink;

    @FindBy(xpath = "//div[@class='leftSide']//h1[1]")
    public WebElement header;

    @FindBy(xpath = "//div[@class='leftSide']//h3[1]")
    public  WebElement subHeader;

    @FindBy(xpath = "//a[@data-qa='router-link']")
    public WebElement tryCarFinderButton;
}