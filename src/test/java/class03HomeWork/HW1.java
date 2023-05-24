package class03HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.syntaxtechs.net/input-form-demo.php");

        WebElement firstName = driver.findElement(By.cssSelector("input[name = 'first_name']"));
        firstName.sendKeys("John");

        WebElement lastName = driver.findElement(By.cssSelector("input[name = 'last_name']"));
        lastName.sendKeys("Galt");

        WebElement email = driver.findElement(By.cssSelector("input[name = 'email']"));
        email.sendKeys("johngalt@yahoo.com");

        WebElement phone = driver.findElement(By.cssSelector("input[name = 'phone']"));
        phone.sendKeys("123-456-7890");

        WebElement address = driver.findElement(By.cssSelector("input[name = 'address']"));
        address.sendKeys("1000 Main street");

        WebElement city = driver.findElement(By.cssSelector("input[name = 'city']"));
        city.sendKeys("Sun City");

        WebElement state = driver.findElement(By.xpath("//select[@name = 'state']"));
        state.click();

        WebElement stateOptions = driver.findElement(By.xpath("//option[text() = 'Texas']"));
        stateOptions.click();

        WebElement zipCode = driver.findElement(By.cssSelector("input[name = 'zip']"));
        zipCode.sendKeys("78000");

        WebElement website = driver.findElement(By.cssSelector("input[name = 'website']"));
        website.sendKeys("https://www.johngalt.com");

        WebElement radioBthYes = driver.findElement(By.xpath("//input[@value = 'yes']"));
        radioBthYes.click();

        WebElement projectDescription = driver.findElement(By.cssSelector("textarea[name = 'comment']"));
        projectDescription.sendKeys("This is a project description ");
    }
}