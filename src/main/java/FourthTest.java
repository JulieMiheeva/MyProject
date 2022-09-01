import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class FourthTest {
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

        WebElement webElement5 = driver.findElement(By.xpath(".//span[contains(@class, 's-nav-item__name')]"));
        webElement5.click();

        WebElement webElement6 = driver.findElement(By.xpath(".//header[contains(@class, 'entryunit__head')]//a[contains(@href, '659.html')]"));
        webElement6.click();

        WebElement webElement7 = driver.findElement(By.xpath(".//*[local-name()='svg']/*[local-name()='path'][1]"));
        webElement7.click();

        WebElement webElement8 = driver.findElement(By.xpath(".//*[contains(text(),'Редактировать запись')]"));
        webElement8.click();

        WebElement webElement9 = driver.findElement(By.xpath(".//span[contains(@data-offset-key,'bkp6i-0-0')]"));
        webElement9.clear();

        WebElement webElement10 = driver.findElement(By.xpath(".//span[contains(@class,'_123')][1]"));
        webElement10.click();

        WebElement webElement11 = driver.findElement(By.xpath(".//span[contains(@data-offset-key,'bkp6i-0-0')]"));
        webElement11.sendKeys("  Some changes here!");

        WebElement webElement12 = driver.findElement(By.xpath(".//span[contains(text(),'Настроить и опубликовать')]"));
        webElement12.click();

        //driver.quit();
    }
}
