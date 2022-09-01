import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

            driver.get("https://www.livejournal.com/");

            WebElement webElement1 = driver.findElement(By.xpath(".//a[contains(@class, 's-header-item__link--login')]"));
            webElement1.click();

            WebElement webElement2 = driver.findElement(By.xpath(".//input[@id='user']"));
            webElement2.sendKeys("julie272");

            WebElement webElement3 = driver.findElement(By.xpath(".//input[@id='lj_loginwidget_password']"));
            webElement3.sendKeys("1375Uyt446Ri");

            WebElement webElement4 = driver.findElement(By.xpath(".//button[@class='b-loginform-btn b-loginform-btn--login b-loginform-btn--auth b-loginform-btn--center']"));
            webElement4.click();

            //driver.quit();

        }
    }
