import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumWebDriver extends Tools{
    static WebDriver driver;

    public static void setUp(String testUrl) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kr1z3x\\Desktop\\Pragmatic\\Drivers\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setBinary("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
        options.addArguments("--start-maximized", "--disable-extensions");
        driver = new ChromeDriver(options);
        driver.get(testUrl);
    }


    public static WebDriver getDriver() {
        return driver;
    }
}
