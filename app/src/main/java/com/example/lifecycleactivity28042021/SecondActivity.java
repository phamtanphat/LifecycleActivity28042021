package com.example.lifecycleactivity28042021;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    Button mBtnNavigateThirdActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Log.d("BBB","SecondActivity : onCreate");

        mBtnNavigateThirdActivity = findViewById(R.id.buttonNavigateThirdActivity);

        mBtnNavigateThirdActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("BBB","SecondActivity : onStart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("BBB","SecondActivity : onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("BBB","SecondActivity : onResume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("BBB","SecondActivity : onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("BBB","SecondActivity : onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("BBB","SecondActivity : onDestroy");
    }
}