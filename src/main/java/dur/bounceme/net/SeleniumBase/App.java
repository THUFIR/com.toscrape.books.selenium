package dur.bounceme.net.SeleniumBase;

import java.io.IOException;
import java.util.Properties;
import java.util.logging.Logger;
import org.openqa.selenium.WebDriver;

public class App {

    private static final Logger LOG = Logger.getLogger(App.class.getName());

    public static void main(String[] args) throws IOException {
        new App().initSelenium();
    }

    private void initSelenium() throws IOException {
        LOG.fine("starting selenium initialization..");

        Properties properties = new Properties();
        properties.loadFromXML(App.class.getResourceAsStream("/selenium.xml"));
        LOG.fine(properties.toString());
        BookScraper bookScraper = new BookScraper(properties);
        WebDriver webDriver = bookScraper.getWebDriver();
        WelcomePage welcomePage = new WelcomePage(webDriver);
        welcomePage.populateCatalogue();
        bookScraper.close();
    }
}
