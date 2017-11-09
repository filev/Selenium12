import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class Exercise7 {
    private WebDriver driver;

    @BeforeClass
    public void driverSetup()
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\dfilev\\AAA_DFpersonal\\SeleniumBarantsev\\Selenium12\\src\\test\\resources\\chromedriver.exe");
    }

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
    }


    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

   //Sidebar click all links

    @Test
    public void Ex7() {
        driver.get("http://localhost/litecart/admin/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath(".//input[@name='username']")).sendKeys("admin");
        driver.findElement(By.xpath(".//input[@name='password']")).sendKeys("admin");
        driver.findElement(By.xpath(".//button[@name='login']")).click();
        driver.findElement(By.xpath(".//span[@class='name']")).click();
        driver.findElement(By.xpath(".//div[@id='box-apps-menu-wrapper']//span[@class='name']")).click();
        driver.findElement(By.xpath(".//li[@id='doc-template']//span[@class='name']")).click();
        driver.findElement(By.xpath(".//li[@id='doc-logotype']")).click();
        driver.findElement(By.xpath(".//li[@id='app-'][2]//span[@class='name']")).click();
        driver.findElement(By.xpath(".//li[@id='doc-catalog']//span[@class='name']")).click();
        driver.findElement(By.xpath(".//li[@id='doc-product_groups']//span[@class='name']")).click();
        driver.findElement(By.xpath(".//li[@id='doc-option_groups']//span[@class='name']")).click();
        driver.findElement(By.xpath(".//li[@id='doc-manufacturers']//span[@class='name']")).click();
        driver.findElement(By.xpath(".//li[@id='doc-suppliers']//span[@class='name']")).click();
        driver.findElement(By.xpath(".//li[@id='doc-delivery_statuses']//span[@class='name']")).click();
        driver.findElement(By.xpath(".//li[@id='doc-sold_out_statuses']//span[@class='name']")).click();
        driver.findElement(By.xpath(".//li[@id='doc-quantity_units']//span[@class='name']")).click();
        driver.findElement(By.xpath(".//li[@id='doc-csv']//span[@class='name']")).click();
        driver.findElement(By.xpath(".//li[@id='app-'][@class='selected']//span[@class='name']")).click();
        driver.findElement(By.xpath(".//li[@id='app-'][@class='selected']//span[@class='name'][1]")).click();
        driver.findElement(By.xpath(".//li[@id='app-'][5]//span[@class='name']")).click();
        driver.findElement(By.xpath(".//li[@id='app-'][6]//span[@class='name']")).click();
        driver.findElement(By.xpath(".//li[@id='app-'][7]//span[@class='name']")).click();
        driver.findElement(By.xpath(".//li[@id='doc-languages']//span[@class='name']")).click();
        driver.findElement(By.xpath(".//li[@id='doc-storage_encoding']//span[@class='name']")).click();
        driver.findElement(By.xpath(".//li[@id='app-'][8]//span[@class='name']")).click();
        driver.findElement(By.xpath(".//li[@id='doc-jobs']//span[@class='name']")).click();
        driver.findElement(By.xpath(".//li[@id='doc-customer']//span[@class='name']")).click();
        driver.findElement(By.xpath(".//li[@id='doc-shipping']")).click();
        driver.findElement(By.xpath(".//li[@id='doc-payment']")).click();
        driver.findElement(By.xpath(".//li[@id='doc-order_total']")).click();
        driver.findElement(By.xpath(".//li[@id='doc-order_success']")).click();
        driver.findElement(By.xpath(".//li[@id='doc-order_action']")).click();
        driver.findElement(By.xpath(".//li[@id='app-'][9]//span[@class][2]")).click();
        driver.findElement(By.xpath(".//li[@id='doc-orders']//span[@class='name']")).click();
        driver.findElement(By.xpath(".//li[@id='doc-order_statuses']//span[@class='name']")).click();
        driver.findElement(By.xpath(".//li[@id='app-'][10]//span[@class='name']")).click();
        driver.findElement(By.xpath(".//li[@id='app-'][11]//span[@class='name']")).click();
        driver.findElement(By.xpath(".//li[@id='doc-most_sold_products']//span[@class='name']")).click();
        driver.findElement(By.xpath(".//li[@id='doc-most_shopping_customers']//span[@class='name']")).click();
        driver.findElement(By.xpath(".//li[@id='app-'][12]//span[@class='name']")).click();
        driver.findElement(By.xpath(".//li[@id='doc-store_info']//span[@class='name']")).click();
        driver.findElement(By.xpath(".//li[@id='doc-defaults']//span[@class='name']")).click();
        driver.findElement(By.xpath(".//li[@id='doc-general']//span[@class='name']")).click();
        driver.findElement(By.xpath(".//li[@id='doc-listings']//span[@class='name']")).click();
        driver.findElement(By.xpath(".//li[@id='doc-images']//span[@class='name']")).click();
        driver.findElement(By.xpath(".//li[@id='doc-checkout']//span[@class='name']")).click();
        driver.findElement(By.xpath(".//li[@id='doc-advanced']//span[@class='name']")).click();
        driver.findElement(By.xpath(".//li[@id='doc-security']//span[@class='name']")).click();
        driver.findElement(By.xpath(".//li[@id='app-'][13]//span[@class='name']")).click();
        driver.findElement(By.xpath(".//li[@id='app-'][14]//span[@class='name']")).click();
        driver.findElement(By.xpath(".//li[@id='doc-tax_classes']//span[@class='name']")).click();
        driver.findElement(By.xpath(".//li[@id='doc-tax_rates']//span[@class='name']")).click();
        driver.findElement(By.xpath(".//li[@id='app-'][15]//span[@class='name']")).click();
        driver.findElement(By.xpath(".//li[@id='doc-search']//span[@class='name']")).click();
        driver.findElement(By.xpath(".//li[@id='doc-scan']//span[@class='name']")).click();
        driver.findElement(By.xpath(".//li[@id='doc-csv']//span[@class='name']")).click();
        driver.findElement(By.xpath(".//li[@id='app-'][16]//span[@class='name']")).click();
        driver.findElement(By.xpath(".//li[@id='app-'][17]//span[@class='name']")).click();
        driver.findElement(By.xpath(".//li[@id='doc-vqmods']//span[@class='name']")).click();

    }
}
