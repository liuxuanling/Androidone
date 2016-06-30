package com.com.selft.tuya;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by Administrator on 2016/6/30.
 */
public class TuYaView extends View{



    //画板
    private Canvas canvas;
    //纸
    private Bitmap bitmap;
    //笔
    private Paint paint;
    //路径
    private Path path;
    //临时保存文件
    private float mx,my;



    public TuYaView(Context context,int screenWith,int screenHeight) {
        super(context);
        //画板 笔  纸
      bitmap= Bitmap.createBitmap(screenWith,screenHeight,Bitmap.Config.ARGB_8888);
        canvas =new Canvas(bitmap);

        paint =new Paint();
        paint.setAntiAlias(true);//设置平滑效果
        paint.setStyle(Paint.Style.STROKE);//画实线
        paint.setStrokeWidth(5);


    }

    public TuYaView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public TuYaView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
    //单点控制


    @Override
    public boolean onTouchEvent(MotionEvent event) {

        Log.i("aaa","onTouchEvent");
        int action = event.getAction();
        Log.i("aaa","event.getPointerCount()="+event.getPointerCount()+"");
        float x=event.getX();
        float y=event.getY();

        Log.i("aaa","x="+x+";y="+y);

        switch (action){

            case MotionEvent.ACTION_DOWN:
                path=new Path();
                path.moveTo(x,y);
                mx=x;
                my=y;
                break;
            case MotionEvent.ACTION_MOVE:
                //得到滑动的距离

                float dx=Math.abs(x-mx);
                float dy=Math.abs(y-my);

                if (dx>4||dy>4){
                    path.lineTo(x,y);
                    canvas.drawPath(path,paint);

                }

                mx=x;
                my=y;
                break;
                case MotionEvent.ACTION_UP:
                 break;
        }
        //刷新
         invalidate();
        return true;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawBitmap(bitmap,0,0,paint);
    }
}
