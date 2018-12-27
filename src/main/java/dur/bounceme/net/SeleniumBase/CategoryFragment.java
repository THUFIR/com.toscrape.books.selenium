package dur.bounceme.net.SeleniumBase;

import java.util.logging.Logger;
import org.openqa.selenium.WebElement;

public class CategoryFragment {

    private static final Logger LOG = Logger.getLogger(CategoryFragment.class.getName());
    private WebElement container = null;

    private CategoryFragment() {
    }

    public CategoryFragment(WebElement container) {
        LOG.info(container.getTagName());
        this.container = container;
    }

    public void iterate() {
        LOG.info(container.toString());
        LOG.info(container.getTagName());
        LOG.info(container.getText());
        LOG.info(container.getLocation().toString());
    }

}
