package dur.bounceme.net.SeleniumBase;

import java.util.List;
import java.util.logging.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CategoryFragment {

    private static final Logger LOG = Logger.getLogger(CategoryFragment.class.getName());
    private WebElement container = null;

    @FindBy(xpath = "//ul/li/ul/li/a")
    private final List<WebElement> links = null;

    private CategoryFragment() {
    }

    public CategoryFragment(WebElement container) {
        LOG.fine(container.getTagName());
        this.container = container;
    }

    public void iterate() {
        LOG.fine(container.toString());
        LOG.fine(container.getTagName());
        LOG.info(container.getText());
        LOG.fine(container.getLocation().toString());
    }

}