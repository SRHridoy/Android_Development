package com.elitcoder.guessingmaster;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.lang.Math;
public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textView;
    private EditText editText;

    private int num;
    private int maxAttempts = 15;
    private int cnt = 0;
    private boolean gameWon = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        editText = findViewById(R.id.editTextNumber);
        textView = findViewById(R.id.textView4);

        num = generateRandomNumber();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!gameWon) {
                    String in = editText.getText().toString();

                    if (in.isEmpty()) {
                        // Handle empty input
                        return;
                    }

                    cnt++;
                    int input;
                    input = Integer.parseInt(in);

                    if (num == input) {
                        gameWon = true;
                        textView.setText("Congratulations! \n" + "You won in " + cnt + " attempts ");
                    } else if (input > num) {
                        textView.setText("Guess Again!\nLower number Please!");
                    } else {
                        textView.setText("Guess Again!\nHigher number Please!");
                    }

                    if (cnt >= maxAttempts && !gameWon) {
                        // Handle reaching maximum attempts
                        textView.setText("Sorry, you've reached the maximum number of attempts. The correct number was: " + num);
                        gameWon = true;
                    }
                }
            }
        });
    }

    private int generateRandomNumber() {
        return (int) (Math.random() * (1000 - 0 + 1) + 0);
    }
}
