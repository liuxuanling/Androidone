package com.example.items;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by Administrator on 2016/6/24.
 */
public class HttpUtils {
    public  static  byte[] getData(String urlString){

            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            try {
                URL url = new URL(urlString);
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setRequestMethod("GET");
                if (conn.getResponseCode() == 200) {
                    InputStream is = conn.getInputStream();
                    byte[] buffer = new byte[1024];
                    int len = 0;
                    while ((len = is.read(buffer)) != -1) {
                        baos.write(buffer, 0, len);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return baos.toByteArray();
        }
}
