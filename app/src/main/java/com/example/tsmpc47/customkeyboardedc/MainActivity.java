package com.example.tsmpc47.customkeyboardedc;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.tsmpc47.custominputpin.FragmentRandomPin;
import com.example.tsmpc47.custominputpin.ResultListener;

public class MainActivity extends AppCompatActivity {

    Button btn_next;
    FragmentRandomPin mRandomPin;
    private static final String TAG = "LoginActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRandomPin = new FragmentRandomPin();

        btn_next = findViewById(R.id.btn_next);

        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSupportFragmentManager().beginTransaction().add(R.id.frame,mRandomPin).commit();

                mRandomPin.limitMsg("Xory, limit 7").limitMax(7);
                mRandomPin.setOnResultListener(new ResultListener() {
                    @Override
                    public void onButtonOK(String data) {
                        Toast.makeText(MainActivity.this, ""+data, Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onButtonCancel() {
                        Toast.makeText(MainActivity.this, "Cancel", Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });
    }
}
