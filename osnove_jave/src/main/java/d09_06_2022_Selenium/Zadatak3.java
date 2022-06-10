package d09_06_2022_Selenium;
//3.Zadatak (Za vezbanje)
//        Napisati program koji matematicku formulu koju korisnik unese izvrsaav na stranici:
//        Ucitati stranicu https://www.calculatorsoup.com/calculators/math/basic.php
//        Korisnik unosi formulu, samo osnovne matematicke operacija, npr:
//        1243+329=
//        21912-4=
//        12913÷4=
//        U programu se formula unosi kao jedan string i potrebno je razbiti formulu na karaktere.
//        Za to imate metodu https://www.geeksforgeeks.org/convert-a-string-to-a-list-of-characters-in-java/
//        Zatim u odnosu na karakter uradite odredjenu logiku

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
      //  driver.manage().window().maximize();
        driver.navigate().to("https://www.calculatorsoup.com/calculators/math/basic.php");
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite izraz: ");
        String izraz = s.next();
        List<Character> nizKaraktera = new ArrayList<Character>();

        for (char ch : izraz.toCharArray()) {
            nizKaraktera.add(ch);
        }
        for (int i = 0; i < nizKaraktera.size(); i++) {
            System.out.println(nizKaraktera.get(i));
        }
        char c1 = '1';
        char c2 = '2';
        char c3 = '3';
        char c4 = '4';
        char c5 = '5';
        char c6 = '6';
        char c7 = '7';
        char c8 = '8';
        char c9 = '9';
        char c0 = '0';
        char c10 = '+';
        char c11 = '-';
        char c12 = '*';
        char c13 = '/';
        for (int i = 0; i < nizKaraktera.size(); i++) {
            if (nizKaraktera.get(i).equals(c1)) {
                driver.findElement(By.xpath("//input[@name ='one']")).click();
            }
            else if (nizKaraktera.get(i).equals(c2)) {
                driver.findElement(By.xpath("//input[@name ='two']")).click();
            }
            else  if (nizKaraktera.get(i).equals(c3)) {
                driver.findElement(By.xpath("//input[@name ='three']")).click();
            }
            else if (nizKaraktera.get(i).equals(c4)) {
                driver.findElement(By.xpath("//input[@name ='four']")).click();
            }
            if (nizKaraktera.get(i).equals(c5)) {
                driver.findElement(By.xpath("//input[@name ='five']")).click();
            }
            else if (nizKaraktera.get(i).equals(c6)) {
                driver.findElement(By.xpath("//input[@name ='six']")).click();
            }
            else if (nizKaraktera.get(i).equals(c7)) {
                driver.findElement(By.xpath("//input[@name ='seven']")).click();
            }
            else if (nizKaraktera.get(i).equals(c8)) {
                driver.findElement(By.xpath("//input[@name ='eight']")).click();
            }
            else if (nizKaraktera.get(i).equals(c9)) {
                driver.findElement(By.xpath("//input[@name ='nine']")).click();
            }
            else if (nizKaraktera.get(i).equals(c0)) {
                driver.findElement(By.xpath("//input[@name ='zero']")).click();
            }
            else if (nizKaraktera.get(i).equals(c10)) {
                driver.findElement(By.xpath("//input[@name ='add']")).click();
            }
            else if (nizKaraktera.get(i).equals(c11)) {
                driver.findElement(By.xpath("//input[@name ='subtract']")).click();
            }
            else if (nizKaraktera.get(i).equals(c12)) {
                driver.findElement(By.xpath("//input[@name ='multiply']")).click();
            }
            else if (nizKaraktera.get(i).equals(c13)) {
                driver.findElement(By.xpath("//input[@name ='divide']")).click();
            }
        }
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@name ='calculate']")).click();
        Thread.sleep(1000);
        driver.quit();
    }
}