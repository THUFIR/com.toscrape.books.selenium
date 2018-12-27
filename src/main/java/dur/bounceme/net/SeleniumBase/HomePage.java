package dur.bounceme.net.SeleniumBase;

import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

class HomePage extends AbstractPage {

    private static final Logger LOG = Logger.getLogger(App.class.getName());
    private WebDriver webDriver = null;

    private final String sideCategory = "//div[@class='side_categories']/ul/li/ul";

    private HomePage() {
    }

    HomePage(WebDriver webDriver) {
        LOG.fine(webDriver.getCurrentUrl());
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    public void frag() {
        LOG.fine(sideCategory);
        WebElement container = webDriver.findElement(By.xpath(sideCategory));
        CatalogueFragment catalogueFragment = new CatalogueFragment(container);
    }

}
