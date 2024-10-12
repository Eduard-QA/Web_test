package Redrover.scool;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://mvnrepository.com");
        String title = driver.getTitle();
        System.out.println("Title page is: " + title);
        driver.quit();

        WebDriver fireFox = new FirefoxDriver();
        fireFox.get("https://www.google.co.uk/");
        String title1 = fireFox.getTitle();
        System.out.println("Title page is: " + title1);
        fireFox.quit();

    }
}