package testData;

import org.json.JSONObject;

public class TestDataJsonPlaceHolder {


    public int basariliStatusCode = 200;
    public String contentType = "application/json; charset=utf-8";
    public String connectionHeaderDegeri = "keep-alive";

    public JSONObject expectedBodyOlusturJSON() {

        JSONObject expBodyJSon = new JSONObject();

        expBodyJSon.put("userId", 3);
        expBodyJSon.put("id", 22);
        expBodyJSon.put("title", "dolor sint quo a velit explicabo quia nam");
        expBodyJSon.put("body", "eos qui et ipsum ipsam suscipit aut\nsed omnis" +
                " non odio\nexpedita earum mollitia molestiae aut atque rem suscipit\nnam impedit esse");


        return expBodyJSon;


    }

}
