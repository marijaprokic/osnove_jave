package d13_06_2022_Selenium;
//Napisati program koji ima:
// Podesava:
//        implicitno cekanje za trazenje elemenata od 10s
//        implicitno cekanje za ucitavanje stranice od 10s
//        eksplicitno cekanje podeseno na 10s
//        Podaci:
//        Potrebno je u projektu ukljuciti 4 slike.
//        Imenovanje slika neka bude po pravilu pozicija_ime_prezime_polaznika.ekstenzija
//        Npr: front_milan_jovanovic.jpg, left_milan_jovanovic.jpg …
//        Koraci:
//        Ucitava stranicu https://boomf.com/apps/proxy/boomf-bomb/i-bloody-love-you
//        Maksimizuje prozor
//        Selektuje Image - Front klikom na tu karticu u dnu ekrana
//        Klik na add photo iz levog navigacionog menia
//        Upload slike. Upload preko File objekta koristeci getAbsolutePath
//        Sacekati da broj prikazanih slika u donjem uglu navigacije bude za 1 veca
//        Kliknuti na poslednje dodatu sliku kako bi bila izabrana za postavljenje
//        Ceka da dijalog bude vidljiv
//        Klik na Use One Side Only dugme
//        Ponoviti proces za Left, Right i Back
//        Zatim iz desnog gornjeg ugla izabrati random jedan od ponudjenih konfeta
//        Kliknuti na Add To Cart dugme
//        Verifikovati postojanje greske Oops! It looks like you`ve not added an text to this field, please add one before continuing.
//        Xpath: //*[@action='error']
//        Zatvorite pretrazivac

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.time.Duration;

public class Zadatak1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

        driver.get("https://boomf.com/apps/proxy/boomf-bomb/i-bloody-love-you");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//img[@class='sc-ezWOiH fendym']")).click();
        driver.findElement(By.xpath("//div[contains(text(), '+ Add photo')]")).click();

        File slika1 = new File("src/main/resources/Front_Marija_Prokic.jpg");
        driver.findElement(By.id("imageUpload")).sendKeys(slika1.getAbsolutePath());
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//div[@class='sc-gKXOVf haLJiC']"), 1));

        driver.findElement(By.xpath("//img[@loading='lazy']")).click();
        driver.findElement(By.xpath("//button [contains (text(), 'Use One Side Only')]")).click();

        driver.findElement(By.xpath("//img[@alt='image 2']")).click();
        driver.findElement(By.xpath("//div[contains(text(), '+ Add photo')]")).click();

        File slika2 = new File("src/main/resources/Left_Marija_Prokic.jpg");
        driver.findElement(By.id("imageUpload")).sendKeys(slika2.getAbsolutePath());

        wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//div[@class='sc-gKXOVf haLJiC']"), 2));
        driver.findElement(By.xpath("//div[contains(@class, 'sc-ftvSup kAzmBp')]/div[last()]/div/img")).click();
        driver.findElement(By.xpath("//button [contains (text(), 'Use One Side Only')]")).click();

        driver.findElement(By.xpath("//img[@alt='image 3']")).click();
        driver.findElement(By.xpath("//div[contains(text(), '+ Add photo')]")).click();

        File slika3 = new File("src/main/resources/Right_Marija_Prokic.jpg");
        driver.findElement(By.id("imageUpload")).sendKeys(slika3.getAbsolutePath());

        wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//div[@class='sc-gKXOVf haLJiC']"), 3));
        driver.findElement(By.xpath("//div[contains(@class, 'sc-ftvSup kAzmBp')]/div[last()]/div/img")).click();
        driver.findElement(By.xpath("//button [contains (text(), 'Use One Side Only')]")).click();

        driver.findElement(By.xpath("//img[@alt='image 4']")).click();
        driver.findElement(By.xpath("//div[contains(text(), '+ Add photo')]")).click();

        File slika4 = new File("src/main/resources/Back_Marija_Prokic.jpg");
        driver.findElement(By.id("imageUpload")).sendKeys(slika4.getAbsolutePath());

        wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//div[@class='sc-gKXOVf haLJiC']"), 4));
        driver.findElement(By.xpath("//div[contains(@class, 'sc-ftvSup kAzmBp')]/div[last()]/div/img")).click();
        driver.findElement(By.xpath("//button [contains (text(), 'Use One Side Only')]")).click();

        driver.findElement(By.xpath("//div[@class='sc-jhzXDd hzjUi']")).click();
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        WebElement popup = driver.findElement(By.xpath("//*[@action='error']"));
        if (popup.getAttribute("action").equals("error")) {
            System.out.println("Postoji greška!");
        } else {
            System.out.println("Ne postoji greška! ");
        }

        driver.quit();
    }
}
