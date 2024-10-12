import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class WebTest {
    @Test
    public void webTest() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.co.uk/");

        WebDriver fireFox = new FirefoxDriver();
        fireFox.get("https://www.google.co.uk/");
    }
}
