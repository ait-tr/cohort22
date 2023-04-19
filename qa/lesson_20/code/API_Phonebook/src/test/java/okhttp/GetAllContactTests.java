package okhttp;

import com.google.gson.Gson;
import dto.AllContactDto;
import dto.ContactDto;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;

public class GetAllContactTests {
    Gson gson = new Gson();
    OkHttpClient client = new OkHttpClient();

    public static final MediaType JSON = MediaType.get("application/json; charset=utf-8");

    String token = "eyJhbGciOiJIUzI1NiJ9.eyJyb2xlcyI6WyJST0xFX1VTRVIiXSwic3ViIjoibWFudWVsKzVAZ21haWwuY29tIiwiaXNzIjoiUmVndWxhaXQiLCJleHAiOjE2ODI1MjQ2NDksImlhdCI6MTY4MTkyNDY0OX0.jJlgOvI75GXYxitwtx2nTVlB2xK4ntpXz-S4wLxtiQY";

    @Test
    public void getAllContactSuccessTest() throws IOException {

        Request request = new Request.Builder()
                .url("https://contactapp-telran-backend.herokuapp.com/v1/contacts")
                .addHeader("Authorization",token)
                .get().build();

        Response response = client.newCall(request).execute();

        Assert.assertTrue(response.isSuccessful());

        AllContactDto allDto = gson.fromJson(response.body().string(),AllContactDto.class);
        List<ContactDto> contacts = allDto.getContacts();

        for (ContactDto contact: contacts) {
            System.out.println(contact.getId());
            System.out.println("*****************************************************");
        }
    }
}
