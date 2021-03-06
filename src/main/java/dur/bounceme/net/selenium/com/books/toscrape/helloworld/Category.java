package dur.bounceme.net.selenium.com.books.toscrape.helloworld;

import java.util.logging.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Category {

    private static final Logger LOG = Logger.getLogger(Category.class.getName());
    private WebElement container = null;
    private final WebDriver webdriver = null;

    private Category() {
    }

    public Category(WebDriver webDriver, WebElement container) {
        LOG.fine("new category..");
        this.container = container;
        PageFactory.initElements(webDriver, container);
        LOG.fine(container.getAttribute("innerHTML"));
    }

    public void iterateThisCategory() {
    }
}
