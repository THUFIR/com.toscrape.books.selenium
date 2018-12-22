package dur.bounceme.net.SeleniumBase;

import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

class WelcomePage {

    private static final Logger LOG = Logger.getLogger(App.class.getName());
    private WebDriver webDriver = null;

    private WelcomePage() {
    }

    private WelcomePage(WebDriver webDriver) {
        this.webDriver = webDriver;
        LOG.info(webDriver.getCurrentUrl());
    }

    static WelcomePage init(WebDriver webDriver) {
        return new WelcomePage(webDriver);
    }

    void populateCatalogue() {
//        WebElement we = webDriver.findElement(By.xpath("//a[contains(text(), 'Books')]/@href"));
  //      LOG.info(we.getText());
    }

}

/*

public class ClientPage {
    //add client
    @FindBy(linkText="Admin")
    WebElement admin;
    @FindBy(linkText="Clients")
    WebElement clients;
    @FindBy(how = How.XPATH, using = "//*[@id=\'search-container\']/a/i")
    WebElement addClient;
    @FindBy(how= How.ID, using= "name")
    WebElement name;
    @FindBy(how= How.ID, using= "group_id")
    WebElement group_dropdown;
    @FindBy(how= How.ID, using= "address")
    WebElement address;
    @FindBy(how= How.ID,using= "status")
    WebElement status_dropdown;
    @FindBy(how= How.ID, using= "lat")
    WebElement lat;
    @FindBy(how= How.ID, using= "lang")
    WebElement lang;
    @FindBy(how= How.CLASS_NAME, using= "btn-primary")
    WebElement buton;


*/
