package com.elitcoder.srhfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textView;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView3);
        editText = findViewById(R.id.editText);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(MainActivity.this, "Successfull!", Toast.LENGTH_SHORT).show();
//                String s = editText.getText().toString();
//                double kmh = Double.parseDouble(s);
//                double ms = kmh/3.6;
//                textView.setText("The velocity is "+ms+" m/s");
//                ImageView img=(ImageView)findViewById(R.id.imageView3);
//                img.setVisibility(View.VISIBLE);
//            }
//        });
    }
    public void calculate(View view){
        Toast.makeText(MainActivity.this, "Successfull!", Toast.LENGTH_SHORT).show();
        String s = editText.getText().toString();
        double kmh = Double.parseDouble(s);
        double ms = kmh/3.6;
        textView.setText("The velocity is "+ms+" m/s");
        ImageView img=(ImageView)findViewById(R.id.imageView3);
        img.setVisibility(View.VISIBLE);
    }
}