package class01HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.manage().window().maximize();
        driver.findElement(By.id("customer.firstName")).sendKeys("John");
        driver.findElement(By.id("customer.lastName")).sendKeys("Wick");
        driver.findElement(By.name("customer.address.street")).sendKeys("1000 N Main st");
        driver.findElement(By.name("customer.address.city")).sendKeys("Austin");
        driver.findElement(By.id("customer.address.state")).sendKeys("TX");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("78000");
        driver.findElement(By.name("customer.phoneNumber")).sendKeys("512-123-4567");
        driver.findElement(By.name("customer.ssn")).sendKeys("1234-56-78");
        driver.findElement(By.id("customer.username")).sendKeys("username123");
        driver.findElement(By.id("customer.password")).sendKeys("123aBc!");
        driver.findElement(By.id("repeatedPassword")).sendKeys("123aBc!");
        Thread.sleep(5000);
        driver.quit();
    }
}