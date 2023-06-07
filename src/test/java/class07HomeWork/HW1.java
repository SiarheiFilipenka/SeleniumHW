package class07HomeWork;

import Utils.CommonMethods;
import Utils.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HW1 extends CommonMethods {
    public static void main(String[] args) {

        String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
        String browser = "chrome";
        openBrowserAndNavigateToURL(url, browser);

        WebElement userNameTextBox = driver.findElement(By.xpath("//input[@id='txtUsername']"));
        sendText(Constants.SYNTAX_HRM_USERNAME, userNameTextBox);

        WebElement passwordTextBox = driver.findElement(By.xpath("//input[@id='txtPassword']"));
        sendText(Constants.SYNTAX_HRM_PASSWORD, passwordTextBox);

        WebElement loginBtn = driver.findElement(By.xpath("//input[@id='btnLogin']"));
        loginBtn.click();

        WebElement pimBtn = driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']"));
        pimBtn.click();

        List<WebElement> allId = driver.findElements(By.xpath("//table/tbody/tr/td[2]"));

        for (int i = 0; i < allId.size(); i++) {
            String idNo = allId.get(i).getText();
            if (idNo.equals("53360A")) {
                System.out.println("Row number of 53360A id is : " + (i + 1));
                break;
            }
        }
    }
}