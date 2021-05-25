import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class VyTrack {

    public static void main(String[] args) throws InterruptedException {
        TruckDriver("User154", "UserUser123");
        /**Please Create Your role Method and push the code.
         Don't scare to play with git up. I'm have back up :))
         */
    }

    public static void TruckDriver(String username1, String password1) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        // 1. Open Chrome browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2. Given I am on login page : https://qa3.vytrack.com/user/login
        driver.get("https://qa3.vytrack.com/user/login");

        //3. When I enter valid Truck Driver User name : User154
        WebElement username = driver.findElement(By.xpath("//input[@id='prependedInput']"));
        username.click();
        username.sendKeys(username1);

        //5. And I enter valid Password for user User154 : UserUser123
        WebElement password = driver.findElement(By.xpath("//input[@id='prependedInput2']"));
        password.click();
        password.sendKeys(password1);
        //6. And Click Login button
        WebElement loginButton = driver.findElement(By.xpath("//button[@id='_submit']"));
        loginButton.click();
        Thread.sleep(2000);
        //7. Then I should be able to log in to the application : Verify Login
        String expectedTitle = "Dashboard";
        String actualTitle = driver.getTitle();
        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Login Successfully for User");
        } else {
            System.out.println("Login is not success");
        }
    }

}


