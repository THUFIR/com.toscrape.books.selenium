
package dur.bounceme.net.SeleniumBase;

import java.util.List;
import java.util.logging.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Category {

    private static final Logger LOG = Logger.getLogger(Catalogue.class.getName());
    private WebDriver webDriver = null;
    private WebElement container = null;

    @FindBy(xpath = "//ul/li/ul/li/a")
    private final List<WebElement> links = null;

    private Category() {
    }

    public Category(WebDriver webDriver, WebElement container) {
        LOG.fine(webDriver.getCurrentUrl());
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
        this.container = container;
    }

    public void iterate() {
        LOG.fine(container.toString());
        LOG.fine(container.getTagName());
        LOG.fine(container.getText());
        LOG.fine(container.getLocation().toString());
        for (WebElement webElement : links) {
            LOG.fine(webElement.getText());
            LOG.fine(webElement.getAttribute("href"));
        }
    }

}
