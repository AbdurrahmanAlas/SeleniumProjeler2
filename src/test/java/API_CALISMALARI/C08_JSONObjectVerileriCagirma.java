package API_CALISMALARI;

import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.Test;

public class C08_JSONObjectVerileriCagirma {

    /*
    {
    "firstName": "John",
    "lastName": "doe",
    "age": 26,
    "address": {
        "streetAddress": "naist street",
        "city": "Nara",
        "postalCode": "630-0192"
    },
    "phoneNumbers": [
        {
            "type": "iPhone",
            "number": "0123-4567-8888"
        },
        {
            "type": "home",
            "number": "0123-4567-8910"
        }
    ]
}
     */


    @Test
    public void JsonPath01() {


        JSONObject kisiBilgisi = new JSONObject();
        JSONObject adresBilgisi = new JSONObject();
        JSONObject cepTelBilgisi = new JSONObject();
        JSONObject evTelBilgisi = new JSONObject();
        JSONArray telBilgileri = new JSONArray();

        cepTelBilgisi.put("type", "iphone");
        cepTelBilgisi.put("number", "0123-222-555");

        evTelBilgisi.put("type", "home");
        evTelBilgisi.put("number", "0220-449-5955");

        telBilgileri.put(cepTelBilgisi);
        telBilgileri.put(evTelBilgisi);

        adresBilgisi.put("streetAddress", "naist street");
        adresBilgisi.put("city", "Nara");
        adresBilgisi.put("postalCode", "630-0192");

        kisiBilgisi.put("firstName", "John");
        kisiBilgisi.put("lastName", "doe");
        kisiBilgisi.put("age", 26);
        kisiBilgisi.put("address", adresBilgisi);
        kisiBilgisi.put("phoneNumbers", telBilgileri);

        System.out.println(kisiBilgisi);

        System.out.println("Isim:" + kisiBilgisi.get("firstName"));
        System.out.println("Soyisim : " + kisiBilgisi.get("lastName"));
        System.out.println("Yas : " + kisiBilgisi.get("age"));

        System.out.println("Sehir :" + kisiBilgisi.getJSONObject("address").get("city"));
        System.out.println("Posta Kodu : " + kisiBilgisi.getJSONObject("address").get("postalCode"));
        System.out.println("Sokak adi : " + kisiBilgisi.getJSONObject("address").get("streetAddress"));

        System.out.println("Cep Tel :" + kisiBilgisi.
                getJSONArray("phoneNumbers").
                getJSONObject(0).
                get("number"));
        System.out.println("Telefon Type : " + kisiBilgisi.
                getJSONArray("phoneNumbers").
                getJSONObject(1).
                get("type"));


    }


}
