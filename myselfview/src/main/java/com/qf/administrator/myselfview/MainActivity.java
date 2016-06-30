package com.qf.administrator.myselfview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private RelativeLayout rl2 = null;
    private RelativeLayout rl3 = null;

    private ImageButton ibHome, ibMenu;

    private boolean isShow2 = true;			//	相对布局2是否显示
    private boolean isShow3 = true;			//	相对布局3是否显示

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }
        private void initView() {
            rl2 = (RelativeLayout) findViewById(R.id.rl2);
            rl3 = (RelativeLayout) findViewById(R.id.rl3);

            ibHome = (ImageButton) findViewById(R.id.ibHome);
            ibMenu = (ImageButton) findViewById(R.id.ibMenu);

            ibHome.setOnClickListener(this);
            ibMenu.setOnClickListener(this);
        }

        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.ibHome:
                    if (isShow2) {
                        if (isShow3) {
                            AnimationUtil.startAnimationOut(rl3, 0);
                            isShow3 = false;
                        }

                        AnimationUtil.startAnimationOut(rl2, 0);
                        isShow2 = false;
                    } else {
                        AnimationUtil.startAnimationIn(rl2, 0);
                        isShow2 = true;
                    }
                    break;
                case R.id.ibMenu:
                    if (isShow3) {
                        AnimationUtil.startAnimationOut(rl3, 2000);
                        isShow3 = false;
                    } else {
                        AnimationUtil.startAnimationIn(rl3, 2000);
                        isShow3 = true;
                    }
                    break;

                default:
                    break;
            }
        }
    }

