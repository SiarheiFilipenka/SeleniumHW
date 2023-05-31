package class05HomeWork;

import Utils.CommonMethods;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HW1 extends CommonMethods {
    public static void main(String[] args) {

        String url = "http://practice.syntaxtechs.net/javascript-alert-box-demo.php";
        String browser = "chrome";
        openBrowserAndNavigateToURL(url, browser);

        WebElement alertBtn = driver.findElement(By.xpath("//button[@onclick = 'myPromptFunction()']"));
        alertBtn.click();

        Alert confirmationAlert = driver.switchTo().alert();
        confirmationAlert.sendKeys("Hello Moazzam");
        confirmationAlert.accept();
    }
}
