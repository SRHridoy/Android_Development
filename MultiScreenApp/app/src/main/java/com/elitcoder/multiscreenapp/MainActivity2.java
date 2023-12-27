package com.elitcoder.multiscreenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView textView;
    @SuppressLint({"MissingInflatedId", "SetTextI18n"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView   = findViewById(R.id.textView);
        //getting data :
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        textView.setText("Your name is : " + name);

    }
}