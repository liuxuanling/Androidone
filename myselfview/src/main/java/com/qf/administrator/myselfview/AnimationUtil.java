package com.qf.administrator.myselfview;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;

/**
 * Created by Administrator on 2016/6/29.
 */
public class AnimationUtil {

    //出去的动画
  public static void startAnimationOut(ViewGroup vg, int offSet) {

      int count=vg.getChildCount();
      //得到容器中的子元素并设置七为不可用
      for (int i=0;i<count;i++){
          View v=vg.getChildAt(i);
          v.setEnabled(false);
      }

      //选转动画
      RotateAnimation ra=new RotateAnimation(0,-180,
              Animation.RELATIVE_TO_SELF,0.5f,Animation.RELATIVE_TO_SELF,1);

      ra.setDuration(500);

      // 偏移量，相对于开始动画的时间，如果值为0，则立即执行动画，否则等待指定偏移量的时间后执行动画

      ra.setStartOffset(offSet);

      // 设置动画结束后保持动画的最后变化
      ra.setFillAfter(true);
      vg.startAnimation(ra);
  }

    // 进来时的动画
    public static void startAnimationIn(ViewGroup vg, int offSet) {
        int count = vg.getChildCount();

        // 设置容器中的子元素可用
        for (int i = 0; i < count; i++) {
            View v = vg.getChildAt(i);
            v.setEnabled(true);
        }

        RotateAnimation ra = new RotateAnimation(-180, 0,
                Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 1);

        ra.setDuration(500);
        ra.setStartOffset(offSet);
        ra.setFillAfter(true);
        vg.startAnimation(ra);
    }
}
