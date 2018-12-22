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
        Properties p1 = new Properties();
        Properties p2 = new Properties();
        p1.load(App.class.getResourceAsStream("/selenium.properties"));
        p2.load(App.class.getResourceAsStream("/selenium.properties"));
        LOG.info(p1.toString());
        LOG.info(p2.toString());
        SeleniumBrowser seleniumBrowser = SeleniumBrowser.defaultPage(p2);
        seleniumBrowser.browseToURL();
    }
}
