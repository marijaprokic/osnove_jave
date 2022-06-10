package p09_06_2022_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadatak2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/login/");
        driver.manage().window().maximize();
        driver
                .findElement(By.xpath("//input[@id='userName']"))
                .sendKeys("itbootcamp");

        driver
                .findElement(By.xpath("//input[@placeholder='Password']"))
                .sendKeys("ITBootcamp2021!");
        WebElement button = driver.findElement(By.xpath("//form[@id='userForm']/div[2]/div[2]/input"));
        button.click();
        Thread.sleep(5000);
        WebElement button1 = driver.findElement(By.xpath("//button[text()='Log out']"));
        button.click();
        driver.quit();
    }
}
