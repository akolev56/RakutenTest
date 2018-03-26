import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;


import java.util.concurrent.TimeUnit;

public class Tools{


    static public void buildDriver() {

        SeleniumWebDriver.setUp();
        SeleniumWebDriver.getDriver();
        SeleniumWebDriver.getDriver().manage().window().maximize();
        SeleniumWebDriver.getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        SeleniumWebDriver.getDriver().manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
        SeleniumWebDriver.getDriver().manage().deleteAllCookies();
    }

   static public void selectDropdownOption(String xPath,String byValue) {
        new Select(SeleniumWebDriver.driver.findElement(By.xpath(xPath))).selectByValue(byValue);
    }

    public boolean verifyTextPresent(final String text) {
        boolean isPresent = false;
        int br = 0;
        while (!isPresent && br <= 5) {
            try {
                br++;
                isPresent = SeleniumWebDriver.getDriver().getPageSource().contains(text);
                if (isPresent) return true;
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

        return false;
    }

    public void assertTextPresent(String text) {
        Assert.assertTrue("The text '" + text + "' is not present on the page, please check!"
                , verifyTextPresent(text));
    }
}
