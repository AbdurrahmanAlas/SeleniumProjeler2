package API_CALISMALARI;

import baseURL.HerokuappBaseurl;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class C16_BaseUrlHerokuapp extends HerokuappBaseurl {


 /*
        Class icinde 2 Test metodu olusturun ve asagidaki testleri yapin
    */

    @Test
    public void get01(){
         /*
        1-  https://restful-booker.herokuapp.com/booking
        endpointine bir GET
            request gonderdigimizde
            donen response’un
            status code’unun 200 oldugunu
            ve Response’ta 24389 id'sine
             sahip bir booking oldugunu test edin
    */

        //1- URl ve body hazirla
        specHerokuapp.pathParams("pp1","booking");

        // 2 - Expected Data hazirla
        // 3 - Response'u kaydet

        Response response=given().
                spec(specHerokuapp).
                when().
                get("/{pp1}");

        response.prettyPrint();

        //4- Assertion

        response.
                then().
                assertThat().
                statusCode(200).
                body("bookingid", Matchers.hasItem(1442));



}}
