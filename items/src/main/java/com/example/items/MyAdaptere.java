package com.example.items;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/6/25.
 */
public class MyAdaptere extends BaseAdapter {

    Context context;
    List<Game>data;
    Map<String, Bitmap> cacheImage = new HashMap<>();


    public MyAdaptere(Context context, List<Game> data) {
        this.context = context;
        this.data = data;
        this.cacheImage = cacheImage;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHorld horld;

        if (convertView==null){
            convertView=View.inflate(context,R.layout.item01,null);
            horld=new ViewHorld();
            horld.imageView= (ImageView) convertView.findViewById(R.id.iv);
            horld.textView1= (TextView) convertView.findViewById(R.id.item_tv1);
            horld.textView2= (TextView) convertView.findViewById(R.id.item_tv2);
            convertView.setTag(horld);

        } else {

             horld= (ViewHorld) convertView.getTag();

            Game game=data.get(position);

            horld.textView1.setText(game.id);
            horld.textView2.setText(game.typeid);
            horld.textView1.setText(game.click);
            horld.textView1.setText(game.title);

            horld.textView1.setText(game.shorttitle);
            horld.textView1.setText(game.source);

            horld.textView1.setText(game.litpic);
            horld.textView1.setText(game.writer);

            horld.textView1.setText(game.keywords);
            horld.textView1.setText(game.description);

            horld.textView1.setText(game.typename);
            horld.textView1.setText(game.namerule2);
            horld.textView1.setText(game.typeurl);

            horld.imageView.setTag(game.arcurl);

        if (cacheImage.containsKey(game.arcurl)){

            horld.imageView.setImageBitmap(cacheImage.get(game.arcurl));
        }else {
          new ImageAsyncTask(context,horld.imageView,game.arcurl,cacheImage)
                    .execute("http://www.3dmgame.com/uploads/allimg/160624/226-1606241204460-L.jpg");
        }
        }
        return null;
    }

    class ViewHorld{
        ImageView imageView;
        TextView textView1;
        TextView textView2;
    }
}
