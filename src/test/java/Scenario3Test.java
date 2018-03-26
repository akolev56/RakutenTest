import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Scenario3Test extends Tools {

    @Before
    public void setup() {
        buildDriver();
        SeleniumWebDriver.driver.get("https://www.rakuten.de/");
    }

    @Test
    public void successfulLogin() {
        HomePagePO.goToLoginPage().click();
        LogInPagePO.getEmailField().sendKeys("test156@abv.bg");
        LogInPagePO.getPasswordField().sendKeys("1234rewq");
        LogInPagePO.getLoginBtn().click();
        assertTextPresent("Mein Konto");
        assertTextPresent("Test Testov");
    }

    @Test
    public void unsuccessfulLoginWrongEmailAndPass() {
        HomePagePO.goToLoginPage().click();
        LogInPagePO.getEmailField().sendKeys("test156.abv.bg");
        LogInPagePO.getPasswordField().sendKeys("1234.rewq");
        LogInPagePO.getLoginBtn().click();
        assertTextPresent("Bitte überprüfen Sie Ihre Eingaben.");
        //Please check your entries.
    }

    @Test
    public void unsuccessfulLoginWrongPass() {
        HomePagePO.goToLoginPage().click();
        LogInPagePO.getEmailField().sendKeys("test156@abv.bg");
        LogInPagePO.getPasswordField().sendKeys("1234.rewq");
        LogInPagePO.getLoginBtn().click();
        assertTextPresent("Diese E-Mail-Passwort-Kombination ist uns nicht bekannt. Bitte korrigieren Sie Ihre Eingabe.");
        //We do not know this e-mail password combination. Please correct your entry.
    }

    @After
    public void tearDown(){
        SeleniumWebDriver.getDriver().quit();
    }
}
