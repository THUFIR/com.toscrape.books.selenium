package dur.bounceme.net.SeleniumBase;

import java.util.logging.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class CatalogueFragment /*extends HomePage */ {

    private static final Logger LOG = Logger.getLogger(CatalogueFragment.class.getName());
    private WebDriver webDriver = null;
    private WebElement container = null;

    private CatalogueFragment() {
    }

    public CatalogueFragment(WebDriver webDriver) {
        LOG.info(webDriver.getCurrentUrl());
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    CatalogueFragment(WebDriver webDriver, WebElement container) {
        LOG.info(webDriver.getCurrentUrl());
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
        this.container = container;
    }

    public void foo() {
        LOG.info(container.toString());
        LOG.info(container.getTagName());
        LOG.info(container.getText());
        LOG.info(container.getLocation().toString());
    }

}
