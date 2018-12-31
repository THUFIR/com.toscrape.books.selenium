package dur.bounceme.net.selenium.com.books.toscrape.helloworld;

import java.util.List;
import java.util.logging.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Catalog {

    private static final Logger LOG = Logger.getLogger(Catalog.class.getName());
    private WebElement catalogContainer = null;
    private final WebDriver webDriver = null;

    @FindBy(xpath = "/li")
    List<WebElement> catalogElements = null;
    //span[@class='title'])[la­st()]
    
    @FindBy(xpath = "/span[@class=title])[last()]")
    WebElement last = null;

    
//    @FindBy(xpath = "*[@id=’Crime’]/ul/li[3]/a")
    @FindBy(xpath = "*[@id=’Crime’]/ul/li/a")
    WebElement oneCategory = null;
    
    private Catalog() {
    }

    public Catalog(WebDriver webDriver, WebElement catalogContainer) {
        this.catalogContainer = catalogContainer;
        PageFactory.initElements(webDriver, this);
        LOG.info("after init");
        LOG.info(catalogContainer.getAttribute("innerHTML"));
        LOG.info(oneCategory.toString());
        LOG.info(oneCategory.getText());        
    }

    public void iterateCatalogElements() {
        LOG.info("starting..");
        //    LOG.info(catalogContainer.getAttribute("innerHTML"));
        //LOG.info(last.getText());
    }

    /*
    public void iterateCatalogElements0() {
        LOG.info("trying to iterate..");
        LOG.info(catalogContainer.toString());
        LOG.info(catalogElements.toString());
        LOG.info(last.toString());
        ListIterator<WebElement> li = catalogElements.listIterator();
        WebElement listItem = null;
        while (li.hasNext()) {
            listItem = li.next();
            LOG.fine(li.next().getTagName());
            LOG.fine(li.next().getText());
            Category c = new Category(webDriver, listItem);
        }
    }
     */
}
