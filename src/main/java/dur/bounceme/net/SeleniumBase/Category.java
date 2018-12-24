
package dur.bounceme.net.SeleniumBase;

import java.util.List;
import java.util.logging.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Category {

    private static final Logger LOG = Logger.getLogger(CatalogueFragment.class.getName());
    private WebDriver webDriver = null;
    private WebElement container = null;

    @FindBy(xpath = "//ul/li/ul/li/a")
    private final List<WebElement> links = null;

    private Category() {
    }

    public Category(WebDriver webDriver, WebElement container) {
        LOG.info(webDriver.getCurrentUrl());
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
        this.container = container;
    }

    public void iterate() {
        LOG.info(container.toString());
        LOG.info(container.getTagName());
        LOG.info(container.getText());
        LOG.info(container.getLocation().toString());
        for (WebElement webElement : links) {
            LOG.info(webElement.getText());
            LOG.fine(webElement.getAttribute("href"));
        }
    }

}
