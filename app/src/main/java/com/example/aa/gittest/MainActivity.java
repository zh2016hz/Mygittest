package com.example.aa.gittest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       android.util.Log.e("第一次修改!!!!!!!", "onCreate: " );

       android.util.Log.e("第2次修改!!!!!!!", "onCreate: " );
       android.util.Log.e("第2次修改!!!!!!!", "onCreate: " );

       android.util.Log.e("第一次修改!!!!!!!", "onCreate: " );
       android.util.Log.e("第一次修改!!!!!!!", "onCreate: " );
       android.util.Log.e("第一次修改!!!!!!!", "onCreate: " );
    }
}
