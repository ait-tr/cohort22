package com.example.servingwebcontent;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageConfig;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;

@Controller
public class GreetingController {
    // Curl
    // curl "localhost:8080/greeting?name=Tim"
    @RequestMapping(value = "/greeting", method = RequestMethod.GET)
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }

    /**/
    public static byte[] getQRCodeImage(String text, int width, int height) throws WriterException, IOException {
        QRCodeWriter qrCodeWriter = new QRCodeWriter();
        BitMatrix bitMatrix = qrCodeWriter.encode(text, BarcodeFormat.QR_CODE, width, height);

        ByteArrayOutputStream pngOutputStream = new ByteArrayOutputStream();
        MatrixToImageConfig con = new MatrixToImageConfig( 0xFF000002 , 0xFFFFC041 ) ;

        MatrixToImageWriter.writeToStream(bitMatrix, "PNG", pngOutputStream,con);
        byte[] pngData = pngOutputStream.toByteArray();
        return pngData;
    }
     /**/
     /**/

    @GetMapping(value = "/image", produces = MediaType.IMAGE_PNG_VALUE)
    @ResponseBody
    public  byte[] getImage() throws IOException, WriterException {
        //InputStream in = getClass().getResourceAsStream("image.jpg");
        //return IOUtils.toByteArray(in);
        return getQRCodeImage("hello", 300, 300);
    }

    @GetMapping(value = "/image2", produces = MediaType.IMAGE_PNG_VALUE)
    @ResponseBody
    public  byte[] getImage2(@RequestParam(name="text", required=false, defaultValue="World") String text) throws IOException, WriterException {
        //InputStream in = getClass().getResourceAsStream("image.jpg");
        //return IOUtils.toByteArray(in);
        return getQRCodeImage(text, 300, 300);
    }
    /**/
}
