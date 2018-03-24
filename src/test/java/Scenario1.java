import org.junit.Test;

public class Scenario1 extends Tools{

    @Test
    public void searchTest() {
        buildDriver();

        HomePagePO.getSearchField().click();
        HomePagePO.getSearchField().sendKeys("mobile");
        String suggestionText = HomePagePO.getSecondSuggestion().getText();
        HomePagePO.getSecondSuggestion().click();
        assertTextPresent("Ihre Suche nach \""+suggestionText+"\"");

        SeleniumWebDriver.getDriver().quit();
    }

}
