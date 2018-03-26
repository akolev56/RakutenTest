import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Scenario2Test extends Tools {

    @Before
    public void setUo(){
        buildDriver();
        SeleniumWebDriver.driver.get("https://www.rakuten.de/produkt/intel-core-i7-8700k-prozessor-2172402375.html");

    }

    @Test
    public void SelectPeymentMethod() {

        ProductPO.addToCartButton().click();
        assertTextPresent("Zum Warenkorb");
        ProductPO.toShopcart().click();
        assertTextPresent("Ihr Warenkorb");
        ShopcartPO.goToCheckout().click();
        assertTextPresent("Wie möchten Sie fortfahren?");
        CheckoutPO.continueAsGuestRB().click();
        CheckoutPO.goToNextStep().click();
        assertTextPresent("Ihre Rechnungsadresse");
        CheckoutPO.fillBillingAddress();
        CheckoutPO.goToNextStep().click();
        assertTextPresent("Wie möchten Sie bezahlen?");
    }

    @After
    public void tearDown() {
        SeleniumWebDriver.driver.quit();
        }
}
