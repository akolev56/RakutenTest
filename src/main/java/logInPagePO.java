import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class logInPagePO extends Tools{

        static synchronized public WebElement getOnboardingSettingsButton() {
            return SeleniumWebDriver.driver.findElement(By.xpath("//*[@data-name='at:OnboardingSettings']"));
        }

    static synchronized public WebElement getLogInButton() {
        return SeleniumWebDriver.driver.findElement(By.xpath("//*[@data-name='at:OnboardingSettings']"));
    }

}
