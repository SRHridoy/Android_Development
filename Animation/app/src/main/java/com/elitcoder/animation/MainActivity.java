package com.elitcoder.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ActionMode;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView;
        Button btnTranslate,btnRotate,btnAlpha,btnScale;
        btnTranslate = findViewById(R.id.btnTranslate);
        btnRotate = findViewById(R.id.btnRotate);
        btnAlpha = findViewById(R.id.btnAlpha);
        btnScale = findViewById(R.id.btnScale);
        textView = findViewById(R.id.txtView);

        btnTranslate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation move = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.move);
                textView.startAnimation(move);
            }
        });

        btnRotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation rotate = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate);
                textView.startAnimation(rotate);
            }
        });

        btnAlpha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation alpha = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.alpha);
                textView.startAnimation(alpha);
            }
        });

        btnScale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation scale = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.scale);
                textView.startAnimation(scale);
            }
        });

    }
}