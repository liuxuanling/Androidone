package com.example.hehe;

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
 * Created by Administrator on 2016/6/26.
 */
public class MyAdapter extends BaseAdapter{

    Context context;
    List<Game>data;
    Map<String,Bitmap>cacheImage =new HashMap<>();

    public MyAdapter(Context context, List<Game> data, Map<String, Bitmap> cacheImage) {
        this.context = context;
        this.data = data;
        this.cacheImage = cacheImage;
    }

  public MyAdapter(List<Game> data, MyAdapter adapter) {

    }

    @Override
    public int getCount() {
        return data.size();
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
        ViewHolder holder;
        if (convertView == null) {
            convertView = View.inflate(context, R.layout.item01, null);
            holder = new ViewHolder();
            holder.imageView = (ImageView) convertView
                    .findViewById(R.id.item_iv);
            holder.textView1 = (TextView) convertView
                    .findViewById(R.id.item_subject);
            holder.textView2 = (TextView) convertView
                    .findViewById(R.id.item_summary);
            convertView.setTag(holder);


        } else {
            holder = (ViewHolder) convertView.getTag();
        }
      /*  String title;
        private   String shorttitle;
        private  String source;
        private  String keywords;
        private String description;
        private String typename;

        private String arcurl;*/
        Game game=data.get(position);
        holder.textView1.setTag(game.title);
        holder.textView2.setTag(game.shorttitle);
        holder.textView1.setTag(game.source);
        holder.textView2.setTag(game.keywords);
        holder.textView1.setTag(game.description);
        holder.textView2.setTag(game.typename);
      holder.imageView.setTag(game.arcurl);

        if (cacheImage.containsKey(game.arcurl)){
            holder.imageView.setImageBitmap(cacheImage.get(game.arcurl));
        }else {
            new ImageAsync(context,holder.imageView,game.arcurl,cacheImage)
                    .execute("http://www.3dmgame.com/uploads/allimg/160624/226-1606241204460-L.jpg");
        }
        return convertView;
    }

    class  ViewHolder{
        ImageView imageView;
        TextView textView1;
        TextView textView2;
    }

}
