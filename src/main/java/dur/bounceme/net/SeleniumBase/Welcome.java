package dur.bounceme.net.SeleniumBase;

import java.util.logging.Logger;
import org.openqa.selenium.WebDriver;

class Welcome {

    private static final Logger LOG = Logger.getLogger(App.class.getName());
    private WebDriver webDriver;

    private Welcome() {
    }

    private Welcome(WebDriver webDriver) {
        this.webDriver = webDriver;
        LOG.info(webDriver.getCurrentUrl());
    }

    static Welcome populateCatalogue(WebDriver webDriver) {
        return new Welcome(webDriver);
    }

}
