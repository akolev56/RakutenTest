import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckoutPO {
    //Select Continue as Guest
    static public WebElement continueAsGuestRB() {
        return SeleniumWebDriver.driver.findElement(By.xpath("//*[@id=\"login-method1\"]"));
    }
    static public WebElement goToNextStep() {
        return SeleniumWebDriver.driver.findElement(By.xpath("//*[@id=\"go_to_next_step\"]"));
    }
    //Elements in the fill options
    private static WebElement selectGenderDD() {
        return SeleniumWebDriver.driver.findElement(By.xpath("//*[@class='field-container gender-container'] //a"));
    }
    private static WebElement selectGender(String index) {
        return SeleniumWebDriver.driver.findElement(By.xpath("//*[@class='field-container gender-container'] //li //*[@index = '"+index+"']"));
     }
    private static WebElement addFirstName() {
        return SeleniumWebDriver.driver.findElement(By.xpath("//*[@id=\"first-name\"]"));
    }
    private static WebElement addLastName() {
        return SeleniumWebDriver.driver.findElement(By.xpath("//*[@id=\"last-name\"]"));
    }
    private static WebElement addStreetName() {
        return SeleniumWebDriver.driver.findElement(By.xpath("//*[@id=\"street\"]"));
    }
    private static WebElement addStreetNumber() {
        return SeleniumWebDriver.driver.findElement(By.xpath("//*[@id=\"street-number\"]"));
    }
    private static WebElement addZipCode() {
        return SeleniumWebDriver.driver.findElement(By.xpath("//*[@id=\"zip-code\"]"));
    }
    private static WebElement addCity() {
        return SeleniumWebDriver.driver.findElement(By.xpath("//*[@id=\"city\"]"));
    }
    private static WebElement selectCountryDD() {
        return SeleniumWebDriver.driver.findElement(By.xpath("//*[@id=\"incoice-country-container\"]/div[2]/div/div"));
    }
    private static WebElement selectCountryPortugal() {
        return SeleniumWebDriver.driver.findElement(By.xpath("//*[@class=\"country_DE\"]"));
    }
    private static WebElement addEmail() {
        return SeleniumWebDriver.driver.findElement(By.xpath("//*[@id=\"email\"]"));
    }
    //Date
    private static WebElement getDataDD() {
        return SeleniumWebDriver.driver.findElement(By.xpath("//*[@id='invoice-day-container'] //a"));
    }
    private static WebElement getDataSelect(String index) {
        return SeleniumWebDriver.driver.findElement(By.xpath("//*[@id='invoice-day-container'] //li //a[@index='"+index+"']"));
    }
    //Month
    private static WebElement getMonthDD() {
        return SeleniumWebDriver.driver.findElement(By.xpath("//*[@id='invoice-month-container'] //a"));
    }
    private static WebElement getMonthSelect(String index) {
        return SeleniumWebDriver.driver.findElement(By.xpath("//*[@id='invoice-month-container'] //li //a[@index='"+index+"']"));
    }
    //Year
    private static WebElement getYearDD() {
        return SeleniumWebDriver.driver.findElement(By.xpath("//*[@id='invoice-year-container'] //a"));
    }
    private static WebElement getYearSelect(String index) {
        return SeleniumWebDriver.driver.findElement(By.xpath("//*[@id='invoice-year-container'] //li //a[@index='"+index+"']"));
    }
    private static WebElement selectMyBillingAddressRB() {
        return SeleniumWebDriver.driver.findElement(By.id("delivery-address-invoice"));
    }
    //Privacy Checkbox
    private static WebElement getPrivacyCheckbox() {
        return SeleniumWebDriver.driver.findElement(By.id("privacy"));
    }


    static public void fillBillingAddress() {
        selectGenderDD().click();
        selectGender("2").click();
        addFirstName().sendKeys("Atanas");
        addLastName().sendKeys("test");
        addStreetName().sendKeys("Strelitzer"); ;
        addStreetNumber().sendKeys("56");
        addZipCode().sendKeys("10115");
        addCity().sendKeys("Berlin");
        selectCountryDD().click();
        selectCountryPortugal().click();
        addEmail().sendKeys("somebodyemail@example.com");
        getDataDD().click();
        getDataSelect("3").click();
        getMonthDD().click();
        getMonthSelect("3").click();
        getYearDD().click();
        getYearSelect("20").click();
        getPrivacyCheckbox().click();
        selectMyBillingAddressRB().click();



    }



}
