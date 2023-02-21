package API_CALISMALARI;

import baseURL.JsonPlaceHolderBaseUrl;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;
import testData.TestDataJsonPlaceHolder;

import static io.restassured.RestAssured.given;

public class C19_Put_TestDataClassKullanimi extends JsonPlaceHolderBaseUrl {
      /*
    https://jsonplaceholder.typicode.com/posts/70 url'ine asagidaki body’e sahip bir PUT
    request yolladigimizda donen response’in
    status kodunun 200,
    content type’inin “application/json; charset=utf-8”,
    Connection header degerinin “keep-alive”
    ve
    response body’sinin asagida verilen ile ayni oldugunu test ediniz
    Request Body
        {
        "title":"Ali",
        "body":"Merhaba",
        "userId":10,
        "id":70
        }
    Expected Data
        {
        "title":"Ali",
        "body":"Merhaba",
        "userId":10,
        "id":70
        }
  */


    @Test
    public void put01(){

        // 1-Url ve Body hazirla

        specJsonPlace.pathParams("pp1","posts","pp2",33071);


        TestDataJsonPlaceHolder testDataJsonPlaceHolder=new TestDataJsonPlaceHolder();
        JSONObject reqBody =testDataJsonPlaceHolder.requestBodyOlusturJSON();


        //2- Expected Data hazirla

        JSONObject expData = testDataJsonPlaceHolder.requestBodyOlusturJSON();

        // 3- Response i kaydet

        Response response= given().
                spec(specJsonPlace).
                contentType(ContentType.JSON).when().
                body(reqBody.toString()).
                put("/{pp1/{pp2}");


        //4- Assertion

        JsonPath resJP = response.jsonPath();

        Assert.assertEquals(testDataJsonPlaceHolder.basariliStatusCode,response.getStatusCode());
        Assert.assertEquals(testDataJsonPlaceHolder.contentType,response.getContentType());
        Assert.assertEquals(testDataJsonPlaceHolder.connectionHeaderDegeri,response.getHeader("Connection"));


        Assert.assertEquals(expData.get("title"),resJP.get("title"));
        Assert.assertEquals(expData.get("body"),resJP.get("body"));
        Assert.assertEquals(expData.get("userId"),resJP.get("userId"));
        Assert.assertEquals(expData.get("id"),resJP.get("id"));



    }


}
