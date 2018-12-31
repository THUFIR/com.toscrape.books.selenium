package dur.bounceme.net.SeleniumBase;

import java.util.logging.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Catalog {

    private static final Logger LOG = Logger.getLogger(Catalog.class.getName());
    private WebElement catalogContainer = null;
    private final WebDriver webDriver = null;

    private Catalog() {
    }

    public Catalog(WebDriver webDriver, WebElement catalogContainer) {
        this.catalogContainer = catalogContainer;
        PageFactory.initElements(webDriver, this);
        LOG.info(catalogContainer.getAttribute("innerHTML"));
    }

    public void iterateCatalogElements() {
        LOG.info("starting..");
        LOG.info(catalogContainer.getAttribute("innerHTML"));
    }

}
