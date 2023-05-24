package class03HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2 {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login%E2%80%9D");

        WebElement userName = driver.findElement(By.cssSelector("input[name = 'txtUsername']"));
        userName.sendKeys("Admin");

        WebElement password = driver.findElement(By.cssSelector("input[name = 'txtPassword']"));
        password.sendKeys("qwer@1234");

        WebElement loginBtn = driver.findElement(By.cssSelector("input[id = 'btnLogin']"));
        loginBtn.click();
    }
}