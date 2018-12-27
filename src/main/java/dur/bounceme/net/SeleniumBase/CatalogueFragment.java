package dur.bounceme.net.SeleniumBase;

import java.util.List;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CatalogueFragment /*extends HomePage */ {

    private static final Logger LOG = Logger.getLogger(CatalogueFragment.class.getName());
//    private WebDriver webDriver = null;
    private WebElement container = null;
    private final String listItems = "//ul/li/ul";

    @FindBy(xpath = "//ul/li/ul/li/a")
    private final List<WebElement> links = null;

    private CatalogueFragment() {
    }

    public CatalogueFragment(WebElement container) {
        LOG.fine(container.getTagName());
        this.container = container;
    }

    public void iterateCatalogue() {
        LOG.fine(container.toString());
        LOG.fine(container.getTagName());
        LOG.info(container.getText());
        LOG.fine(container.getLocation().toString());
//        WebElement container = webDriver.findElement(By.xpath(xpathString));
        WebElement category = container.findElement(By.xpath(listItems));

    }

}


/*


    public void frag() {
        LOG.fine(xpathString);
        WebElement container = webDriver.findElement(By.xpath(xpathString));
        CatalogueFragment catalogueFragment = new CatalogueFragment(container);
        catalogueFragment.iterate();
    }


 */
