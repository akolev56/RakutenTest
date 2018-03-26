import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ProductPO {
    static public WebElement addToCartButton() {
        return SeleniumWebDriver.driver.findElement(By.xpath("//*[@id=\"product_top\"]/div[1]/div[2]/div/div[2]/input"));
    }
    static public WebElement toShopcart() {
        return SeleniumWebDriver.driver.findElement(By.xpath("//*[@id=\"atc_b_tsc\"]"));
    }

}
