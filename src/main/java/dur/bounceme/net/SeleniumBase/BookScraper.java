package dur.bounceme.net.SeleniumBase;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.logging.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class BookScraper {

    private static final Logger LOG = Logger.getLogger(BookScraper.class.getName());

    private Properties properties = new Properties();
    private FirefoxBinary firefoxBinary = null;
    private FirefoxOptions firefoxOptions = null;
    private WebDriver webDriver = null;
    private URL url = null;
    private String driver = null;
    private String gecko = null;
    private final List<String> commandLineOptions = new ArrayList<>();

    private BookScraper() {
    }

    BookScraper(Properties properties) throws MalformedURLException {
        this.properties = properties;
        LOG.fine(properties.toString());
        url = new URL(properties.getProperty("url"));
        driver = properties.getProperty("driver");
        gecko = properties.getProperty("gecko");
        String commandLineOption = properties.getProperty("option01");
        commandLineOptions.add(commandLineOption);
    }

    static BookScraper defaultPage(Properties properties) throws MalformedURLException {
        return new BookScraper(properties);
    }

    void init() throws MalformedURLException {
        firefoxBinary = new FirefoxBinary();
        commandLineOptions.forEach((commandLineOption) -> {
            LOG.fine(commandLineOption.toString());
            firefoxBinary.addCommandLineOptions(commandLineOption);
        });
        System.setProperty(driver, gecko);
        firefoxOptions = new FirefoxOptions();
        firefoxOptions.setBinary(firefoxBinary);
        webDriver = new FirefoxDriver(firefoxOptions);
        webDriver.get(url.toString());
        LOG.fine(webDriver.getTitle());
        LOG.fine(webDriver.getCurrentUrl().toLowerCase());
    }

    WebDriver getWebDriver() {
        return webDriver;
    }

    void close() {
        webDriver.close();
    }

}
