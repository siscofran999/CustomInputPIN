package com.example.tsmpc47.customkeyboardedc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.tsmpc47.custominputpin.CustomInputPIN;
import com.example.tsmpc47.custominputpin.ResultListener;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private CustomInputPIN customInputPIN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        customInputPIN = findViewById(R.id.custom_pin);
        customInputPIN.limitMax(7).limitMsg("Maaf, Max 7");
        customInputPIN.setOnResultListener(new ResultListener() {
            @Override
            public void onButtonOK(String result) {
                Log.i(TAG, "onButtonOK: "+result);
            }

            @Override
            public void onButtonCancel() {
                Intent login = new Intent(MainActivity.this, BeforeActivity.class);
                startActivity(login);
                finish();
            }
        });
    }
}
