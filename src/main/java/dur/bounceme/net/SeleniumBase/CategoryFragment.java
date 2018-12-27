package dur.bounceme.net.SeleniumBase;

import java.util.List;
import java.util.logging.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CategoryFragment {

    private static final Logger LOG = Logger.getLogger(CategoryFragment.class.getName());
    private WebElement container = null;

    @FindBy(tagName = "a")
    private final List<WebElement> links = null;

    private CategoryFragment() {
    }

    public CategoryFragment(WebElement container) {
        LOG.fine(container.getTagName());
        this.container = container;
        LOG.info(container.getAttribute("innerHTML"));

        //   PageFactory.initElements((WebDriver) this.container, this);
        //   LOG.fine("start..");
        //   LOG.fine(links.toString());
        //   for (WebElement webElement : links) {
        //       LOG.fine(webElement.getText());
        //  }
        //   LOG.fine("..done");
    }

}


/*

    public CatalogueFragment(WebElement container) {
        this.container = container;
        //    PageFactory.initElements((WebDriver) this.container, this);
        LOG.fine(container.getAttribute("innerHTML"));
        WebElement items = container.findElement(By.xpath(listItems));
        CategoryFragment categoryFragment = new CategoryFragment(items);
    }

*/
