package com.example.yash007.yashkumar_mapd711_task2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    //declaration of textview variables here
    public TextView fullName;
    public TextView qualification;
    public TextView profession;
    public TextView hobby;
    public TextView dreamJob;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //assign vairable and give type casting of textview with layout file using ID
        fullName = (TextView)findViewById(R.id.textView2);
        qualification = (TextView)findViewById(R.id.textView3);
        profession = (TextView)findViewById(R.id.textView4);
        hobby = (TextView)findViewById(R.id.textView5);
        dreamJob = (TextView)findViewById(R.id.textView6);

        //set the text. Values will be taken from the strings.xml file
        fullName.setText(getString(R.string.fullNameValue));
        qualification.setText(getString(R.string.qualificationValue));
        profession.setText(getString(R.string.professionValue));
        hobby.setText(getString(R.string.hobbyValue));
        dreamJob.setText(getString(R.string.dreamJobValue));
    }
}
