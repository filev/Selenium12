import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PartTU {
    private WebDriver driver;

    @BeforeClass
    public void driverSetup()
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\dfilev\\AAA_DFpersonal\\SeleniumBarantsev\\Selenium12\\src\\test\\resources\\chromedriver.exe");
    }

    //Check Admin Login with valid Data

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void TestTU1() {
        driver.get("http://localhost/litecart/admin/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin");
        driver.findElement(By.xpath("//button[@name='login']")).click();
    }

    //Check Customer Login with invalid Data

    @Test
    public void TestTU2() {
        driver.get("http://localhost/litecart/admin/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("brak");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("brak");
        driver.findElement(By.xpath("//button[@name='login']")).click();
    }

    //Test Link opening (active) in tab/window as per requirement

    @Test
    public void TestTU3() {
        driver.get("http://localhost/litecart/admin/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin");
        driver.findElement(By.xpath("//button[@name='login']")).click();
        driver.findElement(By.xpath("//span[@class='name']")).click();
    }
}

