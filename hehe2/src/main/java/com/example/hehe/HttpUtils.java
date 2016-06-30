package com.example.hehe;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by Administrator on 2016/6/25.
 */
public class HttpUtils {
    public static  byte[] getData(String urlString){

        ByteArrayOutputStream out=new ByteArrayOutputStream();
        try {
            URL url=new URL(urlString);
            HttpURLConnection conn= (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GRT");
            if (conn.getResponseCode()==200){
                InputStream input = conn.getInputStream();
                byte[] b=new byte[1024];
                int len=0;
                while ((len=input.read())!=-1){
                   out.write(b,0,len);
                }

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

        return out.toByteArray();
    }

}
