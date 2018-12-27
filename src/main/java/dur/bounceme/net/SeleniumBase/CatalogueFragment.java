package dur.bounceme.net.SeleniumBase;

import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CatalogueFragment {

    private static final Logger LOG = Logger.getLogger(CatalogueFragment.class.getName());
    private WebElement container = null;
    private final String listItems = "//ul/li/ul";

    private CatalogueFragment() {
    }

    public CatalogueFragment(WebElement container) {
        LOG.fine(container.getTagName());
        this.container = container;
        iterateCatalogue();
    }

    private void iterateCatalogue() {
        LOG.fine(container.toString());
        LOG.fine(container.getTagName());
        LOG.info(container.getText());
        LOG.fine(container.getLocation().toString());
        WebElement items = container.findElement(By.xpath(listItems));
        CategoryFragment categoryFragment = new CategoryFragment(items);
        LOG.info("handed off");
    }

}
