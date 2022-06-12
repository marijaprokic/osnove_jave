package d10_06_2022;
//2.Zadatak
//        Napisati program koji ucitava stranicu https://geodata.solutions/
//        Bira proizvoljan Country, State i City
//        Pritom potrebno je izvrsiti cekanje da se povaje State-ovi nakon izbora Country-a
//        I takodje je potrebno izvrsiti cekanje da se ucitaju gradovi nakon izbora State-a
//        Izabrerit Country, State i City tako da imate podatke da selektujete!

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Random;

public class Zadatak2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       // driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.get("https://geodata.solutions/");

        Select select1 = new Select(driver.findElement(By.id("countryId")));
        List<WebElement> zemlje = select1.getOptions();
        Random random1 = new Random();
        int indeksZemlja = random1.nextInt(zemlje.size());
        select1.selectByIndex(indeksZemlja);
        Thread.sleep(1000);

        Select select2 = new Select(driver.findElement(By.id("stateId")));
        List<WebElement> drzava = select2.getOptions();
        Random random2 = new Random();
        int indeksDrzava= random2.nextInt(drzava.size());
        select2.selectByIndex(indeksDrzava);
        Thread.sleep(1000);

        Select select3 = new Select(driver.findElement(By.id("cityId")));
        List<WebElement> gradovi = select3.getOptions();
        Random random3 = new Random();
        int indeksGrad = random3.nextInt(gradovi.size());
        select3.selectByIndex(indeksGrad);
        Thread.sleep(1000);

        driver.quit();

    }
}
