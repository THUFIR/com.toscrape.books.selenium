package dur.bounceme.net.SeleniumBase;

import java.util.List;
import java.util.logging.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Categories {

    private static final Logger LOG = Logger.getLogger(Categories.class.getName());
    private WebElement container = null;

//    @FindBy(tagName = "a")
    //   private final List<WebElement> allLinks = null;
    @FindBy(xpath = "//ul/li/ul/li/a")
    private final List<WebElement> listItems = null;

    private Categories() {
    }

    public Categories(WebElement container) {
        LOG.fine(container.getTagName());
        this.container = container;
        PageFactory.initElements((WebDriver) container, this);
        LOG.fine(container.getAttribute("innerHTML"));
        iterate();
    }

    public void iterate() {
        LOG.fine(container.toString());
        LOG.fine(container.getTagName());
        LOG.fine(container.getText());
        LOG.fine(container.getLocation().toString());
        for (WebElement webElement : listItems) {
            LOG.fine(webElement.getText());
            LOG.info(webElement.getAttribute("href"));
        }
    }

}
