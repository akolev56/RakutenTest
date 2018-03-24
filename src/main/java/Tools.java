import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.util.concurrent.TimeUnit;

public class Tools{


    static synchronized public void buildDriver() {

        SeleniumWebDriver.setUp("https://www.rakuten.de");
        SeleniumWebDriver.getDriver();
        SeleniumWebDriver.getDriver().manage().window().maximize();
        SeleniumWebDriver.getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        SeleniumWebDriver.getDriver().manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
        SeleniumWebDriver.getDriver().manage().deleteAllCookies();
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

    public boolean verifyWebElementPresent(By by) {

        WebDriverWait wait = new WebDriverWait(SeleniumWebDriver.getDriver(), 30);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(by));

        if (element == null) return false;
        else return true;

    }


    public void assertTextPresent(String text) {
        Assert.assertTrue("The text '" + text + "' is not present on the page, please check!"
                , verifyTextPresent(text));
    }

}
