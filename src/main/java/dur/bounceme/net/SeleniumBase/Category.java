package dur.bounceme.net.SeleniumBase;

import java.util.List;
import java.util.logging.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Category {

    private static final Logger LOG = Logger.getLogger(Category.class.getName());
    private WebElement container = null;

    @FindBy(tagName = "a")
    private final List<WebElement> links = null;

    private Category() {
    }

    public Category(WebElement container) {
        LOG.fine(container.getTagName());
        this.container = container;
        LOG.info(container.getAttribute("innerHTML"));
    }

}

