package dur.bounceme.net.SeleniumBase;

import java.util.logging.Logger;

public class App {

    private static final Logger LOG = Logger.getLogger(App.class.getName());

    public static void main(String[] args) {
        new App().initSelenium();
    }

    private void initSelenium() {
        LOG.fine("starting selenium initialization..");
    }
}
