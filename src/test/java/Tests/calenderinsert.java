package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class calenderinsert {

    public static   WebDriver driver;
    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\IdeaProjects\\TestingGitHubFromLocal\\src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sarasotasheriff.org/arrest-reports/index.php");
        driver.manage().window().maximize();

    }

    @Test
    public void test1() {

        //waitForElement(By.xpath("//button[@type='submit']"),50);
        // driver.findElement(By.xpath("/html/body/section/div[2]/div[1]/form/div[2]/div/input")).click();
    }
}

