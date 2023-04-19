package okhttp;

import com.google.gson.Gson;
import dto.ContactDto;
import dto.ContactResponseDto;
import okhttp3.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Random;

public class AddNewContactTests {

    Gson gson = new Gson();
    OkHttpClient client = new OkHttpClient();

    public static final MediaType JSON = MediaType.get("application/json; charset=utf-8");

    String token = "eyJhbGciOiJIUzI1NiJ9.eyJyb2xlcyI6WyJST0xFX1VTRVIiXSwic3ViIjoibWFudWVsKzVAZ21haWwuY29tIiwiaXNzIjoiUmVndWxhaXQiLCJleHAiOjE2ODI1MjQ2NDksImlhdCI6MTY4MTkyNDY0OX0.jJlgOvI75GXYxitwtx2nTVlB2xK4ntpXz-S4wLxtiQY";

    @Test
    public void addNewContactSuccessTest() throws IOException {

        int i = new Random().nextInt(1000) + 1000;

        ContactDto contactDto = ContactDto.builder()
                .name("Oliver")
                .lastName("Kan")
                .email("kan" +i + "@gm.co")
                .phone("1234512345" + i)
                .address("Berlin")
                .description("goalkeeper")
                .build();

        RequestBody body = RequestBody.create(gson.toJson(contactDto),JSON);

        Request request = new Request.Builder()
                .url("https://contactapp-telran-backend.herokuapp.com/v1/contacts")
                .addHeader("Authorization",token)
                .post(body).build();

        Response response = client.newCall(request).execute();

        Assert.assertTrue(response.isSuccessful());
        Assert.assertEquals(response.code(),200);

        ContactResponseDto resDto = gson.fromJson(response.body().string(),ContactResponseDto.class);
        System.out.println(resDto.getMessage());
        Assert.assertTrue(resDto.getMessage().contains("Contact was added!"));

    }
}
