package com.elitcoder.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etFirstValue, etSecondValue;
    TextView tvAns;

    Button add,sub,mul,div;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etFirstValue = findViewById(R.id.etFirstValue);
        etSecondValue = findViewById(R.id.etSecondValue);

        tvAns = findViewById(R.id.tvAns);
        add = findViewById(R.id.btnAdd);
        sub = findViewById(R.id.btnSub);
        mul = findViewById(R.id.btnMul);
        div = findViewById(R.id.btnDiv);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstValue , secondValue, ans;
                firstValue = Integer.parseInt(etFirstValue.getText().toString());
                secondValue = Integer.parseInt(etSecondValue.getText().toString());

                ans = firstValue + secondValue;

                tvAns.setText("Summation is = " + ans);
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstValue , secondValue, ans;
                firstValue = Integer.parseInt(etFirstValue.getText().toString());
                secondValue = Integer.parseInt(etSecondValue.getText().toString());

                ans = firstValue - secondValue;

                tvAns.setText("Substraction is = " + ans);
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstValue , secondValue, ans;
                firstValue = Integer.parseInt(etFirstValue.getText().toString());
                secondValue = Integer.parseInt(etSecondValue.getText().toString());

                ans = firstValue * secondValue;

                tvAns.setText("Multiplication is = " + ans);
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstValue , secondValue, ans;
                firstValue = Integer.parseInt(etFirstValue.getText().toString());
                secondValue = Integer.parseInt(etSecondValue.getText().toString());

                ans = firstValue / secondValue;

                tvAns.setText("Division is = " + ans);
            }
        });
    }
}