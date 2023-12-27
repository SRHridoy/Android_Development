package com.elitcoder.multiscreenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText name;
    public static final String EXTRA_NAME = "name";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = findViewById(R.id.name);

    }

    public void openActivity(View v){
        Toast.makeText(this, "Opening Second Activity", Toast.LENGTH_SHORT).show();
        //Crating Intent:
        Intent intent = new Intent(this,MainActivity2.class);

        //Passing Data :
        String nameText = name.getText().toString();
        intent.putExtra(EXTRA_NAME, nameText);

        startActivity(intent);
    }
}