import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class ThirdTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("https://www.livejournal.com/");
        WebElement webElement1 = driver.findElement(By.xpath(".//a[contains(@class, 's-header-item__link--login')]"));
        webElement1.click();

        WebElement webElement2 = driver.findElement(By.xpath(".//input[@id='user']"));
        webElement2.sendKeys("julie272");

        WebElement webElement3 = driver.findElement(By.xpath(".//input[@id='lj_loginwidget_password']"));
        webElement3.sendKeys("1375Uyt446Ri");

        WebElement webElement4 = driver.findElement(By.xpath(".//button[@class='b-loginform-btn b-loginform-btn--login b-loginform-btn--auth b-loginform-btn--center']"));
        webElement4.click();

        Thread.sleep(1000);

        WebElement webElement5 = driver.findElement(By.xpath(".//span[contains(@class, 's-header-item-post--long')]"));
        webElement5.click();

        WebElement webElement6 = driver.findElement(By.xpath(".//textarea[contains(@class,'_y6')]"));
        webElement6.sendKeys("Heading");

        Thread.sleep(1000);

        WebElement webElement7 = driver.findElement(By.xpath(".//div[contains(@class,'aentry-post__block--unstyled aentry-post__block-with-sidebar')]"));
        webElement7.sendKeys("Some random words here :)");

        WebElement webElement8 = driver.findElement(By.xpath(".//span[contains(@class,'_123')][1]"));
        webElement8.click();

        WebElement webElement9 = driver.findElement(By.xpath(".//span[contains(text(),'Настроить и опубликовать')]"));
        webElement9.click();

        //driver.quit();

    }
}
