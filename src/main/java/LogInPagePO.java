import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LogInPagePO extends Tools{

    //get all elements from the page:
    public static WebElement getEmailField() {
        return SeleniumWebDriver.driver.findElement(By.name("loginEmail"));
    }
    public static WebElement getPasswordField() {
        return SeleniumWebDriver.driver.findElement(By.name("loginPassword"));
    }
    public static WebElement getLoginBtn() {
        return SeleniumWebDriver.driver.findElement(By.name("submit"));
    }

}
