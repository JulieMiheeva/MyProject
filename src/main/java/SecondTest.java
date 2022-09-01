import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class SecondTest {
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

        WebElement webElement5 = driver.findElement(By.xpath(".//a[@href='https://www.livejournal.com/category/novye_lica/'][1]"));
        webElement5.click();

        WebElement webElement6 = driver.findElement(By.xpath(".//a[contains(@ng-href,'https://tandrei132.livejournal.com/336.html?media&ila_camaign=medius&ila_location=category_novye_lica&ila_context=novye_lica_block')][1]"));
        webElement6.click();

        WebElement webElement7 = driver.findElement(By.xpath(".//a[contains(@class, 's-header-item__link--235ideas')]"));
        webElement7.click();

        WebElement webElement8 = driver.findElement(By.xpath(".//span[contains(text(),'Напишите о новичках в ЖЖ и поддержите их')]"));
        webElement8.click();

        WebElement webElement9 = driver.findElement(By.xpath(".//span[contains(text(),'Напишите о планах блога на лето')]"));
        webElement9.click();

        WebElement webElement10 = driver.findElement(By.xpath(".//span[contains(text(),'Напишите пост о проектах марафона')]"));
        webElement10.click();

            //driver.quit();

        }
    }
