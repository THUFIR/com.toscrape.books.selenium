package dur.bounceme.net.SeleniumBase;

import java.util.List;
import java.util.logging.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

class WelcomePage {

    private static final Logger LOG = Logger.getLogger(App.class.getName());
    private WebDriver webDriver = null;

    @FindBy(partialLinkText = "Books")
    private WebElement books;

    @FindBy(tagName = "a")
    List<WebElement> links;

    private WelcomePage() {
    }

    WelcomePage(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(this.webDriver, this);
        LOG.info(webDriver.getCurrentUrl());
    }

    static WelcomePage init(WebDriver webDriver) {
        return new WelcomePage(webDriver);
    }

    void populateCatalogue() {
        LOG.info("start..");
        LOG.info(links.toString());
        for (WebElement webElement : links) {
            LOG.info(webElement.getText());
        }
        LOG.info("..done");
    }

}
