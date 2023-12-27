package com.elitcoder.bundledatapassingbetweenacitivityusingintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnNext;
        btnNext = findViewById(R.id.button);

        Intent intent;
        intent = new Intent(MainActivity.this,DataPassing.class);
//Data passing:
        intent.putExtra("title","Student Info");
        intent.putExtra("studentName","Hridoy");
        intent.putExtra("stId",2102002);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent);
            }
        });

    }
}