package dur.bounceme.net.SeleniumBase;

import java.io.IOException;
import java.util.Properties;
import java.util.logging.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class App {

    private static final Logger LOG = Logger.getLogger(App.class.getName());
    private Properties properties = new Properties();

    public static void main(String[] args) throws IOException {
        new App().initSelenium();
    }

    private void initSelenium() throws IOException {
        properties.loadFromXML(App.class.getResourceAsStream("/selenium.xml"));
        WebDriver webDriver = DriverFactory.getWebDriver(properties);
        HomePage homePage = new HomePage(webDriver);
        homePage.populateCatalogue();
    }
}
