package com.qf.administrator.selfview.selftextview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.qf.administrator.selfview.R;
import com.qf.administrator.selfview.viewgroup.SelftGroup;

public class SelftTextViewActivity extends AppCompatActivity implements View.OnClickListener{

    private Button btn1,butn2;
    private SelftGroup selftGroup=null;
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_text_view);
        btn1= (Button) findViewById(R.id.selft_view_group_btn1);
        butn2= (Button) findViewById(R.id.selte_view_group_btn2);
        selftGroup= (SelftGroup) findViewById(R.id.customviewgroup);

        tv= (TextView) findViewById(R.id.selft_view_group_tv1);

        btn1.setOnClickListener(this);
        butn2.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.selft_view_group_btn1:
                tv.setText("btn1");
                break;

            case R.id.selte_view_group_btn2:
                tv.setText("btn2");
                break;
        }


    }
}
