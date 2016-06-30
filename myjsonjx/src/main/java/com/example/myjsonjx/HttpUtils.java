package com.example.myjsonjx;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by Administrator on 2016/6/24.
 */
public class HttpUtils {

    public static InputStream getData(String urlString) {
        ByteArrayOutputStream out=new ByteArrayOutputStream();
        try {
            URL url=new URL(urlString);

            HttpURLConnection connec= (HttpURLConnection) url.openConnection();
                 connec.setRequestMethod("GET");

            InputStream input = connec.getInputStream();
            byte[] b=new byte[1024];

            int len = 0;

            while ((len=input.read())!=-1) {

                out.write(b,0,len);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return null;
    }


}