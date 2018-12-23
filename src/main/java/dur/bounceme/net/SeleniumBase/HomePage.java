package dur.bounceme.net.SeleniumBase;

import java.util.List;
import java.util.logging.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

class HomePage {

    private static final Logger LOG = Logger.getLogger(App.class.getName());
    public WebDriver webDriver = null;

    @FindBy(partialLinkText = "Books")
    public WebElement books;

    @FindBy(tagName = "a")
    public List<WebElement> links;

    public HomePage() {
    }

    public HomePage(WebDriver webDriver) {
        LOG.info(webDriver.getCurrentUrl());
        this.webDriver = webDriver;
        PageFactory.initElements(this.webDriver, this);
    }

    public static HomePage init(WebDriver webDriver) {
        return new HomePage(webDriver);
    }

    public void populateCatalogue() {
        LOG.fine("start..");
        for (WebElement webElement : links) {
            LOG.info(webElement.getText());
        }
        LOG.fine("..done");
    }
}


/*
public HompePage(WebDriver driver) 
{           
   this.driver = driver; 
   PageFactory.initElements(driver, this);
}
 */
