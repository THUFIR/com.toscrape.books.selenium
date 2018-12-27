package dur.bounceme.net.SeleniumBase;

import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Catalogue {

    private static final Logger LOG = Logger.getLogger(Catalogue.class.getName());
    private WebElement container = null;
    private final String listItems = "//ul/li/ul";

    private Catalogue() {
    }

    public Catalogue(WebElement container) {
        this.container = container;
        //    PageFactory.initElements((WebDriver) this.container, this);
        LOG.fine(container.getAttribute("innerHTML"));
        WebElement items = container.findElement(By.xpath(listItems));
        Category categoryFragment = new Category(items);
    }

}
