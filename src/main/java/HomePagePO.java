import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePagePO {
    static public WebElement searchField() {
        return SeleniumWebDriver.driver.findElement(By.xpath("//*[@id=\"q\"]"));
    }

    static public WebElement secondSuggestion() {
        return SeleniumWebDriver.driver.findElement(By.xpath("//*[@id=\"search_term_list\"] //li[2]"));
    }

    static public WebElement goToLoginPage(){
        return SeleniumWebDriver.driver.findElement(By.xpath("//*[@class='tr_header_login']"));
    }
}
