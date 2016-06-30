package com.selft.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;

import com.qf.administrator.selfview.R;

/**
 * Created by Administrator on 2016/6/30.
 */
public class MyView extends View{
    Drawable image_value;
    String txt_value;
    public MyView(Context context) {
        super(context);
    }

    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);
        TypedArray array = context.obtainStyledAttributes(attrs,R.styleable.myview_attres);
         txt_value = array.getString(R.styleable.myview_attres_txt);
         image_value = array.getDrawable(R.styleable.myview_attres_image);
    }

    public MyView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);


    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint=new Paint();
     paint.setColor(Color.BLUE);

        //把Drawable对象转化成bitmap
        BitmapDrawable bitmap= (BitmapDrawable) image_value;
        Bitmap bitmap1 = bitmap.getBitmap();

       canvas.drawBitmap(bitmap1,0,0,paint);

        canvas.drawText(txt_value,bitmap1.getWidth(),(bitmap1.getHeight()+paint.getTextSize()/2),paint);

    }
}
