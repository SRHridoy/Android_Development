package com.elitcoder.addtwonumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText n1,n2;
    TextView sum;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sum = findViewById(R.id.sum);
        n1 = findViewById(R.id.n1);
        n2 = findViewById(R.id.n2);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt(n1.getText().toString());
                int num2 = Integer.parseInt(n2.getText().toString());
                int result = num1  + num2;
                sum.setText("Sum of " + num1 +" and "+num2 +" is " +result);
            }
        });
    }
}