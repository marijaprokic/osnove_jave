package d14_06_2022_TestNg;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;
import java.time.Duration;
import java.util.List;

public class BootstrapTableTests {
    private WebDriver driver;
    String baseUrl = "https://s.bootsnipp.com";

    @BeforeClass
    public void beforeClass() {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @BeforeMethod
    public void beforeMethod() {
        driver.get(baseUrl);
    }


    @Test
    public void editRow() {
        String firstName = "Marija";
        String lastName = "Prokić";
        String middleName = "Dušanka";
        driver.get(baseUrl + "/iframe/K5yrx");
        Assert.assertEquals(driver.getTitle(),
                "Table with Edit and Update Data - Bootsnipp.com",
                "[ERROR] Page title should be 'Table with Edit and Update Data - Bootsnipp.com'");
        driver.findElement(By.xpath("//button[@class='update btn btn-warning btn-sm']")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("modal-header")));
        WebElement ime = driver.findElement(By.id("fn"));
        ime.clear();
        WebElement prezime = driver.findElement(By.id("ln"));
        prezime.clear();
        WebElement srednjeIme = driver.findElement(By.id("mn"));
        srednjeIme.clear();
        driver.findElement(By.id("fn")).sendKeys(firstName);
        driver.findElement(By.id("ln")).sendKeys(lastName);
        driver.findElement(By.id("mn")).sendKeys(middleName);
        driver.findElement(By.id("up")).click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("modal-header")));
        Assert.assertEquals(driver.findElement(By.id("f1")).getText(),
                "Marija",
                "[ERROR] First name table data field does not contain 'Marija'");
        Assert.assertEquals(driver.findElement(By.id("l1")).getText(),
                "Prokić",
                "[ERROR] Last name table data field does not contain 'Prokić'");
        Assert.assertEquals(driver.findElement(By.id("m1")).getText(),
                "Dušanka",
                "[ERROR] Middle name table data field does not contain 'Dušanka'");
    }

    @Test
    public void deleteRow() {
        String firstName = "Marija";
        String lastName = "Prokić";
        String middleName = "Dušanka";

        driver.get(baseUrl + "/iframe/K5yrx");
        Assert.assertEquals(driver.getTitle(),
                "Table with Edit and Update Data - Bootsnipp.com",
                "[ERROR] Page title should be 'Table with Edit and Update Data - Bootsnipp.com'");
        driver.findElement(By.xpath("//button[@class='delete btn btn-danger btn-sm']")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("del")));
        driver.findElement(By.id("del")).click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("del")));
        List<WebElement> nizRedova = driver.findElements(By.xpath("//*[contains(text(),'Marija')]"));
        Assert.assertEquals(nizRedova.size(),
                0,
               "[ERROR] The row is not deleted");
    }

    @Test
    public void TakeAScreenshot() throws IOException {
        driver.get(baseUrl + "/iframe/K5yrx");
        Assert.assertEquals(driver.getTitle(),
                "Table with Edit and Update Data - Bootsnipp.com",
                "[ERROR] Page title should be 'Table with Edit and Update Data - Bootsnipp.com'");
        TakesScreenshot scrShot =((TakesScreenshot)driver);
        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
        File DestFile=new File("src/main/resources/nazivslike.png");
        FileHandler.copy(SrcFile, DestFile);

    }


    @AfterClass
    public void afterClass() {
        driver.quit();
    }

}
