import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Scenario1Test extends Tools{
    @Before
    public void setUo(){
        buildDriver();
        SeleniumWebDriver.driver.get("https://www.rakuten.de");
    }
    @Test
    public void searchTest() {

        HomePagePO.searchField().click();
        HomePagePO.searchField().sendKeys("mobile");
        String suggestionText = HomePagePO.secondSuggestion().getText();
        HomePagePO.secondSuggestion().click();
        assertTextPresent("Ihre Suche nach \""+suggestionText+"\"");

        SeleniumWebDriver.getDriver().quit();
    }
    @After
    public void tearDown(){
        SeleniumWebDriver.driver.quit();
    }
}
