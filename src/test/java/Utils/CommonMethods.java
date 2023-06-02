package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CommonMethods {

    public static WebDriver driver;

    public static void openBrowserAndNavigateToURL(String URL, String browser) {

        switch (browser) {
            case "chrome":
                driver = new ChromeDriver();
                break;
            case "firefox":
                driver = new FirefoxDriver();
                break;
        }
        driver.manage().window().maximize();
        driver.get(URL);
    }

    public static void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }

    public static void sendText(String text, WebElement element) {
        element.clear();
        element.sendKeys(text);
    }

    public static void selectFromDropdown(WebElement dd, String visibleText) {
        Select sel = new Select(dd);
        sel.selectByVisibleText(visibleText);
    }

    public static void selectFromDropdown(String value, WebElement dd) {
        Select sel = new Select(dd);
        sel.selectByValue(value);
    }

    public static void selectFromDropdown(WebElement dd, int index) {
        Select sel = new Select(dd);
        sel.selectByIndex(index);
    }
}