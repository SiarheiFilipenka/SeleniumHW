package class01HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2 {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        driver.findElement(By.name("ctl00$MainContent$username")).sendKeys("Tester");
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");

        System.out.println("The title of the page is : " + driver.getTitle());

        if (driver.getTitle().equals("Web Orders Login")) {
            System.out.println("The title of the page is correct");
        } else {
            System.out.println("The title is incorrect");
        }
    }
}
