package com.example.items;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DownLoadImage extends AppCompatActivity {

    Button button;
    Intent intent;
    String struri="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_down_load_image);

        button= (Button) findViewById(R.id.btn);
        intent=new Intent();
        intent.putExtra("struri",struri);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                
            }
        });
    }
}
