package dur.bounceme.net.SeleniumBase;

import java.util.logging.Logger;
import org.openqa.selenium.WebDriver;

public class CatalogueFragment extends HomePage {

    private static final Logger LOG = Logger.getLogger(CatalogueFragment.class.getName());

    public CatalogueFragment(WebDriver webDriver) {
        super(webDriver);
    }

    
    @Override
    public void populateCatalogue() {
        LOG.fine("start..");
        links.forEach((webElement) -> {
            LOG.info(webElement.getText());
        });
        LOG.fine("..done");
    }
    
}
