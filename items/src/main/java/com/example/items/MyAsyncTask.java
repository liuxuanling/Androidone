package com.example.items;

import android.content.Context;
import android.os.AsyncTask;
import android.widget.Toast;

import java.util.List;

/**
 * Created by Administrator on 2016/6/24.
 */
public class MyAsyncTask extends AsyncTask<String, Void, byte[]>{
    Context context;
    List<Game>data;
    MyAdaptere adapter;

    public MyAsyncTask(Context context, List<Game> data, MyAdaptere adapter) {
        super();
        this.context = context;
        this.data = data;
        this.adapter = adapter;
    }

    @Override
    protected byte[] doInBackground(String... params) {

        return HttpUtils.getData(params[0]);
    }

    @Override
    protected void onPostExecute(byte[] result) {
        super.onPostExecute(result);

        if(result != null){
            String jsonStr = new String(result);

            List<Game> data2 = JsonUtils.parseJson(jsonStr);

            data.addAll(data2);
            adapter.notifyDataSetChanged();
        }else{
            Toast.makeText(context, "网络异常", Toast.LENGTH_SHORT).show();
        }
    }

}
