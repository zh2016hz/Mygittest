package com.example.aa.gittest;

import android.util.Log;

import static android.content.ContentValues.TAG;

/**
 * 文件描述：
 * Created by  xn069392
 * 创建时间    2018/6/1
 */

public class SixMonthTest {
    StringBuffer sb = new StringBuffer();

    public String getString() {
        for (int i = 0; i < 100; i++) {
            sb.append(" " + i);
        }
        return sb.toString();
    }
    public   void  addCount(){
        int content =0;
        for (int i = 0; i < 100; i++) {
            content++;
            Log.e(TAG, "addCount: " );
        }
    }
}
