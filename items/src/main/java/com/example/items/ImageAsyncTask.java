package com.example.items;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Map;

/**
 * Created by Administrator on 2016/6/24.
 */
   public class ImageAsyncTask extends AsyncTask<String, Void, byte[]> {

    Context context;
    ImageView imageView;
    int position;
    String litpic;//图片的地址
    Map<String,Bitmap>cacheImage;


    public ImageAsyncTask(Context context, ImageView imageView, String litpic, Map<String, Bitmap> cacheImage) {

        this.context = context;
        this.imageView = imageView;
        this.position = position;
        this.litpic = litpic;
        this.cacheImage = cacheImage;
    }


    @Override
    protected byte[] doInBackground(String... params) {

       return HttpUtils.getData(params[0]);

    }


    @Override
    protected void onPostExecute(byte[] result) {
        super.onPostExecute(result);

        if (result!=null){
            Bitmap bm= BitmapFactory.decodeByteArray(result,0,result.length);

            if (imageView.getTag().toString().equalsIgnoreCase(litpic)){//正常情况下应该相等

                imageView.setImageBitmap(bm);
                imageView.setImageBitmap(bm);
                cacheImage.put(imageView.getTag().toString(),bm);
            }else {
                Toast.makeText(context,"网络异常",Toast.LENGTH_SHORT).show();
            }
        }
    }
}
