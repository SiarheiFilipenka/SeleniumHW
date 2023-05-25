package class04HomeWork;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import javax.swing.plaf.TableHeaderUI;

public class HW2 extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {

        String url = "https://www.facebook.com/";
        String browser = "chrome";
        openBrowserAndNavigateToURL(url, browser);

        WebElement createNewAccBtn = driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']"));
        createNewAccBtn.click();
        Thread.sleep(2000);

        WebElement month = driver.findElement(By.cssSelector("select[name='birthday_month']"));
        WebElement day = driver.findElement(By.cssSelector("select[name='birthday_day']"));
        WebElement year = driver.findElement(By.cssSelector("select[name='birthday_year']"));

        Select selectMonth = new Select(month);
        Select selectDay = new Select(day);
        Select selectYear = new Select(year);

        selectMonth.selectByIndex(4);
        Thread.sleep(2000);
        selectDay.selectByVisibleText("2");
        Thread.sleep(2000);
        selectYear.selectByValue("1989");
        Thread.sleep(2000);
    }
}