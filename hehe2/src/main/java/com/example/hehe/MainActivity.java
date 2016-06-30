package com.example.hehe;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    int pageIndex = 1;
    boolean flag = false;
    List<Game> data;
    MyAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView) findViewById(R.id.lv);
        data = new ArrayList<>();
        adapter = new MyAdapter(data, adapter);

        View v = View.inflate(this, R.layout.footer, null);
        listView.addFooterView(v);


        listView.setAdapter(adapter);
        //5.
        new MyAsyncTask(this,data,adapter)
                .execute("http://www.3dmgame.com/sitemap/api.php?row=10&typeid=1&paging=1&page=1");
  listView.setOnScrollListener(new AbsListView.OnScrollListener() {
      @Override
      public void onScrollStateChanged(AbsListView view, int scrollState) {
 if (flag==true&&scrollState== AbsListView.OnScrollListener.SCROLL_STATE_IDLE){

     pageIndex=pageIndex+1;

     new MyAsyncTask(MainActivity.this,data,adapter)
             .execute("http://www.3dmgame.com/sitemap/api.php?row=10&typeid=1&paging=1&page=1");
 }
      }

      @Override
      public void onScroll(AbsListView view, int firstVisibleItem,
                           int visibleItemCount, int totalItemCount) {

          if (firstVisibleItem+visibleItemCount==totalItemCount){
              flag=true;

          }
      }
  });
    }
}