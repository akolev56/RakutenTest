import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ShopcartPO {
    static public WebElement goToCheckout() {
        return SeleniumWebDriver.driver.findElement(By.xpath("//*[@id=\"go_to_checkout\"]"));
    }
}
