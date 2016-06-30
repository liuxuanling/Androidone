package com.example.myjsonjx;

import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

   /* private ImageView isShow = null;
     private String url="https://ss0.bdstatic.com/5aV1bjqh_Q23odCf/static/superman/img/logo/bd_logo1_31bdc765.png";
    private  Handler handler;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

          isShow = (ImageView) findViewById(R.id.isShow);

              handler=new Handler(){
                @Override
                public void handleMessage(Message msg) {
                    super.handleMessage(msg);

                    switch (msg.what){
                        case 1:
                            // 获取Message中的数据并设置给UI
                            Bitmap bitmap = (Bitmap) msg.obj;

                            isShow.setImageBitmap(bitmap);
                            break;

                        default:
                            break;

                    }
                }
            };
        }

    // 下载按钮的事件
    public void download(View v) {
        new Thread(){
            @Override
            public void run() {
                super.run();


               InputStream is= HttpUtils.getData(url);
                // 通过BitmapFactory对象将流对象转换为一个Bitmap对象
                Bitmap bitmap = BitmapFactory.decodeStream(is);

                // 新建Messa个对象
                Message msg = Message.obtain();

                // 将要传递的数据放置在message对象中
                msg.what = 1;
                msg.obj = bitmap;

                // 使用Handler对象的sendMessage(Message)方法将消息对象发送出去
                handler.sendMessage(msg);
            }
        }.start();
    }*/
    }

