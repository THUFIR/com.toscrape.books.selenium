package dur.bounceme.net.SeleniumBase;

import java.util.List;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Catalogue {

    private static final Logger LOG = Logger.getLogger(Catalogue.class.getName());
    private WebElement container = null;
    private final String listItem = "//ul";

    @FindBy(xpath = "//ul/li/ul/li/a")
    private final List<WebElement> listItems = null;

    private Catalogue() {
    }

    public Catalogue(WebElement container) {
        this.container = container;
        LOG.info(container.getAttribute("innerHTML"));
        PageFactory.initElements((WebDriver) this.container, this);
        WebElement items = container.findElement(By.xpath(listItem));
        Category categoryFragment = new Category(items);
    }

    public void iterate() {
        LOG.fine(container.toString());
        LOG.fine(container.getTagName());
        LOG.fine(container.getText());
        LOG.fine(container.getLocation().toString());
        for (WebElement webElement : listItems) {
            LOG.fine(webElement.getText());
            LOG.info(webElement.getAttribute("href"));
        }
    }
}
