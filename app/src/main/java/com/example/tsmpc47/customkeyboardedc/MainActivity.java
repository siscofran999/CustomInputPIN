package com.example.tsmpc47.customkeyboardedc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.tsmpc47.custominputpin.CustomInputPIN;
import com.example.tsmpc47.custominputpin.ResultListener;

import java.util.List;

public class MainActivity extends AppCompatActivity implements ResultListener {

    private static final String TAG = "MainActivity";
    private CustomInputPIN customInputPIN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        customInputPIN = findViewById(R.id.custom_pin);
        customInputPIN.setOnResultListener(this);
        customInputPIN.limitMax(7);
    }

    @Override
    public void onButtonOK(String result) {
        Log.i(TAG, "onButtonOK: "+result);
    }
}
