import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class RegisterTest {


    // Gerekli setup islemlerini kuralim
    // https://www.automationexercise.com/ sayfasina gidelim
    // signUp linkine tiklayalim
    // name ve email adress kismina bilgiler gondererek uye olalim
    // uye olundugunu test edelim
    WebDriver driver;
    @Before
    public void setUp(){

        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //SignUp linkine tıklayalim
        driver.findElement(By.xpath("//a[text()=' Signup / Login']")).click();
        String expectedUrl="https://www.automationexercise.com/login";
        String actualUrl=driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);




    }

    @After
    public void tearDown(){


    }

    public  void  positive_scenario(){

        // name ve email adress kismina bilgiler gondererek uye olalim
        WebElement nameBox=driver.findElement(By.xpath("//input[@type='text']"));
        nameBox.sendKeys("Abdurrahman");
        WebElement emailBox=driver.findElement(By.xpath("(//input[@type='email'])[2]"));
        emailBox.sendKeys("abdurrahman@gmail.com");
        driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
        WebElement enterAccountText=driver.findElement(By.xpath("//*[text()='Enter Account Information']"));
        Assert.assertTrue(enterAccountText.isDisplayed());


    }

    @Test
    public  void negative_scenario(){

        //name kısmına as jd dg gibi kısa kelimeler yazilmasin
        WebElement nameBox=driver.findElement(By.xpath("//input[@type='text']"));
        nameBox.sendKeys("as");
        //.com olmalı
        WebElement emailBox=driver.findElement(By.xpath("(//input[@type='email'])[2]"));
        emailBox.sendKeys("abdurrahman@gmailcom");
        //kayıtola tikla
        driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();

        WebElement newUserText=driver.findElement(By.xpath("//*[text()='New User Signup!']"));

        Assert.assertTrue(newUserText.isDisplayed());



    }

    @Test
    public void olumsuzSeneryo2(){
        WebElement nameBox= driver.findElement(By.xpath("//input[@type='text']"));
        nameBox.sendKeys("nevzat");
        WebElement emailBox=driver.findElement(By.xpath("(//input[@type='email'])[2]"));
        emailBox.sendKeys("nevzat@gmailcom");
        driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
        WebElement enterAccountText= driver.findElement(By.xpath("//*[text()='Enter Account Information']"));
        Assert.assertFalse(enterAccountText.isDisplayed());
    }



}
