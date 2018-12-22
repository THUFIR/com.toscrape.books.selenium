package dur.bounceme.net.SeleniumBase;

import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

class WelcomePage {

    private static final Logger LOG = Logger.getLogger(App.class.getName());
    private WebDriver webDriver = null;

    private WelcomePage() {
    }

    private WelcomePage(WebDriver webDriver) {
        this.webDriver = webDriver;
        LOG.info(webDriver.getCurrentUrl());
    }

    static WelcomePage init(WebDriver webDriver) {
        return new WelcomePage(webDriver);
    }

    void populateCatalogue() {
        WebElement we = webDriver.findElement(By.xpath("//a[contains(text(), 'Books')]/@href"));
        LOG.info(we.getText());
    }

}
