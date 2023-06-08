package class08HomeWork;

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

        WebElement recruitmentBtn = driver.findElement(By.xpath("//a[@id='menu_recruitment_viewRecruitmentModule']"));
        recruitmentBtn.click();

        WebElement calender = driver.findElement(By.xpath("//input[@id='candidateSearch_fromDate']"));
        calender.click();

        WebElement calenderMonth = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
        selectFromDropdown(calenderMonth, "May");

        WebElement calenderYear = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
        selectFromDropdown("1989", calenderYear);

        List<WebElement> calenderDays = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
        for (WebElement day : calenderDays) {
            if (day.getText().equals("2")) {
                day.click();
                break;
            }
        }
    }
}