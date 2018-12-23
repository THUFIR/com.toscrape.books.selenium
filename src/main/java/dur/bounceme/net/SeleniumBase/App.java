package dur.bounceme.net.SeleniumBase;

import java.io.IOException;
import java.util.Properties;
import java.util.logging.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class App {

    private static final Logger LOG = Logger.getLogger(App.class.getName());

    public static void main(String[] args) throws IOException {
        new App().initSelenium();
    }

    private void initSelenium() throws IOException {
        LOG.fine("starting selenium initialization..");
        Properties properties = new Properties();
        properties.loadFromXML(App.class.getResourceAsStream("/selenium.xml"));
        WebDriver webDriver = DriverFactory.getWebDriver(properties);
        HomePage homePage = PageFactory.initElements(webDriver, HomePage.class);
        homePage.populateCatalogue();
    }
}
