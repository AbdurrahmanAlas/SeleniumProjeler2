import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ActionClasses {


    static WebDriver driver;


    @BeforeClass
    public static void setUp() {
        //1. Launch browser
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //2. Navigate to url 'http://automationexercise.com'
        driver.get("http://automationexercise.com");


    }


    @Test
    public void test01() {




        //3. Click on 'Signup / Login' button
        driver.findElement(By.xpath("//a[@href=\"/login\"]")).click();


        //4. Enter name and email address



        //5. Click 'Signup' button
        //6. Fill details: Title, Name, Email, Password, Date of birth
        //7. Select checkbox 'Sign up for our newsletter!'
        //8. Select checkbox 'Receive special offers from our partners!'
        //9. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
        //10. Click 'Create Account button'
        //11. Verify that 'ACCOUNT CREATED!' is visible

    }
}