package dur.bounceme.net.SeleniumBase;

import java.util.List;
import java.util.ListIterator;
import java.util.logging.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Catalog {

    private static final Logger LOG = Logger.getLogger(Catalog.class.getName());
    private WebElement container = null;
    private final WebDriver webDriver = null;

    @FindBy(xpath = "//li")
    List<WebElement> catalogElements = null;

    private Catalog() {
    }

    public Catalog(WebDriver webDriver, WebElement container) {
        this.container = container;
        LOG.fine(container.getAttribute("innerHTML"));
        PageFactory.initElements(webDriver, this);
    }

    public void iterateCatalogElements() {
        LOG.info("trying to iterate..");
        LOG.fine(catalogElements.toString());
        ListIterator<WebElement> li = catalogElements.listIterator();
        WebElement listItem = null;
        while (li.hasNext()) {
            listItem = li.next();
            LOG.info(li.next().getTagName());
            LOG.info(li.next().getText());
            Category c = new Category(webDriver, listItem);
        }
    }
}
