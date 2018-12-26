package dur.bounceme.net.SeleniumBase;

import java.io.IOException;
import java.util.Properties;
import java.util.logging.Logger;
import org.openqa.selenium.WebDriver;

public class App {

    private static final Logger LOG = Logger.getLogger(App.class.getName());
    private final Properties properties = new Properties();
    private final String driverType = null;

    public static void main(String[] args) throws IOException {
        new App().scrapeBooks();
    }

    private void scrapeBooks() throws IOException {
        properties.loadFromXML(App.class.getResourceAsStream("/selenium.xml"));
        WebDriver webDriver = WebDriverFactory.getWebDriver(properties);
        HomePage homePage = new HomePage(webDriver);
        homePage.populateCatalogue();
        homePage.frag();
    }
}
