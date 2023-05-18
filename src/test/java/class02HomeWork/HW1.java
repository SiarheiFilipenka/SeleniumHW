package class02HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();

        WebElement createBtn = driver.findElement(By.xpath("//a[text() = 'Create new account']"));
        createBtn.click();
        Thread.sleep(2000);

        WebElement firstNameTextBox = driver.findElement(By.xpath("//input[@name = 'firstname']"));
        firstNameTextBox.sendKeys("John");

        WebElement lastNameTextBox = driver.findElement(By.xpath("//input[@name = 'lastname']"));
        lastNameTextBox.sendKeys("Wick");

        WebElement mobileOrEmailTextBox = driver.findElement(By.xpath("//input[@aria-label = 'Mobile number or email']"));
        mobileOrEmailTextBox.sendKeys("512-123-4567");

        WebElement passwordTextBox = driver.findElement(By.xpath("//input[@aria-label = 'New password']"));
        passwordTextBox.sendKeys("1234QwEr!");

        WebElement month = driver.findElement(By.xpath("//select[@id = 'month']"));
        month.click();

        WebElement selectMonth = driver.findElement(By.xpath("//option[text() = 'Sep']"));
        selectMonth.click();

        WebElement day = driver.findElement(By.xpath("//select[@id = 'day']"));
        day.click();

        WebElement selectDay = driver.findElement(By.xpath("//option[text() = '2']"));
        selectDay.click();

        WebElement year = driver.findElement(By.xpath("//select[@id = 'year']"));
        year.click();

        WebElement selectYear = driver.findElement(By.xpath("//option[text() = '1968']"));
        selectYear.click();

        WebElement gender = driver.findElement(By.xpath("//label[text() = 'Male']"));
        gender.click();

        Thread.sleep(5000);

        driver.findElement(By.xpath("//img[@src = 'https://static.xx.fbcdn.net/rsrc.php/v3/yO/r/zgulV2zGm8t.png']")).click();
        Thread.sleep(2000);
        driver.quit();
    }
}