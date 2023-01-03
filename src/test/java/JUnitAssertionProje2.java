import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class JUnitAssertionProje2 {

    //1. Launch browser
     static  WebDriver driver;
    @BeforeClass
    public static void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //2. Navigate to url 'http://automationexercise.com'
        driver.get("http://automationexercise.com");



    }

    @AfterClass
    public  static void tearDown(){

        driver.close();
    }




    @Test
    public  void test01(){

        //3. Verify that home page is visible successfully
        WebElement homepage=driver.findElement(By.xpath("//i[@class=\"fa fa-home\"]"));

        Assert.assertTrue(homepage.isDisplayed());

        //4. Click on 'Products' button

        driver.findElement(By.xpath("//a[@href=\"/products\"]")).click();


        //5. Verify user is navigated to ALL PRODUCTS page successfully

        String expectedUrl="https://automationexercise.com/products";
        String actualUrl=driver.getCurrentUrl();

        Assert.assertEquals(expectedUrl,actualUrl);


        //6. Enter product name in search input and click search button

        WebElement searchbox=driver.findElement(By.xpath("//input[@id=\"search_product\"]"));
        searchbox.sendKeys("tshirt" );

        WebElement searchbutton=driver.findElement(By.xpath("//button[@id='submit_search']"));
        searchbutton.click();




        //7. Verify 'SEARCHED PRODUCTS' is visible

        WebElement aramayapildiElementi=driver.findElement(By.xpath("//h2[text()=\"Searched Products\"]"));
        Assert.assertTrue(aramayapildiElementi.isDisplayed());


        //8. close driver

    }




}
