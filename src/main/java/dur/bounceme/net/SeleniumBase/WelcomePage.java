package dur.bounceme.net.SeleniumBase;

import java.util.List;
import java.util.logging.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

class WelcomePage {

    private static final Logger LOG = Logger.getLogger(App.class.getName());
    private WebDriver webDriver = null;

    @FindBy(partialLinkText = "Books")
    private WebElement books;

    @FindBy(tagName = "a")
    List<WebElement> links;

    private WelcomePage() {
    }

    WelcomePage(WebDriver webDriver) {
        this.webDriver = webDriver;
        LOG.info(webDriver.getCurrentUrl());
    }

    static WelcomePage init(WebDriver webDriver) {
        return new WelcomePage(webDriver);
    }

    void populateCatalogue() {
        LOG.info("start..");
        //  WebElement foo = webDriver.findElement(By.xpath("//a[contains(text(), 'Books')]"));
        //   LOG.info(foo.toString());
        //   LOG.info(foo.getText());
        //   LOG.info(foo.getTagName());        
        //   LOG.info(String.valueOf(foo.isEnabled()));    

      //  LOG.info(books.toString());
      //  LOG.info(books.getText());
      //  LOG.info(books.getTagName());
        LOG.info("..done");
    }

}
