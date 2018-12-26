package dur.bounceme.net.SeleniumBase;

import java.util.List;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

class HomePage extends AbstractPage {

    private static final Logger LOG = Logger.getLogger(App.class.getName());
    private WebDriver webDriver = null;

    @FindBy(partialLinkText = "Books")
    private WebElement books;

    @FindBy(xpath = "//div[@class='side_categories']/ul/li/ul/li/a")
    private List<WebElement> links;

//    private final String xpathString = "//div[@class='side_categories']/ul/li/ul/li/a";
    private final String xpathString = "//div[@class='side_categories']/ul/li/ul";

    private HomePage() {
    }

    HomePage(WebDriver webDriver) {
        LOG.fine(webDriver.getCurrentUrl());
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    public void populateCatalogue() {
        links.stream().map((webElement) -> {
            LOG.fine(webElement.getText());
            return webElement;
        });
    }

    public void frag() {
        LOG.fine(xpathString);
        WebElement container = webDriver.findElement(By.xpath(xpathString));
        CatalogueFragment catalogueFragment = new CatalogueFragment(container);
        catalogueFragment.iterate();
    }

}
