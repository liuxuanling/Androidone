package com.example.hehe;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Map;

/**
 * Created by Administrator on 2016/6/26.
 */
public class ImageAsync extends AsyncTask<String,Void,byte[]> {

    Context context;
    ImageView imageView;
    String arcurl; //图片地址
    Map<String, Bitmap> cacheImage;

    public ImageAsync(Context context, ImageView imageView, String arcurl, Map<String, Bitmap> cacheImage) {
        this.context = context;
        this.imageView = imageView;
        this.arcurl = arcurl;
        this.cacheImage = cacheImage;
    }


    @Override
    protected byte[] doInBackground(String... params) {
        return HttpUtils.getData(params[0]);
    }

    @Override
    protected void onPostExecute(byte[] result) {
        super.onPostExecute(result);

        if (result != null) {
            Bitmap bitmap = BitmapFactory.decodeByteArray(result, 0, result.length);
            if (imageView.getTag().toString().equals(arcurl)) {  //正常情况下应该相等的
                imageView.setImageBitmap(bitmap);
                cacheImage.put(imageView.getTag().toString(), bitmap);
            }
        } else {
            Toast.makeText(context, "网络异常", Toast.LENGTH_SHORT).show();
        }
    }
}
