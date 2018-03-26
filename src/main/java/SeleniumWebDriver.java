import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumWebDriver extends Tools{
    static WebDriver driver;

    public static void setUp() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kr1z3x\\Desktop\\Pragmatic\\Drivers\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setBinary("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
        driver = new ChromeDriver(options);
    }


    public static WebDriver getDriver() {
        return driver;
    }
}
