import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Part1 {

    private WebDriver driver;

    @BeforeClass
    public void driverSetup()
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\dfilev\\AAA_DFpersonal\\SeleniumBarantsev\\Selenium12\\src\\test\\resources\\chromedriver.exe");
    }

    /*
     * Navigate to "gmail.com"
     * Maximize the window
     * Enter the "selenium" into the search bar
     * Click the ‘Google Search’ button.
     * Click the 'Back' button
     * Refresh the page
     * Close the web page
     */

    @Test
    public void MyFirst() {
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("lst-ib")).sendKeys("selenium");
        driver.findElement(By.xpath("//input[@name='btnK']"));
        driver.navigate().back();
        driver.navigate().refresh();
        driver.quit();
    }
}
