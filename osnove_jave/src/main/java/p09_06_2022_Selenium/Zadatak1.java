package p09_06_2022_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadatak1 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://cms.demo.katalon.com/");

        driver
                .findElement(By.xpath("//input[@name='s']"))
                .sendKeys("Flying Ninja");
        driver.manage().window().maximize();
        WebElement button = driver.findElement(By.xpath("//button[@class='search-submit'])"));
        button.click();
        Thread.sleep(5000);
        driver.quit();

    }

}
