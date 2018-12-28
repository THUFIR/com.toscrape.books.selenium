package dur.bounceme.net.SeleniumBase;

import java.util.List;
import java.util.logging.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Categories {

    private static final Logger LOG = Logger.getLogger(Categories.class.getName());
    private WebElement container = null;

    @FindBy(tagName = "a")
    private final List<WebElement> links = null;

    private Categories() {
    }

    public Categories(WebElement container) {
        LOG.info(container.getTagName());
        this.container = container;
        LOG.info(container.getAttribute("innerHTML"));
    }

}

