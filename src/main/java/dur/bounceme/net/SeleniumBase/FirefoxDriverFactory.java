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

public class FirefoxDriverFactory {

    private static final Logger LOG = Logger.getLogger(FirefoxDriverFactory.class.getName());

    private Properties properties = new Properties();
    private FirefoxBinary firefoxBinary = null;
    private FirefoxOptions firefoxOptions = null;
    private WebDriver webDriver = null;
    private URL url = null;
    private String driver = null;
    private String gecko = null;
    private final List<String> commandLineOptions = new ArrayList<>();

    private FirefoxDriverFactory() {
    }

    private FirefoxDriverFactory(Properties properties) throws MalformedURLException {
        this.properties = properties;
        loadProps();
        init();
    }

     static WebDriver getWebDriver(Properties properties) throws MalformedURLException {
        FirefoxDriverFactory driverFactory = new FirefoxDriverFactory(properties);
        return driverFactory.webDriver;
    }

    private void loadProps() throws MalformedURLException {
        LOG.fine(properties.toString());
        url = new URL(properties.getProperty("url"));
        driver = properties.getProperty("driver");
        gecko = properties.getProperty("gecko");
        String commandLineOption = properties.getProperty("option01");
        commandLineOptions.add(commandLineOption);
    }

    private void init() throws MalformedURLException {
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

    void close() {
        webDriver.close();
    }

}