import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePagePO {
    static synchronized public WebElement getSearchField() {
        return SeleniumWebDriver.driver.findElement(By.id("q"));
    }


    static synchronized public WebElement getSecondSuggestion() {
        return SeleniumWebDriver.driver.findElement(By.xpath("//*[@id=\"search_term_list\"] //li[2]"));
    }
}
