import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class DropdownMenuProje1 {

    WebDriver driver;
    // ilgili ayarlari yapip
    @Before
    public void  setUp(){

        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();

    }







    @Test
    public void  test(){

        //1) amazon anasayfaya gidin
        driver.get("https://www.amazon.com");
        //2) arama kutusu yanindaki dropdown menuden book secin


        //(((*** Dropdown menuden istedigimiz option'i secebilmek icin
        // oncelikle Select class'indan bir obje olusturmaliyiz
        // ancak select objesi olusturmak icin Select class'inin constructor'i
        // handle edecegimiz webelemnt'i istediginden ***)))

                    //dropdown 1 - select objesi olusturmadan once dropdown webelemntini locate etmeliyiz
        WebElement dropdownElementi=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));

                    //dropdown 2 - Select classindan obje olustur





    }


    // arama kutusuna java yazdirip aramayi yapin
    // title'in java icerdigini test edin
    // 1 - select objesi olusturmadan once dropdown webelemntini locate etmeliyiz
    // 2- Select class'indan obje olusturmak
    // 3- select objesini kullanarak istedigimiz method/method'lari calistirin
    // dropdown menuden Books seceneginin secildigini test edin
    // Dropdown menudeki secenek sayisinin 28 oldugunu test edin

}
