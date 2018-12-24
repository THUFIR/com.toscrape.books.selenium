package dur.bounceme.net.SeleniumBase;

import java.util.List;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

class HomePage extends AbstractPage {

    private static final Logger LOG = Logger.getLogger(App.class.getName());
    private WebDriver webDriver = null;

    @FindBy(partialLinkText = "Books")
    private WebElement books;

//    @FindBy(tagName = "a")
//    List<WebElement> links;
    @FindBy(xpath = "//div[@class='side_categories']/ul/li/ul/li/a")
    private List<WebElement> links;

    private HomePage() {
    }

    HomePage(WebDriver webDriver) {
        LOG.info(webDriver.getCurrentUrl());
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    public void foo() {
//        WebElement container = webDriver.findElement(By.xpath(String.format("(//div[@class='%s'])[%d]", POST_CONTAINER_CLASS, n)));
        for (WebElement webElement : links) {
            LOG.info(webElement.getText());
            LOG.info(webElement.getAttribute("href"));
        }
    }

    private void populateCatalogue() {
        LOG.fine("start..");
        links.forEach((webElement) -> {
            LOG.info(webElement.getText());
        });
        LOG.fine("..done");
    }
}

/*


    public FacebookPostFragment getPostByIndex(int n) {
        WebElement container = driver.findElement(By.xpath(String.format(
                "(//div[@class='%s'])[%d]", POST_CONTAINER_CLASS,n )));
        return new FacebookPostFragment(container);
}















Then to get the link and the item name:

for (WebElement webElement : links) {
    LOG.info(webElement.getText());
    LOG.info(webElement.getAttribute("href"));
}





 */
