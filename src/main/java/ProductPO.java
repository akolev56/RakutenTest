import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ProductPO {
    static public WebElement addToCartButton() {
        return SeleniumWebDriver.driver.findElement(By.xpath("//*[@class=\"orderbox\"] //*[@name=\"button\"]"));
    }
    static public WebElement toShopcart() {
        return SeleniumWebDriver.driver.findElement(By.xpath("//*[@id=\"atc_b_tsc\"]"));
    }

}
