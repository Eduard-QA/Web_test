import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class WebTest {
    WebDriver driver = new ChromeDriver();

    @BeforeMethod
    public void baseURL() {
        driver.get("https://www.google.co.uk/");
        driver.manage().window().fullscreen();

    }

    @Test
    public void webTest() {

        Assert.assertEquals(driver.getTitle(), "Google");
        driver.findElement(By.name("q")).sendKeys("duck");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);

    }

    @AfterMethod
    public void closeWindow(){
        driver.quit();
    }
}
