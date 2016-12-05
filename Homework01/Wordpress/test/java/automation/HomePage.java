package automation;

import org.openqa.selenium.WebDriver;

/**
 * Class open the page wordpress.
 * @author Alexey Makovski.
 */
public class HomePage {
    /**
     * Method open the page wordpress.
     */
    private static final String HOME_PAGE_URL = "http://localhost:8888/wp-login.php";
    private WebDriver driver;
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    public HomePage open() {
        driver.get(HOME_PAGE_URL);
        return this;
    }


}
