package com.ll.banbury.mystudydemo_navigationview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: feather");
        Log.d(TAG, "onCreate: feather_2");
        Log.d(TAG, "onCreate: add_feater1_on_main");
        Log.d(TAG, "onCreate: add_feater4_on_main");
    }
}
