package dur.bounceme.net.SeleniumBase;

import java.util.List;
import java.util.logging.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

class HomePage extends AbstractPage {

    private static final Logger LOG = Logger.getLogger(App.class.getName());
    private WebDriver webDriver = null;

    @FindBy(partialLinkText = "Books")
    private WebElement books;

    @FindBy(tagName = "a")
     List<WebElement> links;

    private HomePage() {
    }

    HomePage(WebDriver webDriver) {
        LOG.info(webDriver.getCurrentUrl());
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    public void populateCatalogue() {
        LOG.fine("start..");
        links.forEach((webElement) -> {
            LOG.info(webElement.getText());
        });
        LOG.fine("..done");
    }
}