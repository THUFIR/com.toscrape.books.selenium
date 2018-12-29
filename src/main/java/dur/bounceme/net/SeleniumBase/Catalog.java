package dur.bounceme.net.SeleniumBase;

import java.util.List;
import java.util.ListIterator;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Catalog {

    private static final Logger LOG = Logger.getLogger(Catalog.class.getName());
    private WebElement container = null;
//    private final String listItem = "//ul";
    private final WebDriver webDriver = null;

    @FindBy(xpath = "//ul/li/ul/li/a")
    private final List<WebElement> listItems = null;

    private Catalog() {
    }

    public Catalog(WebDriver webDriver, WebElement container) {
        this.container = container;
        LOG.fine(container.getAttribute("innerHTML"));
        PageFactory.initElements(webDriver, this);
    }

    public void iterateCatalog() {
        LOG.fine(container.toString());
        LOG.fine(container.getTagName());
        LOG.fine(container.getText());
        LOG.fine(container.getLocation().toString());
        ListIterator<WebElement> foo = listItems.listIterator();
        while (foo.hasNext()) {
            LOG.info(foo.next().getText());
        }

    }
}