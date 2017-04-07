package com.example.aa.gittest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//dsadad
       android.util.Log.e("第一次修改!!!!!!!", "onCreate: " );
    }
}
