package com.example.yash007.yashkumar_mapd711_task2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
    }

    //we need to create button event so It will navigate to second activity
    public void sendData(View v)  {
        Intent i = new Intent(StartActivity.this,SecondActivity.class);
        startActivity(i);
    }

}
