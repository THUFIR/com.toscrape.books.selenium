package dur.bounceme.net.SeleniumBase;

import java.util.logging.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Category {

    private static final Logger LOG = Logger.getLogger(Category.class.getName());
    private WebElement container = null;

    private Category() {
    }

    public Category(WebElement container) {
        LOG.fine(container.getTagName());
        this.container = container;
        PageFactory.initElements((WebDriver) container, this);
        LOG.fine(container.getAttribute("innerHTML"));
    }


}
