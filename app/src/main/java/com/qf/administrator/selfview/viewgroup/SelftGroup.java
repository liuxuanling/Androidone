package com.qf.administrator.selfview.viewgroup;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;

import com.qf.administrator.selfview.R;

/**
 * Created by Administrator on 2016/6/29.
 */
public class SelftGroup extends LinearLayout{
    public SelftGroup(Context context) {
        super(context);
    }

    public SelftGroup(Context context, AttributeSet attrs) {
        super(context, attrs);
        //得到布局
        LayoutInflater.from(context).inflate(R.layout.ctivity_selft_view_group,this,true);
    }

    public SelftGroup(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}
