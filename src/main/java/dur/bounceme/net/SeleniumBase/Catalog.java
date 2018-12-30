package dur.bounceme.net.SeleniumBase;

import java.util.List;
import java.util.ListIterator;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Catalog {

    private static final Logger LOG = Logger.getLogger(Catalog.class.getName());
    private WebElement container = null;
    private final WebDriver webDriver = null;

//    @FindBy(xpath = "//ul/li/ul/li/a")
//    private final List<WebElement> listItems = null;
//    @FindBy(xpath = "//div[@id='container']")
    @FindBy(xpath = "//li/a")
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
        LOG.info(catalogElements.toString());

        // List<String> f = catalogElements.stream().map(WebElement::getText).collect(Collectors.toList());
        ListIterator<WebElement> li = catalogElements.listIterator();
        while (li.hasNext()) {
            LOG.info(li.next().getTagName());
            LOG.info(li.next().getText());
        }
        //   LOG.info(f.toString());
    }
}
