package dur.bounceme.net.SeleniumBase;

import java.io.IOException;
import java.util.Properties;
import java.util.logging.Logger;

public class App {

    private static final Logger LOG = Logger.getLogger(App.class.getName());

    public static void main(String[] args) throws IOException {
        new App().initSelenium();
    }

    private void initSelenium() throws IOException {
        LOG.fine("starting selenium initialization..");
        Properties properties = new Properties();
        properties.load(App.class.getResourceAsStream("/selenium.properties"));
        LOG.fine(properties.toString());
        SeleniumBrowser seleniumBrowser = SeleniumBrowser.defaultPage(properties);
        seleniumBrowser.browseToURL();
    }
}
