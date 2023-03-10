package API_CALISMALARI;

import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class C01_Get_ApiSorgulama {

    /*
        https://restful-booker.herokuapp.com/booking/9856 url’ine
        bir GET request gonderdigimizde donen Response’un,
        status code’unun 200,
        ve content type’inin application/json; charset=utf-8,
        ve Server isimli Header’in degerinin Cowboy,
        ve status Line’in HTTP/1.1 200 OK
        ve response suresinin 5 sn’den kisa oldugunu manuel olarak test ediniz.
*/
    // 1 - Gonderecegimiz Request icin gerekli olan URL ve ihtiyacimiz varsa Body hazirla
    // 2 - Eger soruda bize verilmisse Expected Data hazirla
    // 3 - Bize donen Response'i Actual Data olarak kaydet
    // 4 - Expected Data ile Actual datanin karsilastirmasi - Assertion

    @Test
    public  void get01(){



        // 1 - Gonderecegimiz Request icin gerekli olan URL ve ihtiyacimiz varsa Body hazirla

        String url="https://restful-booker.herokuapp.com/booking/1840";

        // 2- Eger soruda bize verilmisse Expected Data hazirla

        // 3- Bize donen Response i ActualData olarak kaydet

        Response response=given().when().get(url);

        response.prettyPrint();

        System.out.println("StatusCode :" +response.getStatusCode());
        System.out.println("ContentType :" +response.getContentType());
        System.out.println("Server headerin degeri :" +response.getHeader("Server"));
        System.out.println("Status line :" +response.getStatusLine());
        System.out.println("Response süresi :" +response.getTime());






        //4 -






    }






}
