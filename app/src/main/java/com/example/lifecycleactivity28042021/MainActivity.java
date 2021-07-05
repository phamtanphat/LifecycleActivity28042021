package com.example.lifecycleactivity28042021;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button mBtnNavigateSecondActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("BBB","MainActivity : onCreate");

        mBtnNavigateSecondActivity = findViewById(R.id.buttonNavigateSecondActivity);

        mBtnNavigateSecondActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("BBB","MainActivity : onStart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("BBB","MainActivity : onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("BBB","MainActivity : onResume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("BBB","MainActivity : onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("BBB","MainActivity : onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("BBB","MainActivity : onDestroy");
    }
}