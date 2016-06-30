package com.example.hehe;

import android.content.Context;
import android.os.AsyncTask;
import android.widget.Toast;

import java.util.List;

/**
 * Created by Administrator on 2016/6/26.
 */
public class MyAsyncTask extends AsyncTask<String,Void,byte[]> {

    Context context;
    List<Game> data;
    MyAdapter adapter;

    public MyAsyncTask(Context context, List<Game> data, MyAdapter adapter) {
        super();
        this.context = context;
        this.data = data;
        this.adapter = adapter;
    }
    protected byte[] doInBackground(String... params) {
        return HttpUtils.getData(params[0]);
    }
    @Override
    protected void onPostExecute(byte[] result) {
        super.onPostExecute(result);
        if(result != null){
            String jsonString = new String(result);
            List<Game> data2 = JsonUtils.parseJson(jsonString);

            data.addAll(data2);
            adapter.notifyDataSetChanged();
        }else{
            Toast.makeText(context, "网络异常", Toast.LENGTH_SHORT).show();
        }
    }

}
