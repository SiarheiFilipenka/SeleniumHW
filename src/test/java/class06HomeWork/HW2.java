package class06HomeWork;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class HW2 extends CommonMethods {
    public static void main(String[] args) {

        String url = "http://practice.syntaxtechs.net/dynamic-data-loading-demo.php";
        String browser = "chrome";
        openBrowserAndNavigateToURL(url, browser);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        WebElement getNewUser = driver.findElement(By.xpath("//button[text()='Get New User']"));
        getNewUser.click();

        WebElement firstName = driver.findElement(By.xpath("//p[contains(text(), 'First Name')]"));

        System.out.println(firstName.getText().substring(13));
    }
}