package com.elitcoder.bundledatapassingbetweenacitivityusingintent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DataPassing extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_passing);
//Getting info:
        Intent intentFromMain = getIntent();
        String title =  intentFromMain.getStringExtra("title");
        String name =  intentFromMain.getStringExtra("studentName");
        int id = intentFromMain.getIntExtra("stId",0);//emon value default e dibo ja possible na hoba student id...

        TextView studentInfo;
        studentInfo = findViewById(R.id.studentInfo);
        studentInfo.setText("Roll No : "+id+"\n"+"Name : "+name);

        //learn later:
        if (getSupportActionBar() != null && title!= null)
            getSupportActionBar().setTitle(title);
    }
}