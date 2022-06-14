package d10_06_2022;
//1.Zad
//        Napisati program koji:
//        Ucitava stranicu https://s.bootsnipp.com/iframe/Dq2X
//        Klikce na svaki iks da ugasi obavestenje i proverava da li se
//        nakon klika element obrisao sa stranice i ispisuje odgovarajuce poruke
//        (OVO JE POTREBNO RESITI KORISCENJEM PETLJE)
//        POMOC: Brisite elemente odozdo.
//        (ZA VEZBANJE)Probajte da resite da se elemementi brisu i odozgo

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Zadatak1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.get("https://s.bootsnipp.com/iframe/Dq2X");
        List<WebElement> niz = driver.findElements(By.xpath("//button[@class='close']"));

        for (int i = niz.size()-1; i >= 0; i--) {
            driver.findElements(By.xpath("//button[@class='close']")).get(i).click();
            Thread.sleep(1000);
            if (daLiElementPostoji(driver, By.xpath("//button[@class='close']"))) {
                System.out.println("Obaveštenje sa indeksom " + i + " je zatvoreno!");
            } else {
                System.out.println("Obaveštenje sa indeksom " + i + " nije zatvoreno!");
            }
        }
        driver.quit();

    }

    public static boolean daLiElementPostoji(WebDriver driver, By by) {
        boolean elementPostoji = true;
        try {
            driver.findElement(by);
        } catch (Exception e) {
            elementPostoji = false;
        }
        return elementPostoji;
    }
}
