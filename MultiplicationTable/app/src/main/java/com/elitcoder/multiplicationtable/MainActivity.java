package com.elitcoder.multiplicationtable;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText input;
    Button button;
    TextView output;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input = findViewById(R.id.input);
        output = findViewById(R.id.output);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num = Integer.parseInt(input.getText().toString());
                ArrayList<String> multiTable = new ArrayList<String>();
                for(int i = 1; i <= 10; i++){
                    int mul = num*i;
                    String s = num+" X " +i + " = " + mul;
                    multiTable.add(s);
                }
                //// Concatenate the strings in the ArrayList
                StringBuilder stringBuilder = new StringBuilder();
                for(String mul:multiTable){
                    stringBuilder.append(mul).append("\n");
                }
                output.setText(stringBuilder.toString());
            }
        });

    }
}